package cloud.celonis.testautomation.app.page.processmining;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.WhenPageOpens;

@At(urls={"#HOST/process-mining/ui"})
public class ProcessMiningPage extends PageObject {

    @FindBy(css=".workspaces__list")
    private WebElementFacade WORK_SPACES_LIST;

    @WhenPageOpens
    public void waitUntilTitleAppears() {
        element(WORK_SPACES_LIST).waitUntilVisible();
    }

    public String getWorkspacesList(){
        return WORK_SPACES_LIST.getTextContent();
    }
}
