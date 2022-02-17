package Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Close_Child_Then_ParentTab {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.naukri.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	Set<String> alltabs = driver.getWindowHandles();
	Iterator<String> itr = alltabs.iterator();
	String child_Tab = itr.next();
	driver.switchTo().window(child_Tab);
	String parent_Tab = itr.next();
	driver.switchTo().window(parent_Tab);
	driver.quit();
}
}
