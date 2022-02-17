import org.testng.annotations.Test;

public class Listner_Demo_Test extends Base_Test {
@Test
public void launchApp()
{
	driver.navigate().to("https://www.ebay.com/");
	driver.manage().window().maximize();
}
}
