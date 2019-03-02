package TestNGListenerConcept;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	
	public static WebDriver driver;
	
	public static void initialization(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Infocampus\\Software\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	}
	public void failed(String testMethodName){
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile,new File("C:\\Infocampus\\examples\\ScreenShot\\CaptureScreenShot\\"+testMethodName+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
    public void passed(String testMethodName){
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile,new File("C:\\Infocampus\\examples\\ScreenShot\\CaptureScreenShot\\"+testMethodName+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
