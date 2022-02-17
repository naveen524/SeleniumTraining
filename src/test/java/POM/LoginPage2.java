package POM;

public class LoginPage2{
WebDriver driver;
	
	public LoginPage2(WebDriver driver) {
		this.driver = driver;
	}
	
	//find the elements
	//userName
	//password
	//login
	//newUser
	
	By fullName = By.id("name");
	By password = By.id("password");
	By loginBtn = By.id("login");
	
	
	//create actions
	public void enterFullName(String username) {
		driver.findElement(fullName).sendKeys(username);
	}
	
	public void enterPassWord(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickLoginButton() {
		driver.findElement(loginBtn).click();
	}
	
	
}
