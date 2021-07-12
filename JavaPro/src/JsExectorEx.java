import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExectorEx {
	WebDriver wd;

	public void setUp() throws InterruptedException     {  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\922670\\Desktop\\Training\\chromedriver_win32\\chromedriver.exe");  
		wd = new ChromeDriver();      
		wd.manage().window().maximize();    
		Thread.sleep(1000);     }
	
	
	public void OrangeLogin() throws InterruptedException     {   
		setUp();           
		JavascriptExecutor js = (JavascriptExecutor)wd;   
		wd.get("https://opensource-demo.orangehrmlive.com");    
		WebElement un = wd.findElement(By.name("txtUsername"));   
		js.executeScript("arguments[0].value='Admin';", un);   
		WebElement pwd = wd.findElement(By.name("txtPassword"));   
		js.executeScript("arguments[0].value='admin123';", pwd);   
		WebElement click = wd.findElement(By.className("button"));  
		js.executeScript("arguments[0].click();", click);         
		String titleText = js.executeScript("return document.title;").toString();  
		System.out.println("Page title is: "+titleText);        
		js.executeScript("alert('You have Logged in Successfully Niharikaa..!);");             }
	
	public static void main(String[] args) throws InterruptedException {      
		       new JsExectorEx().OrangeLogin();     }
}
