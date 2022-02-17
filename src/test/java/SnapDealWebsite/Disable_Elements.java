package SnapDealWebsite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Disable_Elements {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		//		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//		jse.executeScript("document.getElementById(\"username\").value='admin'");
		//		Thread.sleep(7000);
		//		jse.executeScript("document.getElementsByName(\"pwd\").value='manager'");
		//		Thread.sleep(7000);
		//		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//		Thread.sleep(5000);
		//		driver.close();

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.close();
	}
}
