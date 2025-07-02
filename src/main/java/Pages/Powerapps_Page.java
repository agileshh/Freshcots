package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utills.Generic;

public class Powerapps_Page 
{
	  WebDriver driver;
	   
	   //Annotation
	  
	   @FindBy(xpath = "//*[@name = 'loginfmt']")
	   WebElement Login_textfield;
	  
	   @FindBy(xpath = "//*[@class= 'win-button button_primary high-contrast-overrides button ext-button primary ext-primary']")
	   WebElement SendButton_page;
	   
	   @FindBy(xpath = "//*[@name= 'passwd']")
	   WebElement Password_textfield;
	   
	   @FindBy(xpath = "//*[@type= 'submit']")
	   WebElement submitbutton_Auth;
	   
	   @FindBy(xpath = "//*[@id = 'idSIButton9']")
	   WebElement yesbutton;

	   @FindBy(xpath = "//input[@placeholder='Enter email']")
	   WebElement Email_ID_page;
	   
	   @FindBy(xpath = "//div[@class='appmagic-button-label no-focus-outline']")
	   WebElement Send_button_page;
	   
	   @FindBy(xpath = "(//*[@class = 'appmagic-text mousetrap block-undo-redo'])[2]")
	   WebElement OTP_box;
	   
	   @FindBy(xpath = "//iframe[@class = 'player-app-frame']")
	   WebElement iframe_page;
	   
	   @FindBy(xpath = "(//*[normalize-space() = 'Submit'])[1]")
	   WebElement SubmitButton_page;
	   
	   @FindBy(xpath = "(//*[@class = 'appmagic-image-pseudo-button'])[1]")
	   WebElement HamburgerMenu_page;
	   
	   @FindBy(xpath = "(//*[@class = 'appmagic-button middle center'])[6]")
	   WebElement UserVideoMenu_Page;
	   
	   @FindBy(xpath = "(//*[@class = 'appmagic-label-text'])[20]")
	   WebElement ViewVideobutton;
	   
	   @FindBy(xpath = "(//*[@class = 'appmagic-button middle center'])[1]")
	   WebElement Approvebutton_page;
	   
	   @FindBy(xpath = "(//*[@class = 'appmagic-button middle center'])[1]")
	   WebElement Rejectbutton_page;
	   
	   //Constructor
	   public Powerapps_Page(WebDriver driver)
	   {
		   this.driver = driver;
	       PageFactory.initElements(driver, this);
	   }
	   
	   //Action Class    
	   public void Login_textfield(String sent)
	   {
		   Generic.sendkeys(Login_textfield, sent, 20);;
	   }
	   
	   public void SendButton_page()
	   {    
		   Generic.Click(SendButton_page, 20);
	   }
	   
	   public void Password_textfield(String sent)
	   {
		   Generic.sendkeys(Password_textfield, sent, 20);;
	   }
	   
	   public void submitbutton_Auth()
	   {
		   Generic.Click(submitbutton_Auth, 10);
	   }
	   
	   public void yesbutton()
	   {
		   Generic.Click(yesbutton, 20);
	   }
	   
	   public void SwitchTO_iframe()
	   {
		   driver.switchTo().frame(iframe_page);
	   }
	   
	   public void Email_ID(String sent)
	   {
		   Generic.sendkeys(Email_ID_page, sent, 20);
	   }
	   
	   public void SendButton()
	   {
		   Generic.Click(Send_button_page, 20);
	   }
	   
	   public void OTP_box(String sent)
	   {
		   Generic.sendkeys(OTP_box, sent, 20);;
	   }
	   
	   public void SubmitButton()
	   {
		   Generic.Click(SubmitButton_page, 20);
	   }
	   
	   public void HamburgerMenu()
	   {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	       wait.until(ExpectedConditions.elementToBeClickable(HamburgerMenu_page));
		   Generic.Click(HamburgerMenu_page, 20);
	   }
	   
	   public void UserVideoMenu()
	   {
		   Generic.Click(UserVideoMenu_Page, 20);
	   }
	   
	   public void ViewVideobutton()
	   {
		   Generic.Click(ViewVideobutton, 20);
	   }
	   
	   public void Approvebutton()
	   {
		   Generic.Click(Approvebutton_page, 20);
	   }
	   
	   public void Rejectbutton()
	   {
		   Generic.Click(Approvebutton_page, 20);
	   }
}
