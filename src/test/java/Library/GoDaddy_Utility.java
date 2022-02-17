package Library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GoDaddy_Utility {
	public static WebDriver driver;
public static void takes_Screenshot(WebDriver driver,String screenshot_Name) throws IOException
{
	try {
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("./Screenshot/"+screenshot_Name+".png");
	FileUtils.copyFile(source, destination);
	
}
	catch(Exception e){
		System.out.println("Exception while taking screenshot:"+e.getMessage());
	}
}
}
