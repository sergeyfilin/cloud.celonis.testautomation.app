package cloud.celonis.testautomation.app.action.processmining;

import cloud.celonis.testautomation.app.page.processmining.ServiceNowAnalysesPage;
import cloud.celonis.testautomation.app.testdata.ExploreOption;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ServiceNowAnalysesAction extends ScenarioSteps {
    ServiceNowAnalysesPage page;

    @Step
    public ServiceNowAnalysesAction and(){return this;}

    @Step
    public ServiceNowAnalysesAction then(){return this;}

    @Step("Customer should see the service now explorer component on te analyses page")
    public ServiceNowAnalysesAction shouldSeeTheServiceNowExplorerComponent(){
        assertThat(page.isExplorerComponentVisible()).
                withFailMessage("the the service now explorer component is not visible or not present").
                isTrue();
        return this;
    }

    @Step
    public ServiceNowAnalysesAction selectShortestThroughputTimeAsExploreOptions(){
        page.selectExploreModel(ExploreOption.SHORTEST_TIME.getOption());
        page.waitFor(3);
        return this;
    }

    @Step
    public List<String> getShortestThroughputTimeExploreCharts(){
        return page.getHistogramChartList();
    }

    @Step("Shortest Throughput Time should not be 0.0h")
    public ServiceNowAnalysesAction shouldSeeTheTimeOfShortestThroughputNotZero(){
        List<String> timeList = page.getHistogramChartList();
        assertThat(timeList.stream().filter(s -> s.equals("0.0h")).findFirst().orElse(null)).
                withFailMessage("Shortest Throughput Time is 0.0h").
                isNull();
        return this;
    }
}
