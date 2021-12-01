package tricentis.locators;

import org.openqa.selenium.By;

public class SendQuoteLocators {

    public By email = By.id("email");
    public By userName= By.id("username");
    public By password = By.id("password");
    public By confirmPassword = By.id("confirmpassword");
    public By sendButton = By.id("sendemail");
    public By dialogBox = By.xpath("//div[contains(@class, 'showSweetAlert')]//h2");
    public By okButton = By.xpath("//div[contains(@class, 'showSweetAlert')]//button[contains(., 'OK')]");
}
