package DemoActitime;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class DemoTestng {
	@BeforeClass
	  public void OpenBrowser()
	  {
		  System.out.println("open browser");
	  }
	
	
  @Test
  public void CreateUser()
  {
	  System.out.println("create user");
  }
  @Test
  public void editUser()
  {
	  System.out.println("edit user");
  }
  @Test
  public void DeleteUser()
  {
	  System.out.println("delete user");
  }
  @BeforeMethod
  public void LogIn()
  {
	  System.out.println("LogIn");
  }
  @AfterMethod
  public void LogOut()
  {
	  System.out.println("LogOut");
  }
  
  @AfterClass
  public void CloseBrowser()
  {
	  System.out.println("close browser");
  }
}
