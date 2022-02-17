package Selenium_Hands_On;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDown_In_Youtube {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("youtube");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[text()='youtube'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//h3[text()='YouTube']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("search")).sendKeys("love story songs");
	Thread.sleep(2000);
	driver.findElement(By.id("search-icon-legacy")).click();
	Thread.sleep(2000);
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	Thread.sleep(2000);
	driver.findElement(By.id("meta"));
	jse.executeScript("window.scrollTo(0,10000)");
	Thread.sleep(2000);	
}
}
