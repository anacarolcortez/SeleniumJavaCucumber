package tricentis.locators;

import org.openqa.selenium.By;

public class InsurantLocators {
    public By hobbiesCheckList = By.xpath("//div[contains(@class, 'idealforms-field-checkbox')]/label[contains(., 'Hobbies')]/../p/label");
    public By firstName = By.id("firstname");
    public By lastName = By.id("lastname");
    public By birthDate = By.id("birthdate");
    public By zipcode = By.id("zipcode");
    public By nextButton = By.id("nextenterproductdata");
    public By countryList = By.id("country");
    public By occupationList = By.id("occupation");

}
