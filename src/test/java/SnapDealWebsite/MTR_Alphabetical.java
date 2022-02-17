package SnapDealWebsite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//org.openqa.selenium.support.ui.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MTR_Alphabetical {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		ArrayList<Integer> al = new ArrayList<Integer>();
		driver.navigate().to("file:///C:/Users/Naresh%20Mannila/Desktop/MTR.html");
		driver.manage().window().maximize();
		WebElement mtrlistbox = driver.findElement(By.id("MTR"));
		Select s = new Select(mtrlistbox);
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
