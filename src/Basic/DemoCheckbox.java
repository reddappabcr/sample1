package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoCheckbox {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/html%20files/fwdhtmlpagestopractice/sample.html");
		boolean chk=driver.findElement(By.name("rep")).isSelected();
		System.out.println(chk);
		
		driver.findElement(By.name("rep")).click();
		boolean chk1=driver.findElement(By.name("rep")).isSelected();
		System.out.println(chk1);
		
		
		driver.findElement(By.name("rep")).click();
		boolean chk2=driver.findElement(By.name("rep")).isSelected();
		System.out.println(chk2);

	}

}
