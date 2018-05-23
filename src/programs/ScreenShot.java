package programs;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.*;

import org.openqa.selenium.*;



public class ScreenShot {
	
	public static WebDriver driver; 
	
	 @Test
	  public void testScripts() throws Exception{
		 ScreenShotScreen();
	 }
	
	 @BeforeClass
		public void testSetup() {
		 	System.setProperty("webdriver.chrome.driver","/home/nadsoft/AutomationSoftware/ChromrDriver/chromedriver"); 
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		@AfterClass
		public void tearDown() {
			//driver.quit();
		} 
		
		public void ScreenShotScreen() throws Exception{
			
			driver.get("https://www.diffchecker.com/diff");
			Thread.sleep(2000);
			
			// Take screenshot and store as a file format
			File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
			 // now copy the  screenshot to desired location using copyFile //method
				FileUtils.copyFile(src, new File("/home/nadsoft/Desktop/screenShotPic/error.png"));
			}catch (IOException e)
			 {
				  System.out.println(e.getMessage());
				 
				 }	
		}
		
		
		
		
}
