package tricentis.pages;

import tricentis.locators.ProductLocators;
import tricentis.utils.Base;

public class ProductPage extends Base {

    ProductLocators locators = new ProductLocators();

    String productPageTitle = "Enter Product Data";

    public void validateProductPageTitle(){
        validatePageTitle(productPageTitle);
    }

    public void fillStartDateField(String text){
        sendText(text, locators.startDate);
    }

    public void selectInsuranceSum(String text){ selectItem(text, locators.insuranceSum);}

    public void selectMeritRating(String text){ selectItem(text, locators.meritRating);}

    public void selectdamageInsurance(String text){ selectItem(text, locators.damageInsurance);}

    public void markOptionCheckBox(String itemName){
        markCheckbox(itemName, locators.optionsCheckList);
    }

    public void selectCourtesyCar(String text){ selectItem(text, locators.courtesyCar);}

    public void clickNextButton(){
        clickButton(locators.nextButton);
    }
}
