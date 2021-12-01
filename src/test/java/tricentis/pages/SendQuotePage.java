package tricentis.pages;

import tricentis.locators.SendQuoteLocators;
import tricentis.utils.Base;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SendQuotePage extends Base {

    SendQuoteLocators locators = new SendQuoteLocators();

    String sendQuoteTitleId = "Send Quote";

    public void validateSendQuoteTitle(){
        validatePageTitle(sendQuoteTitleId);
    }

    public void fillEmailField(String text){
        sendText(text, locators.email);
    }

    public void fillUserNameField(String text){
        sendText(text, locators.userName);
    }

    public void fillpassWordField(String text){
        sendText(text, locators.password);
    }

    public void fillConfirmPassWordField(String text){
        sendText(text, locators.confirmPassword);
    }

    public void clickSendButton(){
        clickButton(locators.sendButton);
    }

    public void clickOKButton(){
        clickButton(locators.okButton);
    }

    public void validateSucessMessage(String message){
        String elementText = getMessageFromElement(locators.dialogBox);
        assertEquals(elementText, message);
    }
}
