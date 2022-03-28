package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demodrganddrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		Thread.sleep(3000);
		WebElement source=driver.findElement(By.xpath("//div[@id='block-1']/h1"));
		WebElement target=driver.findElement(By.xpath("//div[@id='block-3']"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();

	}

}
