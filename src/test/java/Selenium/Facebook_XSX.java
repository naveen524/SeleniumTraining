package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_XSX {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("create facebook account");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='create facebook account'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[text()='Join Facebook']")).click();
		Thread.sleep(2000);
		FileInputStream fis= new FileInputStream("C:/Users/Naresh Mannila/Desktop/FaceBook_XSX.xls");
		HSSFWorkbook workbook=new HSSFWorkbook(fis);
		HSSFSheet sheet = workbook.getSheet("Sheet1");
		String First_Name = sheet.getRow(1).getCell(0).toString();
		Thread.sleep(2000);
		String Last_Name = sheet.getRow(1).getCell(1).toString();
		Thread.sleep(2000);
		String Mobile_Num = sheet.getRow(1).getCell(2).toString();
		Thread.sleep(2000);
		String New_Password = sheet.getRow(1).getCell(3).toString();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys(First_Name);
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys(Last_Name);
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys(Mobile_Num);
		Thread.sleep(2000);
		driver.findElement(By.id("password_step_input")).sendKeys(New_Password);
		Thread.sleep(2000);
		WebElement datetextbox = driver.findElement(By.id("day"));
		Thread.sleep(1000);
		Select s1 = new Select(datetextbox);
		Thread.sleep(1000);
		s1.selectByValue("8");
		Thread.sleep(1000);
		WebElement monthtextbox = driver.findElement(By.id("month"));
		Thread.sleep(1000);
		Select s2 = new Select(monthtextbox);
		Thread.sleep(1000);
		s2.selectByVisibleText("Feb");
		Thread.sleep(1000);
		WebElement yeartextbox = driver.findElement(By.id("year"));
		Thread.sleep(1000);
		Select s3 = new Select(yeartextbox);
		Thread.sleep(1000);
		s3.selectByVisibleText("1998");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(6000);
		driver.close();
	}
}
