package runners;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ="html:target/cucumber",
        features = "src/test/resources/features",
        glue="steps",
        tags = "@login",
        dryRun = false


)
public class Runner {

}
