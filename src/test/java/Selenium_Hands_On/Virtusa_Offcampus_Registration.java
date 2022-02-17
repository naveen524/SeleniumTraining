package Selenium_Hands_On;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Virtusa_Offcampus_Registration {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://forms.office.com/Pages/ResponsePage.aspx?id=DBaFDZlYykSsyNsVAbmTtuiBamn-SfVFjX3_NuNm4TZUOEJJTk1CNk5CNUk5Mk4wWjMzUUI3MzlKTC4u");
	driver.findElement(By.xpath("(//input[@class='office-form-question-textbox office-form-textfield-input form-control office-form-theme-focus-border border-no-radius'])[1]")).sendKeys("Naveen Manneela");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@class='office-form-question-textbox office-form-textfield-input form-control office-form-theme-focus-border border-no-radius'])[2]")).sendKeys("naveenmanneela24@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@class='office-form-question-textbox office-form-textfield-input form-control office-form-theme-focus-border border-no-radius'])[3]")).sendKeys("6302707546");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@class='office-form-question-textbox office-form-textfield-input form-control office-form-theme-focus-border border-no-radius'])[4]")).sendKeys("sri venkateswara instituite of technology");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@type='radio'])[6]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//i[@class='ms-Icon ms-Icon--ChevronDown select-placeholder-arrow forms-icon-size14x14']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[text()='All Clear'])")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@class='office-form-question-textbox office-form-textfield-input form-control office-form-theme-focus-border border-no-radius'])[5]")).sendKeys("Btm 2nd stage");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@type='radio'])[11]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@class='office-form-question-textbox office-form-textfield-input form-control office-form-theme-focus-border border-no-radius'])[6]")).sendKeys("automation");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@class='office-form-other-answer-textbox office-form-textfield-input form-control office-form-theme-focus-border border-no-radius'])[2]")).sendKeys("automation testing");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@type='radio'])[22]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()='Submit']")).click();
    Thread.sleep(1000);
    driver.close();
    Thread.sleep(1000);
    
}
}
