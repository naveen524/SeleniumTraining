package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class FormPage1 {
	@FindBy(id = "country")
	public WebElement contry;
	@FindBy(id = "address")
	public WebElement address;
	@FindBy(id = "email")
	public WebElement email;
	@FindBy(id = "phone")
	public WebElement phone;
	@FindBy(id = "save")
	public WebElement save;
	public FormPage1(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}
	public void enterCountry(String cname) {

		contry.sendKeys(cname);
	}

	public void enterAddress(String aname) {

		address.sendKeys(aname);
	}

	public void enterEmail(String Ename) {

		email.sendKeys(Ename);
	}

	public void enterPhone(String pname) {

		phone.sendKeys(pname);
	}

	public void saveButton() {

		save.click();
	}
	
}