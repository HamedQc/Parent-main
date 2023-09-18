package StepDefinitions.Runners;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
        features = "src/main/Features/CreatePost.feature",
        glue = {"StepDefinitions/CreatePostStepDefinition", "StepDefinitions/Hooks"}, //i can use . instead of forward slash
        tags = "@Regression",
        plugin = {"pretty",
                "html:target/cucumber/cucumber-html-report.html",
                "json:target/cucumber/cucumber-json-report.json",
                "junit:target/cucumber/cucumberXML.xml"}
)





public class CreatePostTestRunner {
}
