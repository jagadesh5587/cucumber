package cucumberSample;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "feature/fb.feature",glue = "stepdefinition"
          ,dryRun = false,monochrome = true,tags = "@positive",plugin=
      {"html:reports/web", "j"
      		+ "son:reports/jasonreport.json"})


public class Runner{
       }
