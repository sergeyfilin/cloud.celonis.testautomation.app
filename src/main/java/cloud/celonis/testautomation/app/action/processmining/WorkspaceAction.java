package cloud.celonis.testautomation.app.action.processmining;

import cloud.celonis.testautomation.app.page.processmining.ProcessMiningPage;
import cloud.celonis.testautomation.app.testdata.Workspace;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class WorkspaceAction extends ScenarioSteps {
    ProcessMiningPage page;

    @Step
    public WorkspaceAction and(){return this;}

    @Step
    public WorkspaceAction then(){return this;}

    @Step("Customer select '--> SAP ECC - Order to Cash' workspace")
    public WorkspaceAction selectOrderToCashWorkspace(){
        page.getWorkspaceList().selectWorkspace(Workspace.ORDER_TO_CASH.getSpace());
        return this;
    }

    @Step("Customer select '--> SAP ECC - Purchase to Pay' workspace")
    public WorkspaceAction selectPurchaseToPayWorkspace(){
        page.getWorkspaceList().selectWorkspace(Workspace.PURCHASE_TO_PAY.getSpace());
        return this;
    }

    @Step("Customer select '--> ServiceNow Ticketing' workspace")
    public WorkspaceAction selectServiceNowWorkspace(){
        page.getWorkspaceList().selectWorkspace(Workspace.SERVICE_NOW.getSpace());
        return this;
    }

    @Step("Customer should see the workspace list on the main page")
    public void shouldSeeTheWorkspaceList(){
        assertThat(page.getWorkspaceList().isWorkspaceListVisible()).
                withFailMessage("the workspace list is not visible or not present").
                isTrue();
    }

    @Step("Customer select '--> SAP ECC - Order to Cash' analyses overview")
    public WorkspaceAction selectOrderToCashOverview(){
        page.getWorkspaceAnalyses().selectOverview(Workspace.ORDER_TO_CASH.getSpace());
        return this;
    }

    @Step("Customer select '--> SAP ECC - Purchase to Pay' analyses overview")
    public WorkspaceAction selectPurchaseToPayOverview(){
        page.getWorkspaceAnalyses().selectOverview(Workspace.PURCHASE_TO_PAY.getSpace());
        return this;
    }

    @Step("Customer select '--> ServiceNow Ticketing' analyses overview")
    public WorkspaceAction selectServiceNowOverview(){
        page.getWorkspaceAnalyses().selectOverview(Workspace.SERVICE_NOW.getSpace());
        return this;
    }

    @Step("Customer should see the workspace analyses on the main page")
    public void shouldSeeTheWorkspaceAnalyses(){
        assertThat(page.getWorkspaceAnalyses().isWorkspaceAnalysesVisible()).
                withFailMessage("the workspace analyses overview is not visible or not present").
                isTrue();
    }


}
