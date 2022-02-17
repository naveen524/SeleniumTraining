package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TakesScreenshot {
@Test
public void takesScreenshot()
{
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.google.com/");
	driver.manage().window().maximize();
    TakesScreenshot ts=(TakesScreenshot) driver;
    source=
   
	
}
}
