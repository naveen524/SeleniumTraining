package DataDrivenframework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class AutomationToolQA {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://qatechhub.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		String ExpectedTitle = "QA Automation Tools Trainings and Tutorials | QA Tech Hub";
		String ActualTitle=driver.getTitle();
		if(ExpectedTitle.equals(ActualTitle))
		{
			System.out.println("pass the test");
		}
		else
		{
			System.out.println("fail the test");
		}
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().to("https://www.facebook.com/");
		String title1 = driver.getTitle();
		System.out.println(title1);
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().to("https://qatechhub.com/");
		Thread.sleep(1000);
		String currenturl = driver.getCurrentUrl();
		Thread.sleep(1000);
		System.out.println(currenturl);
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.close();
	}
}
