package Wingyfy.Wingify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Launchandquit {
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="log-in")
	WebElement loginbutton;
	

	public void userLoginDetails()
	{
		username.sendKeys("pallavi@gmail.com");
		password.sendKeys("Welcome@123");
		loginbutton.click();
	}
	
	
	public Launchandquit(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
