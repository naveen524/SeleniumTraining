package DataDrivenframework;

import org.openqa.jetty.html.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyTC105 {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// open Demo guru 99 bank
		// enter userid
		// enter password
		// submit button
		// then go to fund transfer, select
		// enter payers acc no
		// enter payee acc no
		// give the amount which need to be transfered
		// givve description
		// click submit button

		driver.get("https://demo.guru99.com/v4/");
        Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("22675");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Payal@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Fund Transfer')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='payersaccount']")).sendKeys("99650");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='payeeaccount']")).sendKeys("99653");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='ammount']")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='desc']")).sendKeys("Personal transaction");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();
		if (driver.findElement(By.xpath("//p[contains(text(),'Fund Transafer Details for Account No: 99650')]"))
				.isDisplayed());
		Thread.sleep(2000);
		System.out.println("Transaction Successful");

		// p[contains(text(),Fund Transafer Details for Account No: 99650)]
		// then click home buton
		// choose balance enquiry option
		// select acc no
		// click submit
		// again home
		// finally logout button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Balance Enquiry')]")).click();
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//select[@name='accountno']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();

		/*
		 * WebElement Balance = driver.findElement(By.xpath(
		 * "/html/body/table/tbody/tr/td/table/tbody/tr[16]/td[2]]"));
		 * 
		 * 
		 * System.out.println("Balance is:" +" " + Balance.getText());
		 */
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
