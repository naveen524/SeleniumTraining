package Selenium_Hands_On;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Spicejet {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("Bengaluru (BLR)");
	Thread.sleep(2000);
	driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("Hyderabad (HYD)");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[text()='31'])[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='Next']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//a[text()='15'])[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("divpaxinfo")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).sendKeys("1 Adult");
    Thread.sleep(2000);
    driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).sendKeys("USD");
    Thread.sleep(2000);
    driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
    driver.close();
}
}
