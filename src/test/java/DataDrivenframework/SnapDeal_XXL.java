package DataDrivenframework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Library.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal_XXL {
public static WebDriver driver;
@Test
public void snapDeal_Screenshot() throws IOException, InterruptedException
{
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.navigate().to("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.id("pincode-check-nba")).sendKeys("515001");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
	Thread.sleep(5000);
	WebElement Electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
	Thread.sleep(3000);
	Actions action = new Actions(driver);
	action.moveToElement(Electronics).perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Trimmers']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[text()='Kemei 809 Clipper Multigrooming Kit ( Black )']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[text()='add to cart']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='View Cart']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@value='PROCEED TO PAY Rs. 999']")).click();
	Thread.sleep(3000);
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("./Screenshot/Customized_Screenshot.png");
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
