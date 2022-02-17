package DataDrivenframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSignUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("create facebook account");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='create facebook account'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h3[text()='Join Facebook']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("prince");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("gattamaneni");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("8050505050");
		Thread.sleep(2000);
		driver.findElement(By.id("password_step_input")).sendKeys("prince@143");
		Thread.sleep(2000);
		driver.findElement(By.id("password_step_input")).sendKeys("harrypotter");
		Thread.sleep(2000);
		WebElement datetextbox = driver.findElement(By.id("day"));
		Thread.sleep(1000);
		Select s1 = new Select(datetextbox);
		Thread.sleep(1000);
		s1.selectByValue("8");
		Thread.sleep(1000);
		WebElement monthtextbox = driver.findElement(By.id("month"));
		Thread.sleep(1000);
		Select s2 = new Select(monthtextbox);
		Thread.sleep(1000);
		s2.selectByVisibleText("Feb");
		Thread.sleep(1000);
		WebElement yeartextbox = driver.findElement(By.id("year"));
		Thread.sleep(1000);
		Select s3 = new Select(yeartextbox);
		Thread.sleep(1000);
		s3.selectByVisibleText("1998");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(1000);
		driver.close();

	}
}

