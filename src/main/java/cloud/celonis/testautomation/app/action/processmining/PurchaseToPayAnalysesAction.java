package cloud.celonis.testautomation.app.action.processmining;

import cloud.celonis.testautomation.app.page.processmining.PurchaseToPayAnalysesPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class PurchaseToPayAnalysesAction extends ScenarioSteps {
    PurchaseToPayAnalysesPage page;

    @Step
    public PurchaseToPayAnalysesAction and(){return this;}

    @Step
    public PurchaseToPayAnalysesAction then(){return this;}

    @Step("Customer should see the purchase to pay explorer component on te analyses page")
    public PurchaseToPayAnalysesAction shouldSeeThePurchaseToPayExplorerComponent(){
        assertThat(page.isExplorerComponentVisible()).
                withFailMessage("the the purchase to pay explorer component is not visible or not present").
                isTrue();
        return this;
    }
}
