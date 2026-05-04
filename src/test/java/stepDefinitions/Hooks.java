package stepDefinitions;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks {
	
	private WebDriver driver;
	
	public Hooks(loginSteps steps)
	{
		this.driver=steps.driver;
	}
	
	@After
	
		public void takeSSonFailure(Scenario scenario)
		{
		if(scenario.isFailed())
		{
			 byte[] src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			 scenario.attach(src, "image/png", "Failed Screenshot.");
		}
			
		}
	

}
