package Pages;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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
	static
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
	   
	   public static void ACS_Joinnow_button()
	   {
		   Generic.Click(ACS_Joinnow_button_page, 10);
	   }
	   
	   public static boolean Joinnow_button_Enabled()
	   {
		   return ACS_Joinnow_button_page.isEnabled();
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
	   
	   public void JoinNowButtonParticularTime() throws InterruptedException
	   {
		   String targetTimeStr = "07:00:00";
		   LocalTime targetTime = LocalTime.parse(targetTimeStr);
	       LocalDateTime targetDateTime = LocalDateTime.of(LocalDate.now().plusDays(1), targetTime);
           
	       System.out.println("Waiting until next day: " + targetDateTime);
	       
	       while (LocalDateTime.now().isBefore(targetDateTime)) 
	       {
	            long secondsRemaining = Duration.between(LocalDateTime.now(), targetDateTime).getSeconds();
	            System.out.println("Time remaining: " + secondsRemaining + " seconds");
	            Thread.sleep(10000); // check every 10 seconds
	        }
	       
	       // Give some buffer to let the UI enable the button
	        for (int i = 0; i < 12; i++) 
	        { 
	            if (ACS_Page.Joinnow_button_Enabled()) 
	            {
	            	ACS_Page.ACS_Joinnow_button();
	                return;
	            } else {
	                System.out.println("Button not yet enabled. Retrying...");
	                Thread.sleep(5000); // wait 5 sec and retry
	            }
	        }
	        throw new RuntimeException("Join button did not become enabled after reaching target time.");
	      }
	         
	   }

