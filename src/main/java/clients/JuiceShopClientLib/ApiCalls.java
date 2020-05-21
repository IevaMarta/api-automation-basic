package clients.JuiceShopClientLib;

import io.restassured.response.ValidatableResponse;

import payloads.BasketItemsPayload;
import payloads.UserRegistrationPayload;

public class ApiCalls extends BaseCalls {
  // Variables
  private static final String API_USERS_ = "api/Users/";
  private static final String API_ADDRESS =  "api/Addresss";
  private static final String API_ADDRESS_ = "api/Addresss/";
  private static final String API_BASKET_ITEMS = "api/BasketItems";
  private static final String API_BASKET_ITEMS_ = "api/BasketItems/";
  private static final String API_DELIVERYS = "api/Deliverys";
  private static final String API_DELIVERYS_ = "api/Deliverys/";
  private static final String API_CARDS = "api/Cards";
  private static final String API_CARDS_ = "api/Cards/";
  //  Methods
  public ValidatableResponse createUser(UserRegistrationPayload payload){
    return post(API_USERS_, payload);
  }
  public ValidatableResponse addToBasket(BasketItemsPayload payload){
    return post(API_BASKET_ITEMS, payload);
  }
  public ValidatableResponse deleteBasketItem(Integer id){
    return delete(API_BASKET_ITEMS_ + id);
  }
  public ValidatableResponse checkout(){
    return get(API_ADDRESS);
  }
  public ValidatableResponse checkAddress(Integer id) { 
    return get(API_ADDRESS_ + id); 
  }
  public ValidatableResponse getDeliveries(){
    return get(API_DELIVERYS);
  }
  public ValidatableResponse checkDelivery(Integer id) {
    return get(API_DELIVERYS_ + id);
  }
  public ValidatableResponse getCards(){
    return get(API_CARDS);
  }
  public ValidatableResponse checkCard(Integer id){
    return get(API_CARDS_ + id);
  }
}
