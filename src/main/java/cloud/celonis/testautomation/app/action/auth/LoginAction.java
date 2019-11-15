package cloud.celonis.testautomation.app.action.auth;

import cloud.celonis.testautomation.app.page.auth.LoginPage;
import cloud.celonis.testautomation.app.testdata.Credentials;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginAction extends ScenarioSteps {

    LoginPage page;

    @Step
    public void loginTheApp(Credentials credentials){
        page.open();
        page.typeUsername(credentials.getUsername());
        page.typePassword(credentials.getPassword());
        page.clickSignInButton();
    }
}
