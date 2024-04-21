import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.ComponentScan;

@RunWith(Cucumber.class)
@ComponentScan(value = {"org.lowes"})
@CucumberOptions(
        features = "src/main/resources/feature",
        glue = {"org/lowes"},
        plugin = {"pretty", "json:target/cucumber/cucumber.json"},
        stepNotifications = true
)
public class TestRunner {}

