package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment6 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.techlistic.com/");
	String title1 = driver.getTitle();
	System.out.println(title1);
	driver.findElement(By.xpath("(//a[text()='Java'])[1]")).click();
	String title2 = driver.getTitle();
	System.out.println(title2);
	driver.navigate().back();
	driver.findElement(By.xpath("(//a[text()='Selenium'])[2]")).click();
	String title3 = driver.getTitle();
	System.out.println(title3);
	driver.navigate().back();
	driver.findElement(By.xpath("(//a[text()='Selenium'])[2]")).click();
	String title4 = driver.getTitle();
	System.out.println(title4);
	driver.navigate().back();
	driver.findElement(By.xpath("(//a[text()='TestNG'])[1]")).click();
}
}
