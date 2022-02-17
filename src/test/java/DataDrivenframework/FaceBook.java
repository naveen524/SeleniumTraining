package DataDrivenframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	String ExpectedUrl="https://www.facebook.com/";
	Thread.sleep(2000);
	String ActualUrl=driver.getCurrentUrl();
	Thread.sleep(2000);
	if(ExpectedUrl.equals(ActualUrl))
	{
		System.out.println("it is navigating to respective url");
	}
	else
	{
		System.out.println("it is not navigating to respective url");
	}
	driver.close();
	
}
}
