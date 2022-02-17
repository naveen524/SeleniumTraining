//WASTP java autosuggessions
package Selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class PrintJavaAutoSuggesions {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.name("q")).sendKeys("java");
	Thread.sleep(1000);
	List<WebElement> Allautosugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
	Thread.sleep(1000);
	int count=Allautosugg.size();
	Thread.sleep(1000);
	System.out.println(count);
	Thread.sleep(1000);
	for(int i=0;i<Allautosugg.size();i++)
	{
		String text = Allautosugg.get(i).getText();
		System.out.println(text);
	}
	driver.close();
}
}
