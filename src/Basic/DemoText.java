package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoText {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		String ExpectedText="Please identify yourself";
		String ActualText=driver.findElement(By.xpath("//td[text()='Please identify yourself']")).getText();
		if(ExpectedText.equals(ActualText))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}

}
