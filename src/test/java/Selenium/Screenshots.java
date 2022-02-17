package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {
	public static WebDriver driver;
public static void main(String[] args) throws IOException, InterruptedException {
WebDriverManager.chromedriver().setup();
 driver = new ChromeDriver();
driver.navigate().to("https://www.facebook.com/");
Thread.sleep(3000);
takeScreenshot("Facebook_LoginPage");
driver.manage().window().maximize();
}
public static void takeScreenshot(String fileName) throws IOException
{
	//1.take screenshot and store it as a file format
	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	//2.now copy the screenshot to desired location using copyfile method
	FileUtils.copyFile(file, new File("C:/Users/Naresh Mannila/Desktop/Naveen/SeleniumTraining/ScreenshotesImages"+fileName+".jpg"));
}
}
