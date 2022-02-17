package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.Enter;

public class LoginPage1 {
	WebDriver driver;
	@FindBy(id="name")
	public WebElement userName;
	@FindBy(id="password")
	public WebElement password;
	@FindBy(id="login")
	public WebElement loginbtn;
	public LoginPage1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
public void enterUserName(String uname) {
		
		userName.sendKeys(uname);
	}

	public void enterPassWord(String pname) {
		
		password.sendKeys(pname);
	}

	public void clickLoginButton() {
		
		loginbtn.click();
	}
}