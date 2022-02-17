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

public class File_Upload {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("imagesrc")).click();
		//create object of robot class
		Robot robot = new Robot();
		//store the path in stringselection class
		StringSelection selection = new StringSelection("C:\\Users\\Naresh Mannila\\Desktop\\murali resume (2).docx");
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
		Thread.sleep(2000);
		driver.quit();
	}
	}
		
		

