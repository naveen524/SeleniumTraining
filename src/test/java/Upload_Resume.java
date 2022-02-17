import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_Resume {

public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.naukri.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.id("wdgt-file-upload")).click();
	Thread.sleep(2000);
	StringSelection selection = new StringSelection("C:\\Users\\Naresh Mannila\\Desktop\\Naveen Manneela 2.2 yrs Experince.docx");
	Thread.sleep(2000);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
	Thread.sleep(2000);
	Robot r= new Robot();
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_V);
	Thread.sleep(2000);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	r.keyRelease(KeyEvent.VK_V);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	driver.quit();
	Thread.sleep(2000);

}
}
