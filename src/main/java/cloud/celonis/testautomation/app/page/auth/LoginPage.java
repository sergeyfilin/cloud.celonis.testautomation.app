package cloud.celonis.testautomation.app.page.auth;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.WhenPageOpens;

@At(urls={"#HOST/ui/login"})
public class LoginPage extends PageObject {

    @FindBy(css="input[cetestinguid='login-form-username-input']")
    private WebElementFacade USERNAME_INPUT;

    @FindBy(css="input[cetestinguid='login-form-password-input']")
    private WebElementFacade PASSWORD_INPUT;

    @FindBy(css="button[cetestinguid='login-form-submit-button']")
    private WebElementFacade SIGN_IN_BTN;

    @FindBy(css="a[cetestinguid='login-form-forgotPassword-link']")
    private WebElementFacade FORGOT_PASSWORD_LINK;

    @WhenPageOpens
    public void waitUntilTitleAppears() {
        element(SIGN_IN_BTN).waitUntilVisible();
    }

    public void typeUsername(String username){
        typeInto(USERNAME_INPUT, username);
    }

    public void typePassword(String password){
        typeInto(PASSWORD_INPUT, password);
    }

    public void clickSignInButton(){
        SIGN_IN_BTN.click();
    }

    public void clickForgotPasswordLink(){
        FORGOT_PASSWORD_LINK.click();
    }
}
