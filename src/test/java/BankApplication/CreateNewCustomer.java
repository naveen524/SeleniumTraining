package BankApplication;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewCustomer {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("---disable the notifications---");
		driver= new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/v4/index.php");
		//un: mngr377966
		//psw: tajEsYh
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		FileInputStream fis=new FileInputStream("C:/Users/Naresh Mannila/Desktop/New Customer Bank.xls");
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
		WebElement login_btn = driver.findElement(By.name("btnLogin"));
		Thread.sleep(1000);
		login_btn.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		login_btn.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	
		//create New Customer
		
		driver.findElement(By.xpath("//a[text()='New Customer']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.id("dob")).sendKeys("08/02/1998");
//		Thread.sleep(2000);
		String CustomerName = sheet.getRow(1).getCell(2).toString();
		Thread.sleep(2000);
//		driver.findElement(By.name("rad1")).click();
		//String Gender = sheet.getRow(1).getCell(3).toString();
		//Thread.sleep(2000);
		//String DOB = sheet.getRow(1).getCell(4).toString();
		//Thread.sleep(2000);
		String Address = sheet.getRow(1).getCell(5).toString();
		Thread.sleep(2000);
		String City = sheet.getRow(1).getCell(6).toString();
		Thread.sleep(2000);
		String State = sheet.getRow(1).getCell(7).toString();
		Thread.sleep(2000);
		String Pin = sheet.getRow(1).getCell(8).toString();
		Thread.sleep(2000);
		String MobileNum = sheet.getRow(1).getCell(9).toString();
		Thread.sleep(2000);
		String Email = sheet.getRow(1).getCell(10).toString();
		Thread.sleep(2000);
		String Password1 = sheet.getRow(1).getCell(11).toString();
		Thread.sleep(2000);
		driver.findElement(By.name("name")).sendKeys(CustomerName);
		Thread.sleep(2000);
		driver.findElement(By.name("rad1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("dob")).sendKeys("08/02/1998");
		Thread.sleep(2000);
		//driver.findElement(By.name("rad1")).sendKeys(Gender);
		//Thread.sleep(2000);
		//driver.findElement(By.name("addr")).sendKeys(Gender);
		//Thread.sleep(2000);
		driver.findElement(By.name("addr")).sendKeys(Address);
		Thread.sleep(2000);
		driver.findElement(By.name("city")).sendKeys(City);
		Thread.sleep(2000);
		driver.findElement(By.name("state")).sendKeys(State);
		Thread.sleep(2000);
		driver.findElement(By.name("pinno")).sendKeys(Pin);
		Thread.sleep(2000);
		driver.findElement(By.name("telephoneno")).sendKeys(MobileNum);
		Thread.sleep(2000);
		driver.findElement(By.name("emailid")).sendKeys(Email);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(Password1);
		driver.findElement(By.name("sub")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
    	driver.navigate().refresh();
    	Thread.sleep(2000);
    	driver.close();
	}
}
