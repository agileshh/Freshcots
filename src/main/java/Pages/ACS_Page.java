package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utills.Generic;


public class ACS_Page 
{
	   WebDriver driver;
	   
	   //Annotation
	   
	   @FindBy(xpath = "//span[normalize-space()='Interview']")
	   WebElement Interview_dropdown_page;
	   
	   @FindBy(xpath = "//*[normalize-space() = 'Upcoming']")
	   WebElement UpcomingTab_nav;
	   
	   @FindBy(xpath = "//button[normalize-space()='Join Now']")
	   WebElement ACS_Joinnow_button_page;
	   
	   @FindBy(xpath = "//span[@id='id__21']")
	   WebElement ACS_CamaraIcon_page;
	   
	   @FindBy(xpath = "//button[@aria-label='Mic']")
	   WebElement ACS_MicIcon_page;
	   
	   @FindBy(xpath = "(//*[normalize-space() = 'Start call'])[5]")
	   WebElement ACS_startcall_page;
	   
	   @FindBy(xpath = "//button[@aria-label='Close']//span[@class='ms-Button-flexContainer flexContainer-227']")
	   WebElement Recording_CancelIcon_page;
	   
	   @FindBy(xpath = "//button[normalize-space()='View Candidate Profile']")
	   WebElement ViewCandidateprofile_page;
	   
	   @FindBy(xpath = "//button[@aria-label='Leave']")
	   WebElement Leavebutton_page;
	   
	   @FindBy(xpath = "(//span[normalize-space() = 'Leave'])[1]")
	   WebElement COnfirmLeave_button_Page;
	   
	   //Constructor
	   public ACS_Page(WebDriver driver)
	   {
		   this.driver = driver;
	       PageFactory.initElements(driver, this);
	   }
	   
	   //Action Class
	   public void Interview_dropdown()
	   {
		   Generic.Click(Interview_dropdown_page, 10);
	   }
	   
	   public void ACS_Joinnow_button()
	   {
		   Generic.Click(ACS_Joinnow_button_page, 10);
	   }
	   
	   public void ACS_CamaraIcon()
	   {
		   Generic.Click(ACS_CamaraIcon_page, 10);
	   }
	   
	   public void ACS_MicIcon()
	   {
		   Generic.Click(ACS_MicIcon_page, 10);
	   }
	   
	   public void ACS_startcall()
	   {
		   Generic.Click(ACS_startcall_page, 15);
	   }
	   
	   public void Recording_CancelIcon()
	   {
		   Generic.Click(Recording_CancelIcon_page, 10);
	   }
	   
	   public void ViewCandidateprofile()
	   {
		   Generic.Click(ViewCandidateprofile_page, 10);
	   }
	   
	   public void Leavebutton()
	   {
		   Generic.Click(Leavebutton_page, 10);
	   }
	   
	   public void ConfirmLeave_button()
	   {
		   Generic.Click(COnfirmLeave_button_Page, 10);
	   }
	   
	   public void UpcomingTab_nav()
	   {
		   Generic.Click(UpcomingTab_nav, 10);
	   }
}
