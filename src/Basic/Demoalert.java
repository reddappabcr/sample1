package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demoalert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
		Thread.sleep(2000);
		String alert=driver.switchTo().alert().getText();
		System.out.println(alert);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

	}

}
