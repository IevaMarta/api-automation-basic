package pages.pagesLib;

import responses.AddressResponse;
import responses.BasketResponse;
import responses.ProductInfo;
import responses.UserLogInResponse;
import helpers.TestCaseContext;
import io.cucumber.datatable.DataTable;
import io.restassured.response.ValidatableResponse;
import java.util.ArrayList;
import java.util.List;
import org.assertj.core.api.Assertions;

import static helpers.Logger.info;
import static helpers.TestCaseContext.JUICE_SHOP_CLIENT;

public class BasketPage extends BasePage {
  // Methods
  @Override
  public void doAction(String action) {
    switch (capitalizeSecond(action)){
      case "checkout": checkout(); break;
      case "emptyBasket": validateEmptyBasket(); break;
      default        : super.doAction(action);
    }
  }

  @Override
  public void doAction(String action, DataTable dataTable) {
    switch (capitalizeSecond(action)){
      case "deleteItems": deleteItems(dataTable); break;
      default           : super.doAction(action);
    }
  }

  public void validateEmptyBasket(){
    UserLogInResponse user = (UserLogInResponse) TestCaseContext.getLedger().get("loggedInUser");
    ValidatableResponse response = JUICE_SHOP_CLIENT.getRestCalls().getBasketItems(user.getBid());
    response.statusCode(200);
    BasketResponse basketResponse = response.extract().body().as(BasketResponse.class);
    Assertions.assertThat(basketResponse.getProductInfos().size() == 0).isTrue();
  }

  public void deleteItems(DataTable dataTable){
    List<List<String>> data = dataTable.asLists(String.class);
    List<String> names = new ArrayList();
    for (List<String> el : data) {
      names.add(el.get(1));
    }

    UserLogInResponse user = (UserLogInResponse) TestCaseContext.getLedger().get("loggedInUser");
    ValidatableResponse response = JUICE_SHOP_CLIENT.getRestCalls().getBasketItems(user.getBid());
    response.statusCode(200);
    BasketResponse basketResponse = response.extract().body().as(BasketResponse.class);
    for (ProductInfo productInfo : basketResponse.getProductInfos()) {
      if(names.contains(productInfo.getName())){
        ValidatableResponse deleteResponse = JUICE_SHOP_CLIENT.getApiCalls().deleteBasketItem(productInfo.getBasketItem().getId());
        deleteResponse.statusCode(200);
      }
    }
  }

  public void checkout(){
    info("Performing checkout");
    ValidatableResponse response = JUICE_SHOP_CLIENT.getApiCalls().checkout();
    response.statusCode(200);
    AddressResponse addressResponse = response.extract().body().as(AddressResponse.class);
    TestCaseContext.getLedger().put("addressResponse", addressResponse);
  }
}
