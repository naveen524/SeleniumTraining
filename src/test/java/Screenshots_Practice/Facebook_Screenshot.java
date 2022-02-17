package Screenshots_Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Library.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Screenshot {
	WebDriver driver;
	@Test
	public void facebook_Screenshot() throws IOException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("6302707546");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Facebook@143");
		Thread.sleep(2000);
		driver.findElement(By.name("login..")).click();
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		Thread.sleep(2000);
		File source = ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		File destination = new File("./Screenshot/facebook_Screenshot.png");
		Thread.sleep(3000);
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
