package Data_Provider;

import org.testng.annotations.Test;

public class DataProvider {
@Test(dataProvider ="LoginDataProvider",dataProviderClass =CustomDataProvider.class)
public void login_Test(String name,String password)
{
	
}
}
