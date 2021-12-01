package tricentis.stepsDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import tricentis.pages.VehiclePage;

import java.util.List;

public class VehicleSteps {

    VehiclePage vehiclePage = new VehiclePage();

    @Given("the user selected the Automobile Insurance menu")
    public void theUserSelectedTheAutomobileInsuranceMenu() {
        vehiclePage.clickAutomobileMenu();
    }

    @And("the user is in the Vehicle Data Form")
    public void the_user_is_in_the_Vehicle_Data_Form(){
        vehiclePage.validateVehiclePageTitle();
    }

    @And("the user submits Vehicle Form correctly")
    public void theUserSubmitsVehicleFormCorrectly(DataTable table) {
        List<String> data = table.column(1);
        vehiclePage.selectMakeItem(data.get(0));
        vehiclePage.fillEnginePerformanceField(data.get(1));
        vehiclePage.fillDateOfManufactureField(data.get(2));
        vehiclePage.selectNumberOfSeats(data.get(3));
        vehiclePage.selectFuelType(data.get(4));
        vehiclePage.fillListPriceField(data.get(5));
        vehiclePage.fillAnnualMileageField(data.get(6));
    }

    @And("the user presses the Next button in the Vehicle Page")
    public void theUserPressesTheNextButtonInTheVehiclePage() {
        vehiclePage.clickNextButton();
    }

}