package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	//all the elements in the homepage and its actions
		//Step 1: Create a constructor - webdriver
		//step 2: find elements using By class and store as attributes
		//step 3: create methods for actions on those elements
		
		WebDriver driver;
		//step 1:
		public HomePage(WebDriver driver) {
			this.driver = driver;
			
		}
		
		//Step 2
		By loginBtn = By.id("login");
		
		//Step 3
		public void clickLogin() {
			driver.findElement(loginBtn).click();
		}

	}