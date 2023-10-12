import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;


@RunWith(Cucumber.class)
@ActiveProfiles("prod")
@CucumberOptions(features = {"classpath:features"},
        plugin = {"pretty", "html:target/cucumber/test-report",
                "pretty:target/cucumber-pretty.txt",
                "usage:target/cucumber-usage.json"},
        publish = true,
        //tags = "@SmokeTest",
        extraGlue = "com.example.bddintegrationtest.common")
public class CucumberRunnerTest {
}