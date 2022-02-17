package Selenium_Hands_On;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
     WebDriver driver= new ChromeDriver();
     driver.get("https://www.flipkart.com/");
     Thread.sleep(5000);
     driver.manage().window().maximize();
     Thread.sleep(2000);
     //driver.findElement(By.xpath("//a[text()='Login']")).click();
     driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("6302707546");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Flipkart@143");
     Thread.sleep(2000);
     driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
  		   
     
	}
}
