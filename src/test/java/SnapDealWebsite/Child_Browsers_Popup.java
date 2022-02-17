package SnapDealWebsite;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_Browsers_Popup {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.naukri.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Set<String> allwh = driver.getWindowHandles();
		Thread.sleep(2000);
		Iterator<String> itr = allwh.iterator();
		Thread.sleep(2000);
		String parent = itr.next();
		Thread.sleep(2000);
		String child = itr.next();
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(child);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(child);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(child);
		driver.close();
		Thread.sleep(2000);
        
	}
}
