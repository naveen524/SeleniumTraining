package Capture_Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Library.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Products_Store {
public static WebDriver driver;
@Test
public void products_Screenshot() throws InterruptedException, IOException
{
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.navigate().to("https://www.demoblaze.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	Thread.sleep(2000);
	driver.findElement(By.id("login2")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("loginusername")).sendKeys("naveenmanneela@gmail.com"); 
	Thread.sleep(2000);
	driver.findElement(By.id("loginpassword")).sendKeys("ProductStore@1234");
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//button[text()='Log in']")).click(); 
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Phones']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//a[text()='Iphone 6 32gb']")).click();   
	Thread.sleep(4000);
	driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
	Thread.sleep(4000);
	//driver.switchTo().alert().accept();
	Thread.sleep(4000);
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("./Screenshots/godaddy.png");
	FileUtils.copyFile(source, destination);
	
}
@AfterMethod
public void tearDown(ITestResult result)
{
	if(ITestResult.FAILURE==result.getStatus())
	{
		Utility.takes_Screenshot(driver, result.getName());
	}
	driver.close();
}
}
