package cloud.celonis.testautomation.app.action.auth;

import cloud.celonis.testautomation.app.page.auth.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginAction extends ScenarioSteps {

    LoginPage page;

    @Step
    public LoginAction and(){return this;}

    @Step
    public LoginAction then(){return this;}

    @Step("Customer sign in the app with username {0} and password {1}")
    public LoginAction loginTheApp(String username, String password){
        page.typeUsername(username);
        page.typePassword(password);
        page.clickSignInButton();
        return this;
    }

    @Step
    public LoginAction openTheSignInPage(){
        page.open();
        return this;
    }
}
