package runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber/report.html"},
        publish = true,
        features = "src/test/features/RegisterParabankUser.feature",
        tags = "@SmokeTest1"
)
public class CucumberRunner {
}
