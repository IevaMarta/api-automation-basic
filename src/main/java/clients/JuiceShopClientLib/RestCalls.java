package clients.JuiceShopClientLib;

import io.restassured.response.ValidatableResponse;
import payloads.BasketCheckoutPayload;
import payloads.UserLogInPayload;

public class RestCalls extends BaseCalls {
  // Variables
  private static final String REST_USER_LOGIN = "rest/user/login";
  private static final String REST_PRODUCTS_SEARCH = "rest/products/search?q=";
  private static final String REST_BASKET_ = "rest/basket/";
  private static final String _CHECKOUT = "/checkout";
  private static final String REST_TRACK_ORDER = "rest/track-order/";
  private static final String REST_CHANGE_PASSWORD = "rest/user/change-password?";
  // Methods
  public ValidatableResponse logIn(UserLogInPayload payload){
    return post(REST_USER_LOGIN, payload);
  }
  public ValidatableResponse searchFor(String str){
    return get(REST_PRODUCTS_SEARCH + str);
  }
  public ValidatableResponse checkoutBasket(Integer bid, BasketCheckoutPayload payload){
    return post(REST_BASKET_ + bid + _CHECKOUT, payload);
  }
  public ValidatableResponse getTrackOrder(String orderId){
    return get(REST_TRACK_ORDER + orderId);
  }
  public ValidatableResponse getBasketItems(Integer basketId){
    return get(REST_BASKET_ + basketId);
  }
  public ValidatableResponse changePassword(String currentPassword, String newPassword, String repeatPassword) {
    return get(REST_CHANGE_PASSWORD + "current=" + currentPassword + "&new=" + newPassword + "&repeat=" + repeatPassword);
  }
}
