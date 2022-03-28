package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoallCheck {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/html%20files/fwdhtmlpagestopractice/sample.html");
		List<WebElement>allchk=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		int k=allchk.size();
		System.out.println(k);
		
		for(int i=0; i<k;i++)
		{
			WebElement check=allchk.get(i);
			check.click();
			
		}
	}

}
