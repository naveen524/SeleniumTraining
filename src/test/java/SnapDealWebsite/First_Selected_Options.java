package SnapDealWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First_Selected_Options {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///C:/Users/Naresh%20Mannila/Desktop/MTR.html");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement mtrlistbox = driver.findElement(By.id("SLV"));
		Thread.sleep(1000);
		Select s = new Select(mtrlistbox);
		WebElement firstoption = s.getFirstSelectedOption();
		Thread.sleep(1000);
		System.out.println(firstoption);
		Thread.sleep(2000);
		driver.close();

	}
}
