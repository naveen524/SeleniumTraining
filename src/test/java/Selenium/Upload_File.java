package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_File {
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.id("wdgt-file-upload")).click();
	//create object of robot class
	Robot robot = new Robot();
	//store the path in stringselection class
	StringSelection selection = new StringSelection("C:\\Users\\Naresh Mannila\\Desktop\\Naveen Manneela 2.2 yrs Experince.docx");
	//copy path to clipboard
	Thread.sleep(2000);
	//copy above path to clipboard
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
	Thread.sleep(2000);
	//now press controll
	robot.keyPress(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	//press v
	robot.keyPress(KeyEvent.VK_V);
	Thread.sleep(2000);
	//release v
	robot.keyRelease(KeyEvent.VK_V);
	Thread.sleep(2000);
	//release controll
	robot.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	//press enter
	robot.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	//release enter
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	System.out.println("file uploaded successfully by using robot class");
	Thread.sleep(3000);
//	driver.navigate().refresh();
//	Thread.sleep(2000);
//	WebElement My_Naukri = driver.findElement(By.xpath("//div[text()='My Naukri']"));
//	Thread.sleep(3000);
//	Actions action = new Actions(driver);
//	action.moveToElement(My_Naukri).perform();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//a[text()='Logout']")).click();
//	Thread.sleep(3000);
	//driver.quit();
}
}
