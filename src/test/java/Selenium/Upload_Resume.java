package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_Resume {
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.naukri.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//button[@class='btn'])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("name")).sendKeys("naveen");
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("naveen143@gmail.com");
//	Thread.sleep(2000);
//	driver.findElement(By.id("password")).sendKeys("naveen143");
//	Thread.sleep(2000);
//	driver.findElement(By.id("mobile")).sendKeys("908070605040");
//	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
	Thread.sleep(2000);
	//create object of robot class
	Robot robot = new Robot();
    //storing path in stringselection
	StringSelection selection = new StringSelection("C:\\Users\\Naresh Mannila\\Desktop\\murali resume (2).docx");
	//copy path to clipboard
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_V);
	Thread.sleep(2000);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	robot.keyRelease(KeyEvent.VK_V);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	System.out.println("print file uploaded successfully");
	Thread.sleep(2000);
}
}