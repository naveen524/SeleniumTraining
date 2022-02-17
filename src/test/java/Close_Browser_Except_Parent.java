import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Close_Browser_Except_Parent {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().window().maximize();
		String parentwh = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		for (String wh : allwh) {
		driver.switchTo().window(wh);
		if(wh.equals(parentwh))
		{
			
		}
		else
		{
			driver.close();
		}
		}
	}
}