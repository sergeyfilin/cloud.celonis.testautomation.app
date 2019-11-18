package cloud.celonis.testautomation.app.page.processmining;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.WhenPageOpens;

@At(urls={"#HOST/process-mining/analysis/"})
public class ServiceNowAnalysesPage extends PageObject {
    @FindBy(css="div[data-testing-uid='text-component-text']")
    private WebElementFacade ANALYSES_NAME;

    @FindBy(css="div[data-testing-uid='variantExplorer-component-variantExplorerComponent']")
    private WebElementFacade EXPLORER_COMPONENT;

    @WhenPageOpens
    public void waitUntilTitleAppears() {
        element(ANALYSES_NAME).waitUntilVisible();
    }

    public boolean isExplorerComponentVisible(){
        return EXPLORER_COMPONENT.isVisible();
    }
}
