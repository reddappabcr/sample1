package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoUrl {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com");
		String expectedUrl="https://demo.actitime.com/login.do";
		String actualrl=driver.getCurrentUrl();
		if(expectedUrl.equals(actualrl))
		{
			System.out.println("pass");
		}
		else
		{
		System.out.println("fail");
		}

	}

}
