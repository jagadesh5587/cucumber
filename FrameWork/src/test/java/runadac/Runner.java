package runadac;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"feature files/adactin.feature"},glue = {"adactinapp"},
        monochrome = true,plugin=
      {"html:report/web.html", "json:report/jasonreport.json"})
public class Runner{
	
}
