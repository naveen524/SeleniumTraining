package Data_Provider;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
@DataProvider(name="LoginDataProvider")
public Object[][] getData()
{

	Object[][] data={ {"mngr374178","nejEmas"},{"mngr367950","Gurubank@143"},{"mngr374182","zEbAqUv"}};
	return data;
}
}
