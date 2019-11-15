package cloud.celonis.testautomation.app.action.processmining;

import cloud.celonis.testautomation.app.page.processmining.ProcessMiningPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class WorkspaceAction extends ScenarioSteps {
    ProcessMiningPage page;

    @Step
    public String getWorkspaces(){
        return page.getWorkspacesList();
    }


}
