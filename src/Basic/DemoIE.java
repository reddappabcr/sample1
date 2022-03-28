package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoIE {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "D:\\software\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		//WebDriver driver=new InternetExplorerDriver();
		 WebDriver driver=new InternetExplorerDriver();
		 driver.get("https://www.google.com");

	}

}
