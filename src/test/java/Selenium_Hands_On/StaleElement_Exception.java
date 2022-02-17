package Selenium_Hands_On;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElement_Exception {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.pavantestingtools.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement trainingbtn = driver.findElement(By.xpath("//a[text()='Training']"));
    trainingbtn.click();
    driver.navigate().back();
	Thread.sleep(2000);
	try
	{
	trainingbtn.click();
	}
	catch (StaleElementReferenceException e)
	{	
		trainingbtn = driver.findElement(By.xpath("//a[text()='Training']"));
		trainingbtn.click();
	}
}
}
