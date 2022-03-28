package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTitle {

	public static void main(String[] args) {
	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/");
		String ExpectedTitle="actiTIME - Login";
		String ActuralTitle=driver.getTitle();
		if(ExpectedTitle.equals(ActuralTitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}

}
