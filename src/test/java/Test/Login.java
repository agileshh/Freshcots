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
  
  @BeforeMethod
  public void setup() throws IOException
  {
	  driver= Initializebrowser("chrome");
  }
  
  @Test(priority = 1)
  public void Clickemptybutton()
  {
	  login = new LoginPage(driver);
	  login.HomeLoginbutton();
	  boolean isdisplayed =login.sendbuttondisabled();
	  Assert.assertFalse(login.sendbuttondisabled(), "yes its displayed");
  }
  
  @Test(priority = 2)
  public void Register()
  {
	   login = new LoginPage(driver);
	   login.HomeLoginbutton();
	   login.registerbuttonlogin();
	   Assert.assertTrue(login.RegisterpageVerify_page(), "Navigating to register page");
  }
  
  @Test(priority = 3)
  public void Invalid_loginemail() throws InterruptedException
  {
	  login = new LoginPage(driver);
	  login.HomeLoginbutton();
	  Thread.sleep(4000);
	  login.loginemail_Invalid("agil@gmeil");
	  login.sendotpbutton();
	  String ActualText= "Please enter a valid email id";
	  String ExpectedText = login.WarningmsgEmail();
	  Assert.assertEquals(ExpectedText, ActualText, "Failed to capture the same message");
  }
  
  @Test(priority = 4)
  public void EditotpbuttonVerify() throws InterruptedException
  {
	  login = new LoginPage(driver);
	  login.HomeLoginbutton();
	  Thread.sleep(4000);
	  login.loginemail("saginomo@polkaroad.net");
	  login.sendotpbutton();
	  login.EditbuttonOTPClick();
	  Assert.assertTrue(login.EditbuttonOTP(),"Navigating to Edit page");
  } 
            
  @Test(priority = 5)
  public void EditbuttonNavigation() throws InterruptedException
  {
	  login = new LoginPage(driver);
	  Thread.sleep(4000);
	  login.HomeLoginbutton();
	  Thread.sleep(4000);
	  login.loginemail("saginomo@polkaroad.net");
	  login.sendotpbutton();
	  login.EditbuttonOTPClick();
	  Thread.sleep(4000);
	  login.loginemail("hybefo@azuretechtalk.net");
	  login.sendotpbutton();  
  }
  
  @Test(priority = 6)
  public void ValidOTP() throws InterruptedException 
  {
	  login = new LoginPage(driver);
	  login.HomeLoginbutton();
	  Thread.sleep(4000);
	  login.loginemail("saginomo@polkaroad.net");
	  login.sendotpbutton();
	  String otp = "1847";
	  login.enterOTP(otp);
	  login.ValidOTP();
  }    
  
  @Test(priority= 7)
  public void InvalidOTP_Button() throws InterruptedException
  {
	  login = new LoginPage(driver);
	  login.HomeLoginbutton();
	  Thread.sleep(4000);
	  login.loginemail("hybefo@azuretechtalk.net");
	  login.sendotpbutton();
	  String otp = "1857";
	  login.enterOTP(otp);
	  login.InvalidOTPcheck();
	  Assert.assertTrue(login.ContactAdminActionVerify(), "Not displayed");  
  } 
  
  @AfterMethod
  public void cleanUp() 
  {
	driver.quit();
  }
}
