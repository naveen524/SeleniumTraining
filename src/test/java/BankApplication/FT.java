package BankApplication;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FT {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/v4/index.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("uid")).sendKeys("22675");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Payal@123");
		Thread.sleep(2000);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Fund Transfer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("payersaccount")).sendKeys("99650");
		Thread.sleep(3000);
		driver.findElement(By.name("payeeaccount")).sendKeys("99653");
		Thread.sleep(3000);
		driver.findElement(By.name("ammount")).sendKeys("1");
		Thread.sleep(3000);
		driver.findElement(By.name("desc")).sendKeys("personal Transaction");
		Thread.sleep(3000);
		driver.findElement(By.name("AccSubmit")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);

	
	
	
	}
}
