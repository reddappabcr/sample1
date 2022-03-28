package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAllLinks {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/");
		List<WebElement>alllink=driver.findElements(By.xpath("//a"));
		int k=alllink.size();
		System.out.println(k);
		for(int i=0;i<k;i++)
		{
			WebElement link=alllink.get(i);
			String te=link.getText();
			System.out.println(te);
			
		}
		

	}

}
