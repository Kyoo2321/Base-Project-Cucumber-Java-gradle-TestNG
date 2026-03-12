package runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = "classpath:features",
        glue = {"steps", "hooks"},
        plugin = {
                "pretty",
                "html:target/cucumber-report.html"
        }

)

@Test
public class TestRunner extends AbstractTestNGCucumberTests {

}
