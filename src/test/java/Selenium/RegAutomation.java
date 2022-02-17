//automationtesting registartion application
package Selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegAutomation {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Manneela");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Naveen");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Anantapur");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("naveenmanneela503@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("6302707546");
		Thread.sleep(2000);
		driver.findElement(By.name("radiooptions")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkbox1")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//select[@type='text'])[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//option[text()='Android']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//select[@type='text'])[2]")).click();
//		Thread.sleep(2000);
		WebElement Lang_Textbox = driver.findElement(By.id("msdd"));
		Thread.sleep(2000);
		Lang_Textbox.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Catalan']"))).click();
//		driver.findElement(By.id("countries"));
//		Thread.sleep(2000); 
//		driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
//		Thread.sleep(2000);
//		WebElement yearbox = driver.findElement(By.id("yearbox"));
//		Thread.sleep(1000);
//		Select s1 = new Select(yearbox);
//		Thread.sleep(1000);
//		s1.selectByValue("1998");
//		Thread.sleep(1000);
//		WebElement monthbox = driver.findElement(By.xpath("(//select[@type='text'])[4]"));
//		Thread.sleep(1000);
//		Select s2 = new Select(monthbox);
//		Thread.sleep(2000);
//		s2.selectByVisibleText("February");
//		Thread.sleep(1000);
//		WebElement daybox = driver.findElement(By.id("daybox"));
//		Thread.sleep(1000);
//		Select s3 = new Select(daybox);
//		Thread.sleep(1000);
//		s3.selectByValue("8");
		Thread.sleep(1000);
		driver.findElement(By.id("firstpassword")).sendKeys("naveenmanneela@143");
		Thread.sleep(1000);
		driver.findElement(By.id("secondpassword")).sendKeys("Naveenmanneela@143");
		Thread.sleep(1000);
		driver.findElement(By.id("submitbtn")).click();
		Thread.sleep(1000);
		// driver.close();

		//    Robot robot= new Robot();
		//	driver.findElement(By.id("imagesrc")).click();
		//	robot.setAutoDelay(3000);
		//	StringSelection stringselection= new StringSelection("‪‪C:\\Users\\Naresh Mannila\\Pictures\\Naveen Img24.jpeg");
		//	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
		//	robot.setAutoDelay(2000);
		//	robot.keyPress(KeyEvent.VK_CONTROL);
		//	robot.keyPress(KeyEvent.VK_V);
		//
		//	robot.keyRelease(KeyEvent.VK_CONTROL);
		//	robot.keyRelease(KeyEvent.VK_V);
		//	robot.setAutoDelay(2000);
		//	robot.keyPress(KeyEvent.VK_ENTER);
		//	robot.keyRelease(KeyEvent.VK_ENTER);
		//
		//    driver.findElement(By.id("submitbtn")).click();
		//    Thread.sleep(1000);
		//    

	}
}
