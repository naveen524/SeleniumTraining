import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Library.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Take_Screenshot_Testcase_Fails {
WebDriver driver;
@Test
public void capture_Screenshot() throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("6302707546");
	Thread.sleep(3000);
	driver.findElement(By.id("pass")).sendKeys("Facebook@143");
	Thread.sleep(3000);
	driver.findElement(By.name("Name")).click();
	Thread.sleep(3000);
}
@AfterMethod
public void tearDown(ITestResult result)
{
	if(ITestResult.FAILURE==result.getStatus())
	{
	Utility.takes_Screenshot(driver, result.getName());	
	}
}
}
