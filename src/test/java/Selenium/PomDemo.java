package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PomDemo {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.demoqa.com/login");
	Thread.sleep(1000);
	driver.findElement(By.id("userName")).sendKeys("viji");
	Thread.sleep(1000);
	driver.findElement(By.id("password")).sendKeys("DemoSite@123");
	Thread.sleep(1000);
	driver.findElement(By.id("login")).click();
	Thread.sleep(1000);
	String title=driver.getTitle();
	Thread.sleep(1000);
	System.out.println(title);
	Thread.sleep(1000);
	driver.findElement(By.id("submit")).click();
}
}
