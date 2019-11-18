package cloud.celonis.testautomation.app.page.element;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class WorkspaceAnalyses {
    private WebElementFacade root;

    private By OVERVIEW = By.cssSelector("div.workspace-section");

    public WorkspaceAnalyses(WebElementFacade root) {
        this.root = root;
    }

    public void selectOverview(String workspace){
        root.find(OVERVIEW).waitUntilVisible().
                then().find(By.cssSelector(String.format("a[data-testing-uid*='analysisListComponent-analysisName-%s']", workspace))).
                then().
                click();
    }

    public boolean isWorkspaceAnalysesVisible(){
        return root.find(OVERVIEW).isVisible();
    }

}
