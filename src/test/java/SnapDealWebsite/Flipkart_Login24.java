package SnapDealWebsite;

import java.awt.Window;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart_Login24 {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("6302707546");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("Flipkart@1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		Thread.sleep(3000);
		WebElement Fashion = driver.findElement(By.xpath("//img[@alt='Fashion']"));
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.moveToElement(Fashion).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[7]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='IRpwTa'])[3]")).click();
		Thread.sleep(3000);
		Set<String> allwh = driver.getWindowHandles(); 
		System.out.println("available window:-"+" "+allwh.size());
		Thread.sleep(3000);
		Iterator<String> itr = allwh.iterator();
		String window1 = itr.next();
		String window2 = itr.next();
		// for (String w : allwh) {
		//System.out.println("window alpha numeric ID:"+"  "+w);
		//}   
		driver.switchTo().window(window2);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
		Thread.sleep(3000);
	}

}
