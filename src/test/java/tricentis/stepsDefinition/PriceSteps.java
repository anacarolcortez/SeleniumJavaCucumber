package tricentis.stepsDefinition;

import io.cucumber.java.en.And;
import tricentis.pages.PricePage;

public class PriceSteps {

    PricePage pricePage = new PricePage();

    @And("the user is sent to the Price Form")
    public void theUserIsSentToThePriceForm() {
        pricePage.validatePricePageTitle();
    }

    @And("the user selects the option {string} for the insurance")
    public void theUserSelectsTheOptionForTheInsurance(String option) {
        pricePage.selectOption(option);
    }

    @And("the user presses the Next button in the Price Page")
    public void theUserPressesTheNextButtonInThePricePage() {
        pricePage.clickNextButton();
    }
}
