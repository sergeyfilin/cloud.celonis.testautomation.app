package cloud.celonis.testautomation.app.auth;

import cloud.celonis.testautomation.app.AbstractTest;
import cloud.celonis.testautomation.app.testdata.Credentials;
import cloud.celonis.testautomation.app.testdata.Profile;
import cloud.celonis.testautomation.app.testdata.ProfileProvider;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issues;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
@WithTagValuesOf({"authorization"})
public class AuthTest extends AbstractTest {

    @Test
    @WithTagValuesOf({"smoke"})
    @Issues({"CELONIS-1", "CELONIS-2"})
    @Title("The customer should be able to login the app and see the workspace list")
    public void checkThatCustomerIsAbleToLogin(){
        Profile expectedProfile = ProfileProvider.provideDefaultCustomer();
        Credentials credentials = expectedProfile.getCredentials();

        customer.goToTheWebSite().
                then().
                onTheSignInPage().
                loginTheApp(credentials.getUsername(), credentials.getPassword());

        customer.inTheWorkSpaceMenu().shouldSeeTheWorkspaceList();
    }
}
