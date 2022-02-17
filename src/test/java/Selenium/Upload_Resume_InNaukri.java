package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Library.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_Resume_InNaukri {
	public static WebDriver driver;
	@Test
		public void naukri_Screenshot() throws InterruptedException, IOException, AWTException
		{
		WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("naveenmanneela@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Naukri@1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//span[text()='Automation Engineer']/..")).click();
		Thread.sleep(6000);
		WebElement Upload_CV = driver.findElement(By.xpath("(//div[@class='uploadContainer'])[1]/../../.."));
		Thread.sleep(3000);
		Upload_CV.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		Upload_CV.sendKeys(Keys.ENTER);
		//create object of robot class
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
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement companies = driver.findElement(By.xpath("//div[text()='Companies']"));
		Thread.sleep(3000);
		Actions action1= new Actions(driver);
		action1.moveToElement(companies).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[text()='About Companies'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='search-company component-search-company']")).sendKeys("lnt infotech");
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(5000);
		jse.executeScript("document.getElementsByName(\"CompanyName\")[1].value='lnt infotech';");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//p[@class='body-medium text-capitalize'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//label[@class='radio-label'])[1]")).click();
		Thread.sleep(5000);
		WebElement My_Naukri = driver.findElement(By.xpath("//div[text()='My Naukri']"));
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.moveToElement(My_Naukri).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(5000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		Thread.sleep(5000);
		File source = ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(5000);
		File destination = new File("./Screenshots/Naukri_Screenshot.png");
		Thread.sleep(5000);
		FileUtils.copyFile(source, destination);
		Thread.sleep(5000);
	}
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Utility.takes_Screenshot(driver, result.getName());
		}
		driver.quit();
	}
}
