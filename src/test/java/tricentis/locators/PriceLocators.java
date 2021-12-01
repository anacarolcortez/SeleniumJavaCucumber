package tricentis.locators;

import org.openqa.selenium.By;

public class PriceLocators {
    public By selectOption = By.xpath("//label[contains(@class, 'choosePrice')]");
    public By nextButton = By.id("nextsendquote");
}
