package SnapDealWebsite;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
	public static WebDriver driver;
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Bangladesh");
		Thread.sleep(2000);
		StringSelection str=new StringSelection("‪C:/Users/Naresh Mannila/Desktop/Naveen/Naveen Img.jpeg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		driver.findElement(By.xpath("//input[@type='file']/..")).click();
		Thread.sleep(2000);
		Robot robot = new Robot();
		//storing path in stringselection
		StringSelection selection = new StringSelection("C:\\Users\\Naresh Mannila\\Desktop\\Naveen Manneela 2.2 yrs Experince.docx");
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
		Thread.sleep(7000);
		System.out.println("print file uploaded successfully");
		Thread.sleep(7000);
		driver.close();
		
	}
}
