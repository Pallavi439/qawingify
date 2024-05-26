package Wingyfy.Wingify;

import java.io.IOException;

import org.testng.annotations.Test;

public class Loginwingify extends Launchandquittest {
	@Test
	public void lauchloginscreen() throws IOException
	{
		Launchandquit obj=new Launchandquit(driver);
		obj.userLoginDetails();
		DashboardPage obj1=new DashboardPage(driver);
		obj1.Sortamountclick();
	
		obj1.sortamountscreenshot();
	}

}
