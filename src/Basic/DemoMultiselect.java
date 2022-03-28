package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoMultiselect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/html%20files/fwdhtmlpagestopractice/sample.html");
		WebElement multiselect=driver.findElement(By.id("cities"));
		Select dd=new Select(multiselect);
		dd.selectByIndex(1);
		Thread.sleep(2000);
		dd.selectByValue("3");
		Thread.sleep(2000);
		dd.selectByVisibleText("Bangalore");
		Thread.sleep(2000);
		//dd.deselectAll();
		
		List<WebElement> allOptions=dd.getOptions();
		int k=allOptions.size();
		for(int i=0;i<k;i++)
		{
		WebElement option=allOptions.get(i);
		String te=option.getText();
		System.out.println(te);
		}
		
		
	}

}
