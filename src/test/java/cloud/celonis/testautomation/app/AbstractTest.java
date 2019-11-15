package cloud.celonis.testautomation.app;

import cloud.celonis.testautomation.app.step.CustomerStep;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

public class AbstractTest {

    @Managed
    public WebDriver driver;

    @Steps
    public CustomerStep customer;
}
