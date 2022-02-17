package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MTR_Listbox {
	public static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.navigate().to("file:///C:/Users/Naresh%20Mannila/Desktop/MTR.html");
driver.manage().window().maximize();
WebElement MTR_Listbox = driver.findElement(By.id("MTR"));
Thread.sleep(3000);
Select s= new Select(MTR_Listbox);
Thread.sleep(3000);
s.selectByIndex(1);
Thread.sleep(3000);
s.selectByVisibleText("dosa");
Thread.sleep(3000);
s.selectByVisibleText("idly");
Thread.sleep(3000);
s.selectByVisibleText("sambar");
Thread.sleep(3000);
s.deselectAll();
driver.close();

}
}
