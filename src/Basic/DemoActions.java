package Basic;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.revajourneys.com/");
		Thread.sleep(2000);
		WebElement intour=driver.findElement(By.xpath("(//a[@href='/reva_australia.html'])[1]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(intour).perform();
		Thread.sleep(20000);
		
		act.contextClick(intour).perform();
		Thread.sleep(2000);
		act.sendKeys("t").perform();
	}

}
