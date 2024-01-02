package Runners;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\main\\resources\\Features",
        glue = "StepDefinitions",
        tags = "@smoke"
)

public class TestRunner {
}
