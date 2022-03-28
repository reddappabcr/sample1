package Basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoNewtab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.air.irctc.co.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Tour Packages']")).click();
		
		Set<String>allwindow=driver.getWindowHandles();
		Iterator<String>it=allwindow.iterator();
		String irctc=it.next();
		String tourpackage=it.next();
		
		Thread.sleep(15000);
		driver.switchTo().window(tourpackage);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.close();
		driver.switchTo().window(irctc);
		driver.findElement(By.id("stationFrom")).sendKeys("reddy");
		driver.close();
	}

}
