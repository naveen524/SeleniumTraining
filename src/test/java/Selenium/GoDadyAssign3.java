package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoDadyAssign3 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.godaddy.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		if(currenturl.equals("https://in.godaddy.com/"))
		{
			System.out.println("both urls are same");
		}
		else
		{
			System.out.println("both url are not same");
		}
	}
}
//span[text()='Start Shopping']