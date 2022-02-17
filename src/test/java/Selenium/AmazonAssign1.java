package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAssign1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String title1 = driver.getTitle();
		Thread.sleep(1000);
		System.out.println(title1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Amazon Pay']")).click();
		Thread.sleep(1000);
		String title2 = driver.getTitle();
		Thread.sleep(1000);
		System.out.println(title2);
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		if(title1.equals(title2))
		{
			System.out.println("both titles are equals");
		}
		else
		{
			System.out.println("both titles are not equals");
		}
		driver.close();
	}
}
