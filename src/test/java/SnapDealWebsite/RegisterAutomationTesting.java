package SnapDealWebsite;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

public class RegisterAutomationTesting {
	public static WebDriver driver;
	@Test
	public void take_Screenshot() throws InterruptedException, IOException, AWTException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		FileInputStream fis = new FileInputStream("C:/Users/Naresh Mannila/Desktop/RegisterAutomationTesting.xls");
		Thread.sleep(2000);
		HSSFWorkbook workbook=new HSSFWorkbook(fis);
		Thread.sleep(3000);
		HSSFSheet sheet = workbook.getSheet("Sheet1");
		Thread.sleep(3000);
		String FirstName = sheet.getRow(1).getCell(0).toString();
		Thread.sleep(3000);
		String LastName = sheet.getRow(1).getCell(1).toString();
		Thread.sleep(3000);
		String Address = sheet.getRow(1).getCell(2).toString();
		Thread.sleep(3000);
		String EmailAddress = sheet.getRow(1).getCell(3).toString();
		Thread.sleep(3000);
		String PhoneNum = sheet.getRow(1).getCell(4).toString();
		Thread.sleep(3000);
		String  Password= sheet.getRow(1).getCell(5).toString();
		Thread.sleep(3000);
		String ConfirmPassword = sheet.getRow(1).getCell(0).toString();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(FirstName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(LastName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys(Address);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(EmailAddress);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(PhoneNum);
		Thread.sleep(2000);
		driver.findElement(By.name("radiooptions")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkbox1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkbox2")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"msdd\"]")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.id("firstpassword")).sendKeys(Password);
		Thread.sleep(2000);
		driver.findElement(By.id("secondpassword")).sendKeys(ConfirmPassword);
		Thread.sleep(6000);
		StringSelection str=new StringSelection("‪C:/Users/Naresh Mannila/Desktop/Naveen/Naveen Img.jpeg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		driver.findElement(By.xpath("//input[@type='file']/..")).click();
		Thread.sleep(2000);
		Robot robot = new Robot();
		//storing path in stringselection
		StringSelection selection = new StringSelection("C:\\Users\\Naresh Mannila\\Desktop\\Naveen Manneela 2.2 yrs Experince.docx");
		//copy path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(7000);
		System.out.println("print file uploaded successfully");
		Thread.sleep(7000);		
		driver.findElement(By.id("submitbtn")).click();	
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		Thread.sleep(3000);
		File source = ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
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

