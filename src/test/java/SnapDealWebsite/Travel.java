package SnapDealWebsite;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Travel {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.mercurytravels.co.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement Select_Holiday_Type = driver.findElement(By.id("themes"));
		Select s= new Select(Select_Holiday_Type);
		List<WebElement> alloptions = s.getOptions();
		int count = alloptions.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text = alloptions.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}
}
