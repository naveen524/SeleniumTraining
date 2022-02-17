package Selenium_Hands_On;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Type_Without_Using_Sendkeys_In_GFB {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("document.getElementById(\"email\").value=\"6302707546\";");
	Thread.sleep(2000);
	jse.executeScript("document.getElementById(\"pass\").value=\"Facebook@143\";");
	Thread.sleep(2000);
	driver.findElement(By.name("login")).click();
}
}

