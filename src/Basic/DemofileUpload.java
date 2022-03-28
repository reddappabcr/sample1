package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemofileUpload {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/html%20files/fwdhtmlpagestopractice/sample.html");
		driver.findElement(By.id("brow")).sendKeys("D:\\html files\\fwdhtmlpagestopractice\\sample.html");
	}

}
