package stepdefinitions;

import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;

import pages.PageManager;

public class validationSteps {
  @Then("I see {string} in {string} page with following data:")
  public void i_see_in_page_with_following_data(String action, String page, DataTable dataTable) {
    PageManager.getPage(page).doAction(action, dataTable);
  }

  @Then("I see {string} in {string} page")
  public void i_see_in_page(String action, String page) {
    PageManager.getPage(page).doAction(action);
  }
}
