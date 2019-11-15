package cloud.celonis.testautomation.app.step;

import cloud.celonis.testautomation.app.action.auth.LoginAction;
import cloud.celonis.testautomation.app.action.processmining.WorkspaceAction;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class CustomerStep extends ScenarioSteps {

    @Steps
    LoginAction loginAction;

    @Steps
    WorkspaceAction workspaceAction;

    @Step
    public LoginAction onTheSignInPage(){
        return loginAction;
    }

    @Step
    public WorkspaceAction inTheWorksSpaceMenu(){
        return workspaceAction;
    }

}
