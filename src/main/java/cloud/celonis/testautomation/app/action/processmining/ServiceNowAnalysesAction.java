package cloud.celonis.testautomation.app.action.processmining;

import cloud.celonis.testautomation.app.page.processmining.ServiceNowAnalysesPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class ServiceNowAnalysesAction extends ScenarioSteps {
    ServiceNowAnalysesPage page;

    @Step
    public ServiceNowAnalysesAction and(){return this;}

    @Step
    public ServiceNowAnalysesAction then(){return this;}

    @Step("Customer should see the service now explorer component on te analyses page")
    public void shouldSeeTheServiceNowExplorerComponent(){
        assertThat(page.isExplorerComponentVisible()).
                withFailMessage("the the service now explorer component is not visible or not present").
                isTrue();
    }
}
