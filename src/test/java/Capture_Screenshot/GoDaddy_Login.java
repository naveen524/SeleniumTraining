package Capture_Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Library.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoDaddy_Login {
	public static WebDriver driver;
	@Test
	public void godaddy_Screenshot() throws InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.navigate().to("https://in.godaddy.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Sign In']")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();  
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("naveenmanneela503@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Godaddy@1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		Thread.sleep(4000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshots/godaddy.png");
		FileUtils.copyFile(source, destination);
	}
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		{
			if(ITestResult.FAILURE==result.getStatus())
			{
				Utility.takes_Screenshot(driver, result.getName());	
			}
			driver.close();
		}	
	}
}
