import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Notification {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("6302707546");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("Facebook@143");
		Thread.sleep(3000);
		WebElement login_button = driver.findElement(By.name("login"));
		login_button.sendKeys(Keys.TAB);
		login_button.sendKeys(Keys.ENTER);
		Thread.sleep(8000);
		driver.close();
		}
		}