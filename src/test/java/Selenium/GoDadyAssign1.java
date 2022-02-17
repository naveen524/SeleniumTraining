//Test Case 1 - Open Godaddy.com and maximize browser window.
//Steps to Automate
package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoDadyAssign1 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://in.godaddy.com/");
	driver.manage().window().maximize();
	driver.close();
}
}
