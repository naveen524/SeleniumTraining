package Selenium_Hands_On;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart24 {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.flipkart.com/asian-bouncer-01-running-shoes-boys-sports-men-latest-stylish-casual-sneakers-lace-up-lightweight-grey-running-walking-gym-trekking-hiking-party/p/itmeadf4da186692?pid=SHOFV3H7BQMTMXHX&lid=LSTSHOFV3H7BQMTMXHXOUGAYV&marketplace=FLIPKART&store=osp%2Fcil&srno=b_1_11&otracker=nmenu_sub_Men_0_Footwear&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_5_L1_view-all&fm=organic&iid=en_iCI36RZthGqEXiV6dI9XE7UZ4vcCyiFRbMmFG%2B19B43ZwPbPstk61cYTUUQ03fySGW8jDhH%2Bd%2BbwM03RUMyJgw%3D%3D&ppt=browse&ppn=browse&ssid=dshy42r2lc0000001643090548272");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='9']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[@class='col col-6-12']//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
}
}
