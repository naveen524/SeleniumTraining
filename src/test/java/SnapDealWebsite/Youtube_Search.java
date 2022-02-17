package SnapDealWebsite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.text.Document;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
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

public class Youtube_Search {
	public static WebDriver driver;
	@Test
	public void youtube_Screenshot() throws InterruptedException, IOException
	{
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.name("q"));
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("youtube");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(text(),'youtube')])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//h3[text()='YouTube']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("search")).sendKeys("Leharaayi songs");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-searchbox'])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]")).click();
	Thread.sleep(2000);
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("./Screenshot/Customized_Screenshot.png");
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