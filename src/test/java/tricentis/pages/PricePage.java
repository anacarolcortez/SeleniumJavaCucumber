package tricentis.pages;

import tricentis.locators.PriceLocators;
import tricentis.utils.Base;

public class PricePage extends Base {

    PriceLocators locators = new PriceLocators();

    String pricePageTitle = "Select Price Option";

    public void validatePricePageTitle(){
        validatePageTitle(pricePageTitle);
    }

    public void selectOption(String itemName){
        selectRadioButton(itemName, locators.selectOption);
    }

    public void clickNextButton(){
        clickButton(locators.nextButton);
    }

}
