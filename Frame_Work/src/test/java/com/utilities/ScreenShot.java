package com.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

public class ScreenShot extends BaseClass 
{

	public void takeScreenShot (String screenShotImageName) throws IOException 
	{
		String timeStamp;
		File screenShotName;
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);	// TakesScreenshot = interface (Entire page, Current window, Visible portion of the current frame, The screenshot of the entire display containing the browser
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		String screenShotPath=System.getProperty("user.dir")+"/ScreenShot/"+screenShotImageName+ "-" +timeStamp+".png";
		System.out.println("Screen shot path:"+screenShotPath);
		screenShotName = new File (screenShotPath);
		FileUtils.copyFile(srcFile,screenShotName);
		String filePath = screenShotName.toString();  // Report Generate
		String path = "<img src = \"file://" +filePath+ "\" alt = \"\"/>"; // For Report Generate
		Reporter.log(path);
		}	
}
