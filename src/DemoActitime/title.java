package DemoActitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class title {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		String expectedtitle="actiTIME - Login1";
		String actualtitle=driver.getTitle();
		
		if(actualtitle.equals(expectedtitle))
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}
	}

}
