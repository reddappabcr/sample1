package DemoActitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTitle {

	public static void main(String[] args) throws InterruptedException 
	{
		String exepath="D:\\old data\\selenium/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exepath);
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("http://www.testingtreasure.com");
		String title=driver.getTitle();
		System.out.println(title);
	}

}
