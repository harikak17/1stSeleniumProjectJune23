package crmHW1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		init();
		positiveLoginTest();
		//closeBrowser();
		
		init();
		negLginTest();
		//closeBrowser();
	}

	public static void init() {
		// set System property //user.dir
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\komma\\Selenium\\crmHW1\\driver\\chromedriver119.exe" );
//		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		// Launch browser
		driver = new ChromeDriver();
		// delete cookies
		driver.manage().deleteAllCookies();
		// go to web site
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();

		// wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void positiveLoginTest() {
		// identify element and insert value
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		
		//Click on Bank & Cash button
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void negLginTest() {
		// identify element and insert value
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123421321321");
		driver.findElement(By.name("login")).click();
		
		//Click on Bank & Cash button
		
		
		
		
		
		
		
	}

	/*public static void closeBrowser() {
		driver.close();
	}
*/
}


