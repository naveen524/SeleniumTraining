package DataDrivenframework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLogin {
	public static void main(String[] args) throws InterruptedException, IOException {
	WebDriverManager.chromedriver().setup();
	// Instantiating chrome driver

	 WebDriver driver = new ChromeDriver();

	 // Opening web application
	driver.get("https://www.amazon.com/");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
	Thread.sleep(3000);
	File file = new File("C:/Users/Naresh Mannila/Desktop/AmazonLogin.xls");
	Thread.sleep(1000);
	FileInputStream fi = new FileInputStream(file);
	Thread.sleep(1000);
	HSSFWorkbook workbook = new HSSFWorkbook(fi);
	Thread.sleep(1000);
	HSSFSheet sheet = workbook.getSheet("Sheet1");
	Thread.sleep(1000);
	String username = sheet.getRow(1).getCell(0).getStringCellValue();
	Thread.sleep(1000);
	String password = sheet.getRow(1).getCell(1).getStringCellValue();
	Thread.sleep(1000);
	String username1 = sheet.getRow(2).getCell(0).getStringCellValue();
	Thread.sleep(1000);
	String password1 = sheet.getRow(2).getCell(1).getStringCellValue();
	Thread.sleep(1000);
	System.out.println("The username and password is:" + username + "," + password);
    Thread.sleep(3000);
	 // Locating the username & password and passing the credentials
	driver.findElement(By.id("ap_email")).sendKeys(username);
	Thread.sleep(1000);
	driver.findElement(By.id("continue")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("ap_password")).sendKeys(password);
	Thread.sleep(2000);
	driver.findElement(By.id("signInSubmit")).click();
	Thread.sleep(3000);
	driver.quit();

	 // TODO Auto-generated method stub

	 }

	}
