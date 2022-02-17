package Selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Title_Of_Naukri {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.naukri.com/");
	driver.manage().window().maximize();
	Set<String> allwh = driver.getWindowHandles();
	int count = allwh.size();
	System.out.println(count);
	for (String wh : allwh) {
		driver.switchTo().window(wh);
		String title = driver.getTitle();
		System.out.println(title);
	}
	driver.quit();
}
}
