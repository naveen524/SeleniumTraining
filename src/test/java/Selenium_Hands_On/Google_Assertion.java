package Selenium_Hands_On;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_Assertion {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	@Test
	public void Testgoogle()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String ExpectedTitle = "doogle";
		String Actualtitle = driver.getTitle();
		if(ExpectedTitle.equals(Actualtitle))
		{
	    Reporter.log("pass",true);
		}
		else
		{
			Reporter.log("fail",true);
		}
		driver.close();
	}
	
}
}
