package DataDrivenframework;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.print.attribute.standard.Destination;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Library.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;
public class SnapdealDemo {
public static WebDriver driver;
	@Test
	public void snapdeal_Screenshot() throws InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.navigate().to("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		Thread.sleep(1000);
		action.moveToElement(signin).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='account-icon footerIconsImg']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("userName")).sendKeys("naveenmanneela@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("checkUser")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("j_number")).sendKeys("6302707546");
		Thread.sleep(1000);
		driver.findElement(By.id("j_name")).sendKeys("Naveen Manneela");
		Thread.sleep(2000);
		driver.findElement(By.id("j_dob")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//th[text()='January 1997']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//th[text()='»'])[2]")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//th[text()='»'])[2]")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Feb']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[text()='8']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("j_password")).sendKeys("navin@143");
		Thread.sleep(2000);
		driver.findElement(By.id("userSignup")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement alloffers = driver.findElement(By.xpath("//span[text()='All Offers']"));
		Thread.sleep(2000);
		action.moveToElement(alloffers).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Full Sleeve Tees']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//p[text()='Gespo Black Round T-Shirt']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//div[text()='XL']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[text()='Proceed To Checkout']")).click();
		Thread.sleep(8000);
		driver.findElement(By.id("username")).sendKeys("6302707546");
		Thread.sleep(4000);
		WebElement mobiletab = driver.findElement(By.xpath("//span[text()='Mobile & Tablets']"));
		Thread.sleep(2000);
		action.moveToElement(mobiletab).perform();
		Thread.sleep(2000);
		String title1 = driver.getTitle();
		Thread.sleep(2000);
		System.out.println(title1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Feature Phones']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='About Us']")).click();
		Thread.sleep(2000);
		String title2 = driver.getTitle();
		Thread.sleep(2000);
		System.out.println(title2);
		Thread.sleep(5000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
	    File destination = new File("./Screenshot/snapdeal.png");
	    FileUtils.copyFile(source, destination);
	}
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Utility.takes_Screenshot(driver, result.getName());
		}
		driver.close();
	}
}
