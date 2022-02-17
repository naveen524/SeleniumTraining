// Import all classes and interface
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookScreenshot {

	// Create Webdriver reference
	WebDriver driver;
	@Test
	public void myfirst()
	{
	    // Set the chrome driver
	   WebDriverManager.chromedriver().setup();
	    // pass the option object in ChromeDriver constructor
	    WebDriver driver=new ChromeDriver();
	 
	    // Provide any url
	    driver.get("http://learn-automation.com/");
	 
	    System.out.println("Title is "+driver.getTitle());
	 
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    driver.findElement(By.id("id")).click();
	 
	    try {
	        FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File("./Screenshots/Screenshot.png"));
	    } catch (WebDriverException e) {
	 
	    } catch (IOException e) {
	 
	    }
	}
	}
