package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Nd_Drop {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://dhtmlgoodies.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement source = driver.findElement(By.xpath("//a[text()='Menu scripts']"));
	Thread.sleep(3000);
	WebElement target = driver.findElement(By.xpath("//a[text()='Script homepage']"));
	Actions a= new Actions(driver);
	a.dragAndDrop(source, target).perform();
	driver.close();
}
}
