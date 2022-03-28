package DemoActitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoUrl {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com");
		Thread.sleep(15000);
		
		String expectedUrl="https://demo.actitime.com/login.do";
		//String actualUrl=driver.getCurrentUrl();

		if(expectedUrl.equals(expectedUrl))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.close();
	}

}
