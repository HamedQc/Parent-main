package StepDefinitions.Runners;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(

        features = "src/main/Features/CreatePost.feature",
        glue = "StepDefinitions/LoginStepDefinition",
        tags = "@Smoke",
        plugin = {"pretty",
                "html:target/cucumber/cucumber-html-report.html",
                "json:target/cucumber/cucumber-json-report.json",
                "junit:target/cucumber/cucumberXML.xml"}
)


public class SmokeTestRunner {

}
