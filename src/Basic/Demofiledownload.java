package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Demofiledownload {

	public static void main(String[] args) throws InterruptedException {
		FirefoxProfile prof=new FirefoxProfile();		
		prof.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");
		prof.setPreference("browser.download.folderList", 0);
		
		WebDriver driver=new FirefoxDriver(prof);
		driver.get("https://www.seleniumhq.org/download/");
		Thread.sleep(2000);
		driver.findElement(By.id("close")).click();
		Thread.sleep(1000);		
		driver.findElement(By.xpath("(//a[text()='Download'])[2]")).click();

	}

}
