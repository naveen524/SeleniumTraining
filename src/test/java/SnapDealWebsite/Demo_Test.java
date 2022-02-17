package SnapDealWebsite;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo_Test {
	@Test(groups = {"Smoke test","Regression test"})

	public void createCustomer()
	{
		Reporter.log("createCustomer",true);
	}
	@Test(groups = {"Regression"})
	public void modifyCustomer()
	{
		Reporter.log("modifyCustomer",true);
	}
	@Test(groups = {"Regression test"})
	public void deleteCustomer()
	{
		Reporter.log("deleteCustomer",true);
	}
}
