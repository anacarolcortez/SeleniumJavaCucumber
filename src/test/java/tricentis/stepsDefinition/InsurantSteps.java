package tricentis.stepsDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import tricentis.pages.InsurantPage;

import java.util.List;

public class InsurantSteps {

    InsurantPage insurantPage = new InsurantPage();

    @And("the user is sent to the Insurant Data form")
    public void theUserIsSentToTheInsurantDataForm() {
        insurantPage.validateInsurantPageTitle();
    }

    @And("the user submits Insurant Form correctly")
    public void theUserSubmitsInsurantFormCorrectly(DataTable table) {
        List<String> data = table.column(1);
        insurantPage.fillFirstNameField(data.get(0));
        insurantPage.fillLastNameField(data.get(1));
        insurantPage.fillBirthDateField(data.get(2));
        insurantPage.selectCountry(data.get(3));
        insurantPage.fillZipCodeField(data.get(4));
        insurantPage.selectOccupation(data.get(5));
        insurantPage.markHobbyCheckBox(data.get(6));
    }

    @And("the user presses the Next button in the Insurant Page")
    public void theUserPressesTheNextButtonInTheInsurantPage() {
        insurantPage.clickButtonNext();
    }

}