
package BankApplication;import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;import io.github.bonigarcia.wdm.WebDriverManager;public class ChangePassword {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/v4/index.php");
		//User ID :	mngr377966
		//Password :	Gurubank@143
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		FileInputStream fis=new FileInputStream("C:/Users/Naresh Mannila/Desktop/ChangePassword.xls");
		Thread.sleep(2000);
		HSSFWorkbook workbook=new HSSFWorkbook(fis);
		Thread.sleep(2000);
		HSSFSheet sheet = workbook.getSheet("Sheet1");
		Thread.sleep(2000);
		String UserID1 = sheet.getRow(1).getCell(0).toString();
		Thread.sleep(2000);
		String password1 = sheet.getRow(1).getCell(1).toString();
		Thread.sleep(2000);
		driver.findElement(By.name("uid")).sendKeys(UserID1);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(password1);
		Thread.sleep(2000);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Change Password']")).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Change Password']")).click();
		Thread.sleep(3000);
		String OldPassword1 = sheet.getRow(1).getCell(2).toString();
		Thread.sleep(2000);
		String NewPassword1 = sheet.getRow(1).getCell(3).toString();
		Thread.sleep(2000);
		String ConfirmPassword1 = sheet.getRow(1).getCell(4).toString();
		Thread.sleep(2000);
		driver.findElement(By.name("oldpassword")).sendKeys(OldPassword1);
		Thread.sleep(2000);
		driver.findElement(By.name("newpassword")).sendKeys(NewPassword1);
		Thread.sleep(2000);
		driver.findElement(By.name("confirmpassword")).sendKeys(ConfirmPassword1);
		Thread.sleep(2000);
		driver.findElement(By.name("sub")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		String UserID2 = sheet.getRow(2).getCell(0).toString();
		Thread.sleep(2000);
		String password2 = sheet.getRow(2).getCell(1).toString();
		Thread.sleep(2000);
		driver.findElement(By.name("uid")).sendKeys(UserID2);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(password2);
		Thread.sleep(2000);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Change Password']")).click();
		Thread.sleep(2000);
		String OldPassword2 = sheet.getRow(2).getCell(2).toString();
		Thread.sleep(2000);
		String NewPassword2 = sheet.getRow(2).getCell(3).toString();
		Thread.sleep(2000);
		String ConfirmPassword2 = sheet.getRow(2).getCell(4).toString();
		Thread.sleep(2000);
		driver.findElement(By.name("oldpassword")).sendKeys(OldPassword2);
		Thread.sleep(2000);
		driver.findElement(By.name("newpassword")).sendKeys(NewPassword2);
		Thread.sleep(2000);
		driver.findElement(By.name("confirmpassword")).sendKeys(ConfirmPassword2);
		Thread.sleep(2000);
		driver.findElement(By.name("sub")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
	}
}

