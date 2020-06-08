package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PageManager;
import io.cucumber.datatable.DataTable;

public class actionSteps {
  @When("I {string} in {string} page with the following data:")
  public void i_in_page_with_the_following_data(String action, String page, DataTable dataTable) {
    PageManager.getPage(page).doAction(action, dataTable);
  }

  @When("I search for {string}")
  public void i_search_for(String productName) {
    PageManager.getPage("Home").doAction("search for", productName);
  }

  @Then("I log in with the following data:")
  public void i_log_in_with_the_following_data(DataTable dataTable) {
    PageManager.getPage("Login").doAction("log in", dataTable);
  }

  @And("I add {string} to the basket")
  public void iAddToTheBasket(String product) {
    PageManager.getPage("Home").doAction("search for", product);
    PageManager.getPage("Search").doAction("Add to basket", product);
  }

  @And("I choose delivery address {string}")
  public void iChooseAddress(String address) {
    PageManager.getPage("Basket").doAction("checkout");
    PageManager.getPage("Address").doAction("choose delivery address", address);
  }

  @And("I choose delivery option {string}")
  public void iChooseDeliverySpeed(String option) {
    PageManager.getPage("Delivery options").doAction("get delivery options");
    PageManager.getPage("Delivery options").doAction("choose delivery option", option);
  }

  @And("I choose payment card {string}")
  public void iChoosePaymentCard(String cardNumber) {
    PageManager.getPage("Payment options").doAction("get payment options");
    PageManager.getPage("Payment options").doAction("choose payment option", cardNumber);
  }

  @And("I checkout the order")
  public void iCheckoutTheOrder() {
    PageManager.getPage("order completion").doAction("checkout order");
  }

  @When("I try to log in with the following data:")
  public void i_try_to_log_in_with_the_following_data(DataTable dataTable) {
    PageManager.getPage("Login").doAction("try to log in", dataTable);
  }

  @And("I change password with the following data:")
  public void i_change_password_with_the_following_data(DataTable dataTable) {
    PageManager.getPage("Change password").doAction("change password", dataTable);
  }

}
