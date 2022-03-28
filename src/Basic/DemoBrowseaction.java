package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoBrowseaction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.seleniumhq.org/");
		driver.navigate().to("https://www.seleniumhq.org/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Download']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		
		

	}

}
