package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver idriver;
public LoginPage(WebDriver rdriver)
{
	rdriver= idriver;
	PageFactory.initElements(rdriver, this);
}
@FindBy(name="")
{
	WebElement txtUserName;
}
}
