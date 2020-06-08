package pages;

import pages.pagesLib.*;

public class PageManager {
    // Variables
    private static RegistrationPage registrationPage = new RegistrationPage();
    private static LoginPage loginPage = new LoginPage();
    private static HomePage homePage = new HomePage();
    private static SearchPage searchPage = new SearchPage();
    private static BasketPage basketPage = new BasketPage();
    private static AddressPage addressPage = new AddressPage();
    private static DeliveryOptionsPage deliveryOptionsPage = new DeliveryOptionsPage();
    private static PaymentOptionsPage paymentOptionsPage = new PaymentOptionsPage();
    private static OrderCompletionPage orderCompletionPage = new OrderCompletionPage();
    private static ChangePasswordPage changePasswordPage = new ChangePasswordPage();
    // Methods
    public static BasePage getPage(String page){
        switch(page.toLowerCase()){
            case "registration"    : return registrationPage;
            case "login"           : return loginPage;
            case "home"            : return homePage;
            case "search"          : return searchPage;
            case "basket"          : return basketPage;
            case "address"         : return addressPage;
            case "delivery options": return deliveryOptionsPage;
            case "payment options" : return paymentOptionsPage;
            case "order completion": return orderCompletionPage;
            case "change password" : return changePasswordPage;
            default                : throw new Error(page + " is undefined");
        }
    }
}
