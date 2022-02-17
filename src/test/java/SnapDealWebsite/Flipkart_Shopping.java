package SnapDealWebsite;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart_Shopping {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("6302707546");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("Flipkart@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		Thread.sleep(3000);
		WebElement fashion = driver.findElement(By.xpath("//img[@alt='Fashion']"));
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(fashion).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[5]")).click();    
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='wndr-13 sports shoes for men | Latest Stylish Casual sp...']")).click();
		Thread.sleep(3000);
		Set<String> alltabs = driver.getWindowHandles();
		Thread.sleep(2000);
		for (String tab : alltabs) {
		Thread.sleep(2000);
		driver.switchTo().window(tab);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='9']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='ADD TO CART']")).click();
		//Thread.sleep(4000);

		}
	}
}
