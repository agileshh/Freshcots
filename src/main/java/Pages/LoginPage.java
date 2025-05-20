package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utills.Generic;

public class LoginPage extends Generic
{
   WebDriver driver;
   
   //Annotation
   @FindBy(xpath = "//button[normalize-space()='Login']")
   WebElement Homeloginbuttonpage;
   
   @FindBy(xpath="//input[@type ='email']")
   //@FindBy(xpath = "//input[@id=':r19:']")  
   WebElement loginemailpage;
   
   @FindBy(xpath="//button[normalize-space()='Send OTP']")
   WebElement sendotpbuttonpage;
   
   @FindBy(xpath = "//a[normalize-space()='Register']")
   WebElement registerbuttonloginpage;
   
   @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 cursor-pointer css-kx2ky3']")
   WebElement Editmailidbuttonpage;
   
   @FindBy(xpath = "//input[@pattern = '[0-9]*']")
   List<WebElement> otpFields;

   @FindBy(xpath = "//button[normalize-space()='Submit']")
   WebElement submitbuttonpage;
   
   //Constructor
   public LoginPage(WebDriver driver)
   {
	   this.driver = driver;
       PageFactory.initElements(driver, this);
   }
   
   //Action class
   public void HomeLoginbutton()
   {
	   Generic.Click(Homeloginbuttonpage, 0);
   }
   
   public void loginemail(String text)
   {
	 Generic.sendkeys(loginemailpage, text, 10);
   }
   
   public void sendotpbutton()
   {
	   Generic.Click(sendotpbuttonpage, 0);
   }
   
   public boolean sendbuttondisabled()
   {
	   return sendotpbuttonpage.isEnabled();
   }
   
   public void registerbuttonlogin()
   {
	   Generic.Click(registerbuttonloginpage, 0);
   }
   
   public void Editmailidbutton()
   {
	   Generic.Click(Editmailidbuttonpage, 0);
   }
   
   public void loginemail_Invalid(String sent)
   {
	 Generic.sendkeys(loginemailpage, sent, 10);
   }
   
   public void enterOTP(String otp)
   {
       for (int i = 0; i < otp.length(); i++) 
       {
          otpFields.get(i).sendKeys(String.valueOf(otp.charAt(i)));
       }
   }
   
   public void InvalidOTPcheck()
   {
	   Generic.ContinuosClick(submitbuttonpage, 5);;
   }
   
   public void ValidOTP()
   {
	   Generic.Click(submitbuttonpage, 5);
   }
}


