package SnapDealWebsite;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Library.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart_Login {
public static WebDriver driver;
@Test
public void flipkart_Screenshot() throws InterruptedException, IOException
{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(3000);
		XSSFWorkbook workbook= new XSSFWorkbook("C:/Users/Naresh Mannila/Desktop/FlipkartData.xlsx");
		Thread.sleep(3000);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		Thread.sleep(3000);
		String MobileNum = sheet.getRow(1).getCell(0).toString();
		Thread.sleep(3000);
		String Password = sheet.getRow(1).getCell(1).toString();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(MobileNum);
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(Password);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Login'])[2]/..")).click();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshot/flipkart_Screenshot.png");
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

