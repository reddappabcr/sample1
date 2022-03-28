package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemotoolTips {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		String tooltip=driver.findElement(By.xpath("//a[@href='samsung_galaxy_a70s-9899.php']/img")).getAttribute("title");
		System.out.println(tooltip);
		

	}

}
