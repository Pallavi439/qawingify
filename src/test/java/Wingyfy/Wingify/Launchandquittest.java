package Wingyfy.Wingify;



import java.time.Duration;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Launchandquittest {
	WebDriver driver;
	@BeforeMethod
	public void beforemethod()
	{
		driver=new ChromeDriver();
		driver.get("https://sakshingp.github.io/assignment/login.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
		
	
	@AfterMethod
	public void aftermethod()
	{
		driver.close();
		
	}

}
