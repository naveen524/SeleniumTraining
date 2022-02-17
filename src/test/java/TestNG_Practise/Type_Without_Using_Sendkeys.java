package TestNG_Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Type_Without_Using_Sendkeys {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeAsyncScript("document.getElementById(\"email\").value='6302707546'");
		Thread.sleep(3000);
		jse.executeAsyncScript("document.getElementById(\"pass\").value='Facebook@143'");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
	}
}
