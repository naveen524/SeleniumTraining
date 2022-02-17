//Test Case 2 - Open Godaddy.com and Print it's Page title.
//Steps to Automate
package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchGodady {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://in.godaddy.com/");
	driver.manage().window().maximize();
	String title = driver.getTitle();
	System.out.println(title);
	String currenturl = driver.getCurrentUrl();
	System.out.println(currenturl);
	driver.close();
}
}
