package Selenium_Hands_On;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_Down_BBC {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.bbc.com/sport");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='gel-layout__item gel-2/3@l gel-3/4@xxl'])[1]"));
	Thread.sleep(2000);
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	//jse.executeScript("window.scrollTo(0,document.body.scrollWidth)");
	Thread.sleep(2000);
	//jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	jse.executeScript("window.scrollTo(1600,3000)");
	Thread.sleep(2000);
	driver.close();
	
}
}
