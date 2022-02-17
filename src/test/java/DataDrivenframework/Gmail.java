package DataDrivenframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(1000);	
	driver.findElement(By.id("identifierId")).sendKeys("naveenmanneela503@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("password")).sendKeys("prince@143");
	Thread.sleep(1000);
	driver.findElement(By.id("c3")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(1000);
	driver.close();
	
	
}
}
