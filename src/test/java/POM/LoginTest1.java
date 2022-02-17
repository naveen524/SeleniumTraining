package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest1 {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://example.testproject.io/web/index.html");
	LoginPage1 loginpage= new LoginPage1(driver);
	FormPage1 formpage= new FormPage1(driver);
	loginpage.enterUserName("Rex Jones II");
	loginpage.enterPassWord("12345");
	loginpage.clickLoginButton();	
	Thread.sleep(3000);
	
	System.out.println("Heading to formpage1");
	
//form page
	
	formpage.enterCountry("United States");
	formpage.enterAddress("1234 TestProject");
	formpage.enterEmail("Rex.Jones@Test4Success.org");
	formpage.enterPhone("214-225-1234");
	formpage.saveButton();
	
}

}
