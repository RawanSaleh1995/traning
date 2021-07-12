package NewPackage;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver wd;
  @Test
  public void f() {
	  String title=wd.getTitle();
	  System.out.println(title);
  }
  @BeforeMethod
  public void beforeMethod1() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\922670\\Desktop\\Training\\chromedriver_win32\\chromedriver.exe");
	  wd = new ChromeDriver();
	  wd.manage().window().maximize();
	  wd.get("https://orangehrm-demo-6x.orangehrmlive.com/");
  }
  

  @AfterMethod
  public void afterMethod1() {
	  wd.close();
  }

}
