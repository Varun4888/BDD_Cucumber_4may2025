package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import POM_Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class loginSteps {
	
	WebDriver driver;
	LoginPage login;
	

	@Given("User opens the Browser.")
	public void user_opens_the_browser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    
	}
	@Given("Navigate to the given URL.")
	public void navigate_to_the_given_url() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		login=new LoginPage(driver);
	    
	}
	@When("User Enters {string} and {string}")   //Username and Password
	public void user_enters_credentials(String userName, String Password) {
		login.EnterUserName(userName);
		login.EnterPassword(Password);
	    
	} 

	
	@When("Click on the login button.")
	public void click_on_the_login_button() {
		login.ClickLogin();
	}
	
	@Then("Validate the LoginPage Title {string}")
	public void validate_the_login_page_title(String expectedTitle) throws InterruptedException {
		
		System.out.println("==========Login page open===========");
		String actualTitle=driver.getTitle();
		System.out.println("Page Title is="+actualTitle);
		Thread.sleep(2000);
	    Assert.assertEquals(expectedTitle, actualTitle);
	    driver.quit();
	    
	}

}
