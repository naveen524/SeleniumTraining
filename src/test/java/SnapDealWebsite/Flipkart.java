package SnapDealWebsite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.flipkart.com/asian-wndr-13-sports-shoes-men-latest-stylish-casual-sport-running-boys-lace-up-lightweight-grey-running-walking-gym-trekking-hiking-party-running/p/itmff96xgyjjf3fx?pid=SHOF3KF5JPC9Q9XG&lid=LSTSHOF3KF5JPC9Q9XGZHO2VN&marketplace=FLIPKART&store=osp%2Fcil&srno=b_1_11&otracker=nmenu_sub_Men_0_Footwear&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_5_L1_view-all&fm=organic&iid=8f5c81dd-9823-48df-a286-1d2cc47c25f0.SHOF3KF5JPC9Q9XG.SEARCH&ppt=browse&ppn=browse&ssid=csel0n0m7k0000001640830876379");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[text()='9']")).click();
	driver.findElement(By.xpath("//button[normalize-space()='ADD TO CART']")).click();
	//driver.findElement(By.xpath("//button[normalize-space()='ADD TO CART']")).click();

	
}
}
