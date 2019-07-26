package CucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"Feature/Calculator.feature"},
        glue={"src.main.java.StepDefinition"},
        tags = {"@Test1"}
)

public class RunnerTest {

}
