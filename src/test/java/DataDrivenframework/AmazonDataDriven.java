package DataDrivenframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonDataDriven{
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement signinbtn = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Thread.sleep(2000);
		Actions action= new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(signinbtn).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Sign in'])[1]")).click();
		Thread.sleep(2000);
		FileInputStream fis=new FileInputStream("C:/Users/Naresh Mannila/Documents/AmazonSignIn.xls");
		Thread.sleep(2000);
		HSSFWorkbook workbook=new HSSFWorkbook(fis);
		Thread.sleep(2000);
		HSSFSheet sheet=workbook.getSheet("Sheet1");
		Thread.sleep(2000);
		String username = sheet.getRow(1).getCell(0).toString();
		Thread.sleep(2000);
		String password = sheet.getRow(1).getCell(1).toString();
		Thread.sleep(2000);
//		String username1 = sheet.getRow(2).getCell(0).toString();
//		Thread.sleep(2000);
//		String password1 = sheet.getRow(2).getCell(1).toString();
//		Thread.sleep(2000);
		driver.findElement(By.id("ap_email")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ap_password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.name("rememberMe")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
