package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoRadiobox {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/html%20files/fwdhtmlpagestopractice/sample.html");
		boolean rad=driver.findElement(By.id("male")).isSelected();
		System.out.println(rad);
		
		driver.findElement(By.id("male")).click();
		boolean rad1=driver.findElement(By.id("male")).isSelected();
		System.out.println(rad1);
		
		driver.findElement(By.id("male")).click();
		boolean rad2=driver.findElement(By.id("male")).isSelected();
		System.out.println(rad2);
	}

}
