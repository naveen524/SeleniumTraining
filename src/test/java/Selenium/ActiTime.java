//WAST loging to the actitime application using selenium
package Selenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ActiTime {
public static void main(String[] args) throws InterruptedException  {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.id("username")).sendKeys("admin");
	Thread.sleep(1000);
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(1000);
	driver.findElement(By.id("keepLoggedInCheckBox")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	driver.close();
}
}
