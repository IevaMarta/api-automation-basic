package pages.pagesLib;

import io.cucumber.datatable.DataTable;
import io.restassured.response.ValidatableResponse;
import org.assertj.core.api.Assertions;
import java.util.Map;

import responses.UserLogInResponse;
import helpers.TestCaseContext;
import payloads.UserLogInPayload;

import static helpers.Logger.info;
import static helpers.TestCaseContext.JUICE_SHOP_CLIENT;
import responses.ChangePasswordResponse;

public class ChangePasswordPage extends BasePage {
  // Methods
  @Override
  public void doAction(String action, DataTable dataTable) {
    switch(action){
      case "change password": changePassword(dataTable); break;
      default      : super.doAction(action, dataTable);
    }
  }

  public void changePassword(DataTable dataTable) {
    Map<String, String> data = dataTable.transpose().asMaps().get(0);
    info("Changing password with the following data:\n" + data);

    ValidatableResponse response = JUICE_SHOP_CLIENT.getRestCalls().changePassword(data.get("Current Password"), data.get("New Password"), data.get("Repeat New Password"));
    response.statusCode(200);
    ChangePasswordResponse changePasswordResponse = response.extract().body().as(ChangePasswordResponse.class);
    info(changePasswordResponse.getPassword());
    //Assertions.assertThat(changePasswordResponse.getPassword() == data.get("New Password")).isTrue();
  }
  
}
