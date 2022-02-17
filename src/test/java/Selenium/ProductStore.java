package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductStore {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("itemc")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Iphone 6 32gb']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.id("itemc")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("next2")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='MacBook Pro']")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.id("itemc")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='Apple monitor 24']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
//		Thread.sleep(2000);
		driver.close();
//		//Apple monitor 24
//http://automationpractice.com/index.php
	}
}
