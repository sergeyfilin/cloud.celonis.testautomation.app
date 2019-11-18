package cloud.celonis.testautomation.app.servicenow;

import cloud.celonis.testautomation.app.AbstractTest;
import cloud.celonis.testautomation.app.testdata.Credentials;
import cloud.celonis.testautomation.app.testdata.Profile;
import cloud.celonis.testautomation.app.testdata.ProfileProvider;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issues;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(SerenityRunner.class)
@WithTagValuesOf({"analyses", "service_now"})
public class ServiceNowTest extends AbstractTest {
    private final Profile expectedProfile = ProfileProvider.provideDefaultCustomer();
    private final Credentials credentials = expectedProfile.getCredentials();

    @Test
    @WithTagValuesOf({"smoke1"})
    @Issues({"CELONIS-5"})
    public void checkThatCustomerIsAbleToAccessServiceNowAnalyses(){
        customer.goToTheWebSite().
                then().
                onTheSignInPage().
                loginTheApp(credentials.getUsername(), credentials.getPassword());

        customer.inTheWorkSpaceMenu().selectServiceNowWorkspace();

        customer.onTheWorkSpaceAnalyses().selectServiceNowOverview();

        customer.onServiceNowAnalyses().shouldSeeTheServiceNowExplorerComponent();

        customer.onServiceNowAnalyses().selectShortestThroughputTimeAsExploreOptions().
                then().
                shouldSeeTheTimeOfShortestThroughputNotZero();
    }

}
