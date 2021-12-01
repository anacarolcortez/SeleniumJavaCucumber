package tricentis.pages;

import tricentis.locators.VehicleLocators;
import tricentis.utils.Base;

public class VehiclePage extends Base {

    VehicleLocators locators = new VehicleLocators();

    String vehiclePageTitle = "Enter Vehicle Data";

    public void validateVehiclePageTitle(){
        validatePageTitle(vehiclePageTitle);
    }

    public void clickAutomobileMenu(){
        clickButton(locators.automobileMenu);
    }

    public void fillEnginePerformanceField(String text){
        sendText(text, locators.enginePerformance);
    }

    public void fillDateOfManufactureField(String text){
        sendText(text, locators.dateOfManufacture);
    }

    public void fillListPriceField(String text){
        sendText(text, locators.listPrice);
    }

    public void fillAnnualMileageField(String text){
        sendText(text, locators.annualMileage);
    }

    public void clickNextButton(){
        clickButton(locators.nextButton);
    }

    public void selectMakeItem(String text){
        selectItem(text, locators.makeList);
    }

    public void selectNumberOfSeats(String text){
        selectItem(text, locators.numberOfSeats);
    }

    public void selectFuelType(String text){
        selectItem(text, locators.fuelType);
    }

}
