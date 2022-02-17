package Selenium_Hands_On;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {
	public static WebDriver driver;
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	driver.manage().window().maximize();
//	driver.findElement(By.id("email")).sendKeys("6302707546");
//	Thread.sleep(3000);
//	driver.findElement(By.id("pass")).sendKeys("Facebook@143");
//	Thread.sleep(3000);
//	driver.findElement(By.name("login")).click();
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("./Screenshots/screenshot.png");
	FileUtils.copyFile(source, destination);
	Thread.sleep(3000);
	driver.close();
}
}
