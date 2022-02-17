package TestNG_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Google {
WebDriver driver;
@Test
public void test_google()
{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.navigate().to("https://www.google.com/");
	driver.manage().window().maximize();
	String expected_Title="soogle";
	String actual_titile = driver.getTitle();
    if(expected_Title.equals(actual_titile))
    {
    	Reporter.log("pass", true);
    }
    else {
	Reporter.log("fail",false);	
	}
    driver.close();
}
}
