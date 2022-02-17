package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintGoogleLogo {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	String title = driver.getTitle();
	System.out.println(title);
	System.out.println(title.length());
	String currenturl = driver.getCurrentUrl();
	System.out.println(currenturl);
	if(currenturl.equals("https://www.google.com/"))
	{
		System.out.println("equal");
	}
	else
	{
		System.out.println("not equal");
	}
	driver.close();
	
	
}
}
