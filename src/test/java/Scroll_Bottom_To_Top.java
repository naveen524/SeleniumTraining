import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_Bottom_To_Top {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.bbc.com/sport");
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollTo(0,0)");	
		Thread.sleep(6000);
		driver.close();
	}
}
