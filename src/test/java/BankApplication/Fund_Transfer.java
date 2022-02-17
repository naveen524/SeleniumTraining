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

public class Fund_Transfer {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/v4/index.php");
		
//		User ID :	mngr386116
//		Password :	rEzErYt
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		FileInputStream fis=new FileInputStream("C:/Users/Naresh Mannila/Desktop/Transfer_Fund.xls");
		Thread.sleep(2000);
		HSSFWorkbook workbook=new HSSFWorkbook(fis);
		Thread.sleep(2000);
		HSSFSheet sheet = workbook.getSheet("Sheet1");
		Thread.sleep(2000);
		String UserID1 = sheet.getRow(1).getCell(0).toString();
		Thread.sleep(2000);
		String password1 = sheet.getRow(1).getCell(1).toString();
		Thread.sleep(2000);
		driver.findElement(By.name("uid")).sendKeys(UserID1);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(password1);
		Thread.sleep(2000);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Fund Transfer']")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Fund Transfer']")).click();
		Thread.sleep(2000);
		String PayersAccountNum1 = sheet.getRow(1).getCell(2).toString();
		Thread.sleep(3000);
		String PayeesAccountNum1 = sheet.getRow(1).getCell(3).toString();
		Thread.sleep(3000);
		String Amount1 = sheet.getRow(1).getCell(4).toString();
		Thread.sleep(3000);
		String Description1 = sheet.getRow(1).getCell(5).toString();
		Thread.sleep(3000);
		driver.findElement(By.name("payersaccount")).sendKeys(PayersAccountNum1);
		Thread.sleep(3000);
		driver.findElement(By.name("payeeaccount")).sendKeys(PayeesAccountNum1);
		Thread.sleep(3000);
		driver.findElement(By.name("ammount")).sendKeys(Amount1);
		Thread.sleep(3000);
		driver.findElement(By.name("desc")).sendKeys(Description1);
		Thread.sleep(3000);
		driver.findElement(By.name("AccSubmit")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		String UserID2 = sheet.getRow(2).getCell(0).toString();
		Thread.sleep(2000);
		String password2 = sheet.getRow(2).getCell(1).toString();
		Thread.sleep(2000);
		driver.findElement(By.name("uid")).sendKeys(UserID2);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(password2);
		Thread.sleep(2000);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Fund Transfer']")).click();
		Thread.sleep(2000);
		String PayersAccountNum2 = sheet.getRow(2).getCell(2).toString();
		Thread.sleep(3000);
		String PayeesAccountNum2 = sheet.getRow(2).getCell(3).toString();
		Thread.sleep(3000);
		String Amount2 = sheet.getRow(2).getCell(4).toString();
		Thread.sleep(3000);
		String Description2 = sheet.getRow(2).getCell(5).toString();
		Thread.sleep(3000);
		driver.findElement(By.name("payersaccount")).sendKeys(PayersAccountNum2);
		Thread.sleep(3000);
		driver.findElement(By.name("payeeaccount")).sendKeys(PayeesAccountNum2);
		Thread.sleep(3000);
		driver.findElement(By.name("ammount")).sendKeys(Amount2);
		Thread.sleep(3000);
		driver.findElement(By.name("desc")).sendKeys(Description2);
		Thread.sleep(3000);
		driver.findElement(By.name("AccSubmit")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshots/screenshot.png");
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
