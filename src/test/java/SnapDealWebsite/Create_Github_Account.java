package SnapDealWebsite;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_Github_Account {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://github.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='HeaderMenu-link flex-shrink-0 d-inline-block no-underline border color-border-default rounded px-2 py-1']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("nareshmanneela14@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		Thread.sleep(3000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_A);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DELETE);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_A);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_DELETE);
		Thread.sleep(3000);	
		driver.findElement(By.id("password")).sendKeys("Git-Hub@1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("login")).click();
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_A);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DELETE);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_A);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_DELETE);
		Thread.sleep(3000);	
		driver.findElement(By.id("login")).sendKeys("prince-524");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Start puzzle']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@aria-label='Image 4.']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@aria-label='Image 4.']")).click();
		Thread.sleep(3000);		
	}
}
