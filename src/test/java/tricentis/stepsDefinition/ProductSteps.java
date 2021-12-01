package tricentis.stepsDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import tricentis.pages.ProductPage;

import java.util.List;


public class ProductSteps {

    ProductPage productPage = new ProductPage();

    @And("the user is redirected to the Product Data form")
    public void theUserIsRedirectedToTheProductDataForm() {
        productPage.validateProductPageTitle();
    }

    @And("the user submits Product Form correctly")
    public void theUserSubmitsProductFormCorrectly(DataTable table) {
        List<String> data = table.column(1);
        productPage.fillStartDateField(data.get(0));
        productPage.selectInsuranceSum(data.get(1));
        productPage.selectMeritRating(data.get(2));
        productPage.selectdamageInsurance(data.get(3));
        productPage.markOptionCheckBox(data.get(4));
        productPage.selectCourtesyCar(data.get(5));
    }

    @And("the user presses the Next button in the Product Page")
    public void theUserPressesTheNextButtonInTheProductPage() {
        productPage.clickNextButton();
    }
}
