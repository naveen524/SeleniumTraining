package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//find the elements
	//userName
	//password
	//login
	//newUser
	
	By userName = By.id("userName");
	By password = By.id("password");
	By loginBtn = By.id("login");
	By newUserBtn = By.id("newUser");
	
	//create actions
	public void enterUsername(String username) {
		driver.findElement(userName).sendKeys(username);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickLoginBtn() {
		driver.findElement(loginBtn).click();
	}
	
	public void clickNewUserBtn() {
		driver.findElement(newUserBtn).click();
	}

}
