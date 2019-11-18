package cloud.celonis.testautomation.app.page.processmining;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

@At(urls={"#HOST/process-mining/analysis/"})
public class ServiceNowAnalysesPage extends PageObject {
    @FindBy(css="div[data-testing-uid='text-component-text']")
    private WebElementFacade ANALYSES_NAME;

    @FindBy(css="div[data-testing-uid='variantExplorer-component-variantExplorerComponent']")
    private WebElementFacade EXPLORER_COMPONENT;

    @FindBy(css="div.variant-explorer__view-options>select")
    private WebElementFacade EXPLORE_MODEL_SELECTOR;

    private By EXPLORER_HISTOGRAM_CHARTS = By.cssSelector("div.variant-explorer__histogram g.wk-chart-label-area text.wk-chart-label-text");

    @WhenPageOpens
    public void waitUntilTitleAppears() {
        element(ANALYSES_NAME).waitUntilVisible();
    }

    public boolean isExplorerComponentVisible(){
        return EXPLORER_COMPONENT.isVisible();
    }

    public void selectExploreModel(String model){
        EXPLORE_MODEL_SELECTOR.selectByVisibleText(model);
    }

    public List<String> getHistogramChartList(){
        return findAll(EXPLORER_HISTOGRAM_CHARTS).
                stream().
                map(WebElementFacade::getTextContent).
                collect(Collectors.toList());
    }
}
