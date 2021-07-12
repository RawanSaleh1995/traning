package NewPackage;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest_1 {
	WebDriver wd;
  @Test
  public void Login() {
	 // System.out.println("Rawan");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\922670\\Desktop\\Training\\chromedriver_win32\\chromedriver.exe");
	  wd.findElement(By.id("txtUsername")).sendKeys("admin");
	  wd.findElement(By.id("txtPassword")).sendKeys("admin123");
	  wd.findElement(By.xpath("//input[@id='btnLogin']")).click();
  }
  @BeforeMethod
  public void beforeMethoddemo() throws InterruptedException {
	  wd = new ChromeDriver();
	  wd.manage().window().maximize();
	  Thread.sleep(1000);
	  wd.get("https://opensource-demo.orangehrmlive.com/");
  }
  
  @Test
  public void titleTest()
  {
  String title = wd.getTitle();
  System.out.println("Title is: "+title);
  }

  @AfterMethod
  public void afterMethoddemo() {
	  wd.quit();
  }
/*
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }
*/
}
