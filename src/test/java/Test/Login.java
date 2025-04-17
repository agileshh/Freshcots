package Test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Baseclass;
import Pages.LoginPage;

public class Login extends Baseclass
{
  public WebDriver driver;
  public LoginPage login;
  
  @BeforeTest
  public void setup() throws IOException
  {
	  driver= Initializebrowser("chrome");
  }
  
  @Test(priority = 0)
  public void Loginpage()
  {
    login = new LoginPage(driver);
	login.HomeLoginbutton();
  }
  
  @Test(priority = 1)
  public void Clickemptybutton()
  {
	  login = new LoginPage(driver);
	  boolean isdisplayed =login.sendbuttondisabled();
	  Assert.assertFalse(isdisplayed, "yes its displayed");
  }
  
  //@Test(priority = 4)
  public void Register()
  {
	   login = new LoginPage(driver);
	   login.registerbuttonlogin();
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   WebElement nextPageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='demo-customized-button']")));
	   Assert.assertTrue(nextPageElement.isDisplayed(), "Failed to navigate to the expected page.");
  }
  
  //@Test(priority = 2)
  public void Invalid_loginemail()
  {
	  login = new LoginPage(driver);
	  login.loginemail_Invalid("agil@gmeil.com");
  }
  
  @Test(priority = 2)
  public void Loginemail() throws InterruptedException 
  {
	login = new LoginPage(driver);
	login.loginemail("Agileshsakthi@gmail.com");
  }
   
  @Test(priority = 3)
  public void Sendotpbutton()
  {
	  login = new LoginPage(driver);
	  login.sendotpbutton();
	  try
	  {
		  WebElement nextPageElement = driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-bxmwoh']"));
		  Assert.assertTrue(nextPageElement.isDisplayed(), "Failed to navigate to the expected page.");
	  }catch(Exception e) {
		  Assert.fail("Element not found within timeout: Failed to navigate to the expected page.");
	  }
  }
  
  @Test(priority = 4)
  public void Editbutton()
  {
	  login = new LoginPage(driver);
	  login.Editmailidbutton();
	  try 
	  {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    WebElement nextpageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=':r24:']")));
		    Assert.assertTrue(nextpageElement.isDisplayed(), "Failed to navigate to the expected page.");
		} catch (Exception e) 
	    {
		    Assert.fail("Element not found within timeout: Failed to navigate to the expected page.");
		}
  }
  
  @Test(priority = 5)
  public void OTP() 
  {
	  login = new LoginPage(driver);
	  login.loginemail("Agileshsakthi@gmail.com");
	  login.sendotpbutton();
	  String otp = "1234";
	  login.enterOTP(otp);
  }    
  
 // @Test(priority= 6)
  public void Submit_button()
  {
	  login = new LoginPage(driver);
	  login.InvalidOTPcheck();
	  try 
	  {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    WebElement nextpageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Contact admin']")));
		    Assert.assertTrue(nextpageElement.isDisplayed(), "Failed to navigate to the expected page.");
		} catch (Exception e) 
	    {
		    Assert.fail("Element not found within timeout: Failed to navigate to the expected page.");
		}
  }
}
