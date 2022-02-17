package SnapDealWebsite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Library.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapdealLogin {
	public static WebDriver driver;
	@Test
	public void snapdeal_Screenshot() throws IOException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		Thread.sleep(1000);
		action.moveToElement(signin).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='account-icon footerIconsImg']")).click();
		Thread.sleep(3000);
		FileInputStream fis = new FileInputStream("C:/Users/Naresh Mannila/Desktop/SnapdealWebsite.xls");
		HSSFWorkbook workbook=new HSSFWorkbook(fis);
		HSSFSheet sheet = workbook.getSheet("Sheet1");
		Thread.sleep(2000);
		String Email = sheet.getRow(1).getCell(0).toString();
		Thread.sleep(2000);
		String MobileNum = sheet.getRow(1).getCell(1).toString();
		Thread.sleep(3000);
		String Name = sheet.getRow(1).getCell(2).toString();
		Thread.sleep(3000);
		String Password = sheet.getRow(1).getCell(4).toString();
		Thread.sleep(3000);
		String SearchProdAndbrands = sheet.getRow(1).getCell(5).toString();
		Thread.sleep(3000);
		driver.findElement(By.id("userName")).sendKeys(Email);
		Thread.sleep(3000);
		driver.findElement(By.id("checkUser")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("j_number")).sendKeys(MobileNum);
		Thread.sleep(3000);
		driver.findElement(By.id("j_name")).sendKeys(Name);
		Thread.sleep(3000);
		driver.findElement(By.id("j_dob")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//th[text()='November 1996']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//th[text()='»'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//th[text()='»'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Feb']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[text()='8']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("j_password")).sendKeys(Password);
		Thread.sleep(3000);
		driver.findElement(By.id("userSignup")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.id("inputValEnter")).sendKeys(SearchProdAndbrands);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		Thread.sleep(3000);
		WebElement alllinks = driver.findElement(By.xpath("//a"));
		System.out.println(alllinks);
		Thread.sleep(5000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshot/snapdeal_Screenshot.png");
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
