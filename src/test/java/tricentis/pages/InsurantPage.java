package tricentis.pages;

import tricentis.locators.InsurantLocators;
import tricentis.utils.Base;

public class InsurantPage extends Base {

    InsurantLocators locators = new InsurantLocators();

    String insurancePageTitle = "Enter Insurant Data";

    public void validateInsurantPageTitle(){
        validatePageTitle(insurancePageTitle);
    }

    public void fillFirstNameField(String text){
        sendText(text, locators.firstName);
    }

    public void fillLastNameField(String text){
        sendText(text, locators.lastName);
    }

    public void fillBirthDateField(String text){
        sendText(text, locators.birthDate);
    }

    public void markHobbyCheckBox(String itemName){
        markCheckbox(itemName, locators.hobbiesCheckList);
    }

    public void fillZipCodeField(String text){
        sendText(text, locators.zipcode);
    }

    public void clickButtonNext(){
        clickButton(locators.nextButton);
    }

    public void selectCountry(String countryName){
        selectItem(countryName, locators.countryList);
    }

    public void selectOccupation(String occupation){
        selectItem(occupation, locators.occupationList);
    }

}
