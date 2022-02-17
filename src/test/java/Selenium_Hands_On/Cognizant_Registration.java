package Selenium_Hands_On;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cognizant_Registration {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.myamcat.com/jobRegistrationForm?id=cts_offcampus_ArtnS");
	driver.findElement(By.xpath("(//input[@class='button_id'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("prefRole")).sendKeys("IT Programmer Trainee");
	Thread.sleep(2000);
	driver.findElement(By.name("firstName")).sendKeys("Manneela");
	Thread.sleep(2000);
	driver.findElement(By.name("lastName")).sendKeys("Naveen");
	Thread.sleep(2000);
	driver.findElement(By.name("mobileNumber")).sendKeys("6302707546");
	Thread.sleep(2000);
	driver.findElement(By.name("gender")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("emailID")).sendKeys("naveenmanneela@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.name("reemailID")).sendKeys("naveenmanneela@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.name("dob")).sendKeys("08-02-1998");
	Thread.sleep(2000);
	driver.findElement(By.name("nationality")).sendKeys("Indian");
	Thread.sleep(2000);
	driver.findElement(By.name("percentage10")).sendKeys("8.5");
	Thread.sleep(2000);
	driver.findElement(By.name("passingYear10")).sendKeys("2015");
	Thread.sleep(2000);
	driver.findElement(By.name("percentage12")).sendKeys("7.5");
	Thread.sleep(2000);
	driver.findElement(By.name("passingYear12")).sendKeys("2015");
	driver.findElement(By.name("gradDegree")).sendKeys("Others");
	Thread.sleep(2000);
	driver.findElement(By.name("othersgradDegree")).sendKeys("B.Tech");
	Thread.sleep(2000);
    driver.findElement(By.name("degreeSpecialisation")).sendKeys("Computer Science");
    Thread.sleep(2000);
    driver.findElement(By.name("otherDegreeSpecialisation")).sendKeys("No");
    Thread.sleep(2000);
    driver.findElement(By.name("gradPercentage")).sendKeys("6.5");
    Thread.sleep(2000);
    driver.findElement(By.name("completionYear")).sendKeys("2019");
    Thread.sleep(2000);
    driver.findElement(By.name("gradbacklogs")).sendKeys("0");
    Thread.sleep(2000);
    driver.findElement(By.name("collegeName")).sendKeys("Sri Venkateswara Instituite Of Technology");
    Thread.sleep(2000);
    driver.findElement(By.name("state_2")).sendKeys("Andhra Pradesh");
    Thread.sleep(2000);
    driver.findElement(By.name("city_2")).sendKeys("Anantapur");
    Thread.sleep(2000);
    driver.findElement(By.name("uniRegNumber")).sendKeys("159F1A0524");
    Thread.sleep(2000);
    driver.findElement(By.name("pAddress1")).sendKeys("Pailaboyalapalli(V),Chennekothapalli(M),Anantapur(D),Andra Pradesh(s)");
    Thread.sleep(2000);
    driver.findElement(By.name("state_1")).sendKeys("Andhra Pradesh");
    Thread.sleep(2000);
    driver.findElement(By.name("city_1")).sendKeys("Anantapur");
    Thread.sleep(2000);
    driver.findElement(By.name("pinCodeCurrentAddress")).sendKeys("515101");
    Thread.sleep(2000);
    driver.findElement(By.name("flexibility")).sendKeys("Yes");
    Thread.sleep(2000);
    driver.findElement(By.name("fatherName")).sendKeys("M.Anjaneyulu");
    Thread.sleep(2000);
    driver.findElement(By.name("eduGap")).sendKeys("0");
    Thread.sleep(2000);
    driver.findElement(By.name("pancard")).sendKeys("CAEPN9570Q");
    Thread.sleep(2000);
    driver.findElement(By.name("Submit")).click();
    Thread.sleep(2000);
    driver.close();
}
}

