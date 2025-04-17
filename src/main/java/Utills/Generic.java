package Utills;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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
		catch(Exception e)
		{
			System.out.println("Exception while clicking on element: " + element.toString());
	        e.printStackTrace();
		}
	}
}
