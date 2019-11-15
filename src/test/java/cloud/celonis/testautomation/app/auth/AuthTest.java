package cloud.celonis.testautomation.app.auth;

import cloud.celonis.testautomation.app.AbstractTest;
import cloud.celonis.testautomation.app.testdata.Profile;
import cloud.celonis.testautomation.app.testdata.ProfileProvider;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class AuthTest extends AbstractTest {

    @Test
    public void checkThatCustomerIsAbleToLogin(){
        Profile expectedProfile = ProfileProvider.provideDefaultCustomer();
        customer.onTheSignInPage().loginTheApp(expectedProfile.getCredentials());
        String str = customer.inTheWorksSpaceMenu().getWorkspaces();

        //todo validation

    }
}
