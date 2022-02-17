package DataDrivenframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonOrder {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		Thread.sleep(1000);
		options.addArguments("--headless");
		Thread.sleep(1000);
		WebDriver driver= new ChromeDriver(options);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("white causal shoes for men");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(4000);
		String title = driver.getTitle();
		System.out.println(title);
//		driver.findElement(By.xpath("(//img[@class='s-image'])[4]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("(//img[@class='imgSwatch'])[5]")).click();
	}
}
