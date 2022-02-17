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

public class Customized_Statement {
	public static WebDriver driver;
	@Test
	public void customized_Screenshot() throws InterruptedException, IOException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/v4/index.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		FileInputStream fis=new FileInputStream("C:/Users/Naresh Mannila/Desktop/Customized_Statement.xls");
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
		driver.findElement(By.xpath("//a[text()='Customised Statement']")).click();
		Thread.sleep(2000);
		String Account_No = sheet.getRow(1).getCell(2).toString();
		Thread.sleep(2000);
		String From_Date = sheet.getRow(1).getCell(3).toString();
		Thread.sleep(2000);
		String To_Date = sheet.getRow(1).getCell(4).toString();
		Thread.sleep(2000);
		String Minimum_Transaction_Value = sheet.getRow(1).getCell(5).toString();
		Thread.sleep(2000);
		String Number_Of_Transaction = sheet.getRow(1).getCell(6).toString();
		Thread.sleep(2000);
		driver.findElement(By.name("accountno")).sendKeys(Account_No);
		Thread.sleep(2000);
		driver.findElement(By.name("fdate")).sendKeys(From_Date);
		Thread.sleep(2000);
		driver.findElement(By.name("tdate")).sendKeys(To_Date);
		Thread.sleep(2000);
		driver.findElement(By.name("amountlowerlimit")).sendKeys(Minimum_Transaction_Value);
		Thread.sleep(2000);
		driver.findElement(By.name("numtransaction")).sendKeys(Number_Of_Transaction);
		Thread.sleep(2000);
		driver.findElement(By.name("AccSubmit")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
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