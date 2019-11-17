package cloud.celonis.testautomation.app.page.processmining;


import cloud.celonis.testautomation.app.page.element.WorkspaceList;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.WhenPageOpens;

@At(urls={"#HOST/process-mining/ui"})
public class ProcessMiningPage extends PageObject {

    @FindBy(css=".workspaces")
    private WebElementFacade WORK_SPACES;

    @WhenPageOpens
    public void waitUntilTitleAppears() {
        element(WORK_SPACES).waitUntilVisible();
    }

    public WorkspaceList getWorkspaceList(){
        return new WorkspaceList(WORK_SPACES);
    }
}
