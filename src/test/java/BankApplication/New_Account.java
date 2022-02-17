package BankApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
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

public class New_Account {
	public static WebDriver driver;
	@Test 
	public void bank_Screenshot() throws InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/v4/index.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		FileInputStream fis=new FileInputStream("C:/Users/Naresh Mannila/Desktop/New Account.xls");
		Thread.sleep(2000);
		HSSFWorkbook workbook=new HSSFWorkbook(fis);
		Thread.sleep(2000);
		HSSFSheet sheet = workbook.getSheet("Sheet1");
		Thread.sleep(2000);
		String UserID = sheet.getRow(1).getCell(0).toString();
		Thread.sleep(2000);
		String password = sheet.getRow(1).getCell(1).toString();
		Thread.sleep(2000);
		driver.findElement(By.name("uid")).sendKeys(UserID);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='New Account']")).click();
		Thread.sleep(2000);
		String CustomerID = sheet.getRow(1).getCell(2).toString();
		Thread.sleep(2000);
		String AccountType = sheet.getRow(1).getCell(3).toString();
		Thread.sleep(2000);
		String InitialDeposite = sheet.getRow(1).getCell(4).toString();
		Thread.sleep(2000);
		driver.findElement(By.name("cusid")).sendKeys(CustomerID);
		Thread.sleep(2000);
		driver.findElement(By.name("selaccount")).sendKeys(AccountType);
		Thread.sleep(2000);
		driver.findElement(By.name("inideposit")).sendKeys(InitialDeposite);
		Thread.sleep(2000);
		driver.findElement(By.name("button2")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshots/bank_Screenshot.png");
		FileUtils.copyFile(source, destination);
	}
	@AfterMethod
	public void tearDown(ITestResult result) throws InterruptedException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Utility.takes_Screenshot(driver, result.getName());
		}
		Thread.sleep(6000);
		driver.quit();
	}		
}

