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

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDemo {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	FileInputStream fis = new FileInputStream("C:/Users/Naresh Mannila/Desktop/AmazonDemo24.xls");
	HSSFWorkbook workbook= new HSSFWorkbook(fis);
	HSSFSheet sheet = workbook.getSheet("Sheet1");
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
	Thread.sleep(1000);
	Actions a = new Actions(driver);
	Thread.sleep(1000);
	a.moveToElement(signin).perform();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//i[@class='account-icon footerIconsImg']")).click();
	Thread.sleep(1000);
    String email = sheet.getRow(2).getCell(0).toString();
	
	
}
}
