package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage {
WebDriver driver;
	
	public FormPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//find the elements
	//country
	//address
	//email
	//phone
	
	By country = By.id("country");
	By address = By.id("address");
	By e_Email = By.id("email");
	By p_phone = By.id("phone");
	By saveBtn = By.id("save");
	By logoutBtn = By.id("logout");
	
	//create actions
	public void enterCountry(String coun) {
		driver.findElement(country).sendKeys(coun);
	}
	
	public void enterAddress(String add) {
		driver.findElement(address).sendKeys(add);
	}
	
	
	public void enterEmail(String email) {
		
		driver.findElement(e_Email).sendKeys(email);
		
	}
		
	public void enterPhone(String phone) {
	driver.findElement(p_phone).sendKeys(phone);
	}
	
	public void clickSaveBtn() {
		driver.findElement(saveBtn).click();
	}
	
	public void clickLogoutBtn() {
		driver.findElement(logoutBtn).click();
	}
}
