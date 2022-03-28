package Basic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demopromt {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Prompt Pop up']")).click();
		driver.findElement(By.xpath("//button[text()='Prompt Pop up']")).click();
		Thread.sleep(2000);
		System.out.println("hi");
		
	}

}
