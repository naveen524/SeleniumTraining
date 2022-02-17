package SnapDealWebsite;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://demo.actitime.com/login.do");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	WebElement actiTIME = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
	Thread.sleep(2000);
	Actions a = new Actions(driver);
	a.contextClick(actiTIME).perform();
	Thread.sleep(3000);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_W);
	Thread.sleep(3000);
	driver.quit();
}
}
