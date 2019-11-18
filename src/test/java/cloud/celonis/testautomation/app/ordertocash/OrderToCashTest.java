package cloud.celonis.testautomation.app.ordertocash;

import cloud.celonis.testautomation.app.AbstractTest;
import cloud.celonis.testautomation.app.testdata.Credentials;
import cloud.celonis.testautomation.app.testdata.Profile;
import cloud.celonis.testautomation.app.testdata.ProfileProvider;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issues;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
@WithTagValuesOf({"analyses", "order_to_cash"})
public class OrderToCashTest extends AbstractTest {
    private final Profile expectedProfile = ProfileProvider.provideDefaultCustomer();
    private final Credentials credentials = expectedProfile.getCredentials();

    @Test
    @Issues({"CELONIS-3"})
    public void checkThatCustomerIsAbleToAccessOrderToCashAnalyses(){
        customer.goToTheWebSite().
                then().
                onTheSignInPage().
                loginTheApp(credentials.getUsername(), credentials.getPassword());

        customer.inTheWorkSpaceMenu().selectOrderToCashWorkspace();

        customer.onTheWorkSpaceAnalyses().selectOrderToCashOverview();

        customer.onOrderToCashAnalyses().shouldSeeTheOrderToCashExplorerComponent();
    }

}
