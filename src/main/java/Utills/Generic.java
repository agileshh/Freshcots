package Utills;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Pages.ACS_Page;
import Pages.Candidate_Availability_Page;
import Pages.Expert_Schedule_Page;
import Pages.LoginPage;
import Pages.Rating_and_Review_page;

public class Generic 
{
    public static WebDriver driver;
    
	public static void Click(WebElement element,long wait)
    {
	  try
	  {
	   WebDriverWait waitish = new WebDriverWait(driver, Duration.ofSeconds(wait));
	   waitish.until(ExpectedConditions.elementToBeClickable(element)).click();
	  }  
	  catch  (Exception e) {
        System.out.println("Exception while clicking on element: " + element.toString());
        e.printStackTrace();
      }
    }
	
	public static void sendkeys(WebElement element,String text,long wait)
    {
	  try
	  {
	   WebDriverWait waitish = new WebDriverWait(driver, Duration.ofSeconds(wait));
	   waitish.until(ExpectedConditions.visibilityOf(element));
	   element.sendKeys(Keys.CONTROL + "a");
	   element.sendKeys(Keys.DELETE);
	   element.sendKeys(text);
	  }  
	  catch  (Exception e) 
	  {
        System.out.println("Exception while sending to element: " + element.toString());
        e.printStackTrace();
      }
    }
	
	public static void ContinuosClick(WebElement element, long wait)
	{
		try
		{
			WebDriverWait waitish =new WebDriverWait(driver, Duration.ofSeconds(wait));
			waitish.until(ExpectedConditions.elementToBeClickable(element));
			for(int i =0;i<6;i++)
			{
				element.click();
			}			
		}
		catch(Exception e){
			System.out.println("Exception while clicking on element: " + element.toString());
	        e.printStackTrace();
		}
	}
	
	public static void loginWithOTP(LoginPage loginPage,String KeyPrefix) throws InterruptedException 
	{
        loginPage.HomeLoginbutton();
        String email = ConfigReader.getProperty(KeyPrefix+ ".email");
        String otp = ConfigReader.getProperty(KeyPrefix+ ".otp");
        Thread.sleep(3000);
        loginPage.loginemail(email);
        loginPage.sendotpbutton();
        loginPage.enterOTP(otp);
        loginPage.ValidOTP();
    }
		
	public static void logout(LoginPage loginPage) 
	{
	        loginPage.Logout_button();
	        loginPage.Logout_Popup();
	}
		 
	 public static void RefreshPage(WebDriver driver) 
	 {
		 driver.navigate().refresh();
	 }
}
