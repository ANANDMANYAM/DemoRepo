package TestNGListenerConcept;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomerListener.class)
public class ScreenShotTest extends Base{
	
	@BeforeMethod
	public void setUp(){

		initialization();
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
		
	}
	@Test(enabled = false)
	public void takeScreenShotTest(){
		Assert.assertEquals(false,true);
		
	}
	@Test
	public void screenShot(){
		 boolean actualTest = driver.findElement(By.xpath("//button[@id='u_0_11']")).isEnabled();
		
		System.out.println(actualTest);
		
		Assert.assertEquals(actualTest, true);
	}
	
	
	
	

}
