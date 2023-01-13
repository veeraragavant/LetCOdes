package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\src\\test\\java\\Feature", glue = "StepDefinition",tags = " @TC-107",dryRun = false, monochrome = true, plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\ragav\\OneDrive\\Desktop\\Eclipse Workspace\\letcodes\\target\\Reports\\ExtentsReport\\Reportss.html"})



public class Runner {

}


                        //"html:target\\Reports", "json:target\\Reports\\Report.json",