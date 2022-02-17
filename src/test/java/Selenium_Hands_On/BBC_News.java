package Selenium_Hands_On;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BBC_News {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.bbc.com/news");
	Thread.sleep(3000);
	WebElement dest = driver.findElement(By.xpath("(//div[@class='gel-layout gel-layout--no-flex qa-seven-slice'])[4]"));
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	//jse.executeScript("window.scrollTo(0,1000)");
	jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	//jse.executeScript("window.scrollTo(arguments[0],arguments[1])",dest.getLocation().x,dest.getLocation().y);
}
}
