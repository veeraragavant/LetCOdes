package StepDefinition;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import BaseClass.baseclass;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import gherkin.formatter.Reporter;

public class Hooks extends baseclass{

	
	@After
	
	public void screenshot(Scenario scenario) throws IOException {
		
		String path = "C:\\Users\\ragav\\OneDrive\\Desktop\\Eclipse Workspace\\letcodes\\target\\Scrnshts\\"+scenario.getName()+".png";
		TakesScreenshot tc = (TakesScreenshot) driver;
		File source = tc.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, new File(path));
		com.vimalselvam.cucumber.listener.Reporter.addScreenCaptureFromPath(path);
		//driver.quit();
		
	}
	
	
	
	
}
