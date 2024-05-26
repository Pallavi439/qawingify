package Wingyfy.Wingify;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DashboardPage {
	WebDriver driver;
	
	@FindBy(xpath="//th[@id='amount']")
	WebElement SortedAmount;
	
	public void Sortamountclick() throws IOException
	{
		SortedAmount.click();

		if(SortedAmount.isDisplayed())
		{
			System.out.print("element sorted");
		}
		else
		{
			System.out.print("element not sorted");

		}
		
	

	}
	public void sortamountscreenshot() throws IOException
	{
		SortedAmount.click();
		
//		TakesScreenshot ts=(TakesScreenshot) driver;
//		File src=ts.getScreenshotAs(OutputType.FILE);
//		File dis=new File("C:\\Users\\Surendra\\eclipse-workspace\\Wingify\\screenshot\\amountsortscreenshot.png");
//		FileUtils.copyFile(src, dis);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
        File screenshot = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("C:\\Users\\Surendra\\eclipse-workspace\\Wingify\\screenshot\\amountsortscreenshot.png"));
        System.out.println("Screenshot taken");
	}
	public DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
