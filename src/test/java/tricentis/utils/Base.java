package tricentis.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Base extends DriverFatory {

    //Classe responsável por administrar os métodos comuns para as Page Objects
    private static WebDriverWait driverWait;

    protected WebDriverWait getDriverWait(){
        driverWait = new WebDriverWait(getDriver(), 15);
        return driverWait;
    }

    protected void sendText(String text, By locator){
        WebElement inputText = getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
        inputText.sendKeys(text);
    }

    protected void clickButton(By locator){
        WebElement button = getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
        button.click();
    }

    protected void selectItem(String text, By locator){
        WebElement selectList = getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
        Select selectedItem = new Select(selectList);
        selectedItem.selectByValue(text);
    }

    protected void validatePageTitle(String pageName){
        String pageTitle = getDriver().getTitle();
        assertEquals(pageTitle,pageName);
    }

    protected void markCheckbox(String itemName, By locator){
        List<WebElement> checkList = getDriverWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        for(WebElement check : checkList) {
            if (check.getText().contains(itemName)){
                check.findElement(By.tagName("span")).click();
                break;
            }
        }
    }

    protected void selectRadioButton(String itemName, By locator){
        List<WebElement> options = getDriverWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        for(WebElement option : options) {
            WebElement radioBtn = option.findElement(By.tagName("input"));
            if (radioBtn.getAttribute("value").contains(itemName)){
                option.click();
                break;
            }
        }
    }

    protected String getMessageFromElement(By locator){
        WebElement dialog = getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
        return dialog.getText();
    }

    protected String getDateAndTime(){
        SimpleDateFormat formatoDeData = new SimpleDateFormat("dd/MM/yy HH:mm");
        return formatoDeData.format(new Date());
    }
}