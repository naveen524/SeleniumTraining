package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class AmazonAssign7 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.findElement(By.xpath("//a[text()='Amazon Pay']")).click();
		String title2=driver.getTitle();
		System.out.println(title2);
		if(title1.equals(title2))
		{
			System.out.println("both titles are equals:");
		}
		else
		{
			System.out.println("both are not equal:");
		}
		driver.navigate().back();
		String title3 = driver.getTitle();
		System.out.println(title3);
		if(title1.equals(title3))
		{
			System.out.println("both re equal:");
		}
		else
		{
			System.out.println("both are not equal:");
		}
		driver.close();
	}
}
