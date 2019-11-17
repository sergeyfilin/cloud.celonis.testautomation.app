package cloud.celonis.testautomation.app.page.element;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class WorkspaceList {
    private WebElementFacade root;

    private By LIST = By.cssSelector(".workspaces__list");

    public WorkspaceList(WebElementFacade root) {
        this.root = root;
    }

    public void selectWorkspace(String name){
        root.find(LIST).waitUntilVisible().
                then().find(By.cssSelector(String.format("a[title='--> %s']", name))).
                then().
                click();
    }

    public boolean isWorkspaceListVisible(){
        return root.find(LIST).isVisible();
    }

}
