package POM_Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	WebDriverWait wait;


	@FindBy(xpath="//input[@placeholder='Username']")
	private WebElement userName;
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginBtn;
	
	
	public  LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	
	public void EnterUserName(String Username)
	{
		wait.until(ExpectedConditions.visibilityOf(userName)).sendKeys(Username);
		//userName.sendKeys(Username);
	}
	
	public void EnterPassword(String pass)
	{
		wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(pass);
		//password.sendKeys(pass);
	}
	
	public void ClickLogin()
	{
		wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
		loginBtn.click();
	}
	
	
	
	
}
