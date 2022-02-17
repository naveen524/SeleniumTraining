package DataDrivenframework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String title = driver.getTitle();
		Thread.sleep(2000);
		System.out.println(title);
		Thread.sleep(2000);
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		Thread.sleep(2000);
		int count = alllinks.size();
		Thread.sleep(2000);
		System.out.println(count);
		Thread.sleep(2000);
		for(int i=0;i<count;i++)
		{
			String text = alllinks.get(i).getText();
			Thread.sleep(2000);
			System.out.println(text);
		}
	driver.close();
	}
}
