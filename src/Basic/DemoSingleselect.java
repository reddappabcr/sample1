package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSingleselect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/html%20files/fwdhtmlpagestopractice/sample.html");
		 WebElement singleselect=driver.findElement(By.id("city"));
		 Select dd=new Select(singleselect);
		 dd.selectByIndex(1);
		 Thread.sleep(2000);
		 dd.selectByValue("3");
		 Thread.sleep(2000);
		 dd.selectByVisibleText("Delhi");
	}

}
