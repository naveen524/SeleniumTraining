import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Take_Screenshots extends Base_Test{
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	TakesScreenshot ts=(TakesScreenshot) driver;
	Thread.sleep(1000);
	File source = ts.getScreenshotAs(OutputType.FILE);
	Thread.sleep(1000);
    File destination = new File("./Screenshots/screenshots.png");
    Thread.sleep(1000);
    FileUtils.copyFile(source, destination);
    Thread.sleep(1000);
    driver.close();
}
}
