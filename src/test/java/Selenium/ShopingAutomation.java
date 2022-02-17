package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShopingAutomation {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='login']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("email_create")).sendKeys("naveenprince@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Create an account']/..")).click();
	Thread.sleep(2000);
	
	//Thread.sleep(2000);    http://automationpractice.com/index.php
	
	//Thread.sleep(2000);
}
}
