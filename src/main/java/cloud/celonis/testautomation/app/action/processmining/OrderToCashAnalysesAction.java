package cloud.celonis.testautomation.app.action.processmining;

import cloud.celonis.testautomation.app.page.processmining.OrderToCashAnalysesPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderToCashAnalysesAction extends ScenarioSteps {
    OrderToCashAnalysesPage page;

    @Step
    public OrderToCashAnalysesAction and(){return this;}

    @Step
    public OrderToCashAnalysesAction then(){return this;}

    @Step("Customer should see the order to cash explorer component on te analyses page")
    public void shouldSeeTheOrderToCashExplorerComponent(){
        assertThat(page.isExplorerComponentVisible()).
                withFailMessage("the the order to cash explorer component is not visible or not present").
                isTrue();
    }
}
