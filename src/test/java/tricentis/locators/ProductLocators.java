package tricentis.locators;

import org.openqa.selenium.By;

public class ProductLocators {
    public By startDate = By.id("startdate");
    public By insuranceSum = By.id("insurancesum");
    public By meritRating = By.id("meritrating");
    public By damageInsurance = By.id("damageinsurance");
    public By optionsCheckList = By.xpath("//div[contains(@class, 'idealforms-field-checkbox')]/label[contains(., 'Optional Products')]/../p/label");
    public By courtesyCar = By.id("courtesycar");
    public By nextButton = By.id("nextselectpriceoption");
}
