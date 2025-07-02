package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utills.Generic;

public class Expert_Schedule_Page 
{
	   
	   WebDriver driver;
	   
	   //Annotation
	   @FindBy(xpath = "//button[normalize-space()='Logout']")
	   WebElement logout_Page;
	   
	   @FindBy(xpath = "//span[normalize-space()='Interview']")
	   WebElement Interview_dropdown_page;
	   
	   @FindBy(xpath = "//span[normalize-space()='Pick Candidate']")
	   WebElement PickCandidate_page;
	   
	   @FindBy(xpath = "//span[normalize-space()='Upcoming']")
	   WebElement Upcoming_page;
	   
	   @FindBy(xpath = "(//*[@class = 'MuiTypography-root MuiTypography-body1 css-epz3qv'])[2]")
	   WebElement SelectSlot1_page;
	   
	   @FindBy(xpath = "//button[normalize-space()='07:00 AM']")
	   WebElement Choose_time1_page;
	   
	   @FindBy(xpath = "//button[normalize-space()='07:30 AM']")
	   WebElement Choose_time2_page;
	   
	   @FindBy(xpath = "//button[normalize-space()='Cancel']")
	   WebElement Cancelbutton_Page;
	   
	   @FindBy(xpath = "(//div[@class = 'MuiGrid2-root MuiGrid2-direction-xs-row css-1n5khr6'])[2]")
	   WebElement Disabled_Confirmbutton_Page;
	   
	   @FindBy(xpath = "//button[normalize-space()='Confirm']")
	   WebElement Confirmbutton_Page;
	   
	   @FindBy(xpath = "//*[@aria-label= 'Interview scheduled candidates count']")
	   WebElement InterviewSchedule_Icon_Page;
	   
	   @FindBy(xpath = "//button[normalize-space()='Upcoming']")
	   WebElement Upcomingtab_button_Page;
	   
	   @FindBy(xpath = "(//*[normalize-space() = 'Decline'])[1]")
	   WebElement Decline_button_page;
	   
	   @FindBy(xpath = "//*[@placeholder = 'Type here']")
	   WebElement Decline_reason_page;
	   
	   @FindBy(xpath = "(//*[normalize-space() = 'Decline'])[2]")
	   WebElement Decline_button_popup_page;
	   
	   @FindBy(xpath = "(//p[normalize-space()='Interview Completed'])[1]")
	   WebElement Interview_Completed_Card1_page;
	   
	   @FindBy(xpath = "(//p[normalize-space()='Interview Completed'])[2]")
	   WebElement Interview_Completed_Card2_page;
	   
	   @FindBy(xpath = "//p[normalize-space()='Network Error']")
	   WebElement Network_error_card2_page;
	   
	   @FindBy(xpath = "(//p[normalize-space()='Candidate Absent'])[1]")
	   WebElement Candidate_absent_card1_page;
	   
	   @FindBy(xpath = "//button[normalize-space()='Yes']")
	   WebElement Status_Yes_Confirmation_page;
	   
	   @FindBy(xpath = "//button[normalize-space()='No']")
	   WebElement Status_No_Confirmation_page;
	   
	   @FindBy(xpath = "//p[text() = 'Automation']")
	   WebElement CandidateCard_Page;
	   
	   @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1i4s2mp']")
	   WebElement Interview_Missed_Page;
	   
	   @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-afpww']")
	   WebElement Interview_NetworkError_Page;
	   
	   @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-saq60u']")
	   WebElement Interviewer_StatusnotProvided_Page;
	   	   
	   //Constructor
	   public Expert_Schedule_Page(WebDriver driver)
	   {
		   this.driver = driver;
	       PageFactory.initElements(driver, this);
	   }
	   
	   //Action Class
	   public void logout()
	   {
		   Generic.Click(logout_Page, 10);
	   }
	   
	   public void Interview_dropdown()
	   {
		   Generic.Click(Interview_dropdown_page, 10);
	   }
	   
	   public void PickCandidate()
	   {
		   Generic.Click(PickCandidate_page, 10);
	   }
	   
	   public void Upcoming()
	   {
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", Upcoming_page);
	        js.executeScript("arguments[0].click();", Upcoming_page);
	   }
	   
	   public void SelectSlot1()
	   {
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", SelectSlot1_page);
	        js.executeScript("arguments[0].click();", SelectSlot1_page);
	   }
	   
	   public boolean SelectSlot1_IsEnabled()
	   {
		    List<WebElement> element = driver.findElements(By.xpath("(//*[@class = 'MuiTypography-root MuiTypography-body1 css-epz3qv'])[2]"));
		    return !element.isEmpty() && element.get(0).isEnabled();
	   }
	   
	   public void Choose_time1()
	   {
		   Generic.Click(Choose_time1_page, 10);
	   }
	   
	   public void Choose_time2()
	   {
		   Generic.Click(Choose_time2_page, 10);
	   }
	   
	   public void Cancelbutton()
	   {
		   Generic.Click(Cancelbutton_Page, 10);
	   }
	   
	   public void Confirmbutton()
	   {
		   Generic.Click(Confirmbutton_Page, 10);
	   }
	   
	   public boolean Disabled_Confirmbutton()
	   {
		   return Disabled_Confirmbutton_Page.isEnabled();
	   }
	   
	   public boolean InterviewSchedule_Icon()
	   {
		   return InterviewSchedule_Icon_Page.isDisplayed();
	   }
	   
	   public boolean Choose_time1_Verify()
	   {
		   return Choose_time1_page.isSelected();
	   }
	   
	   public void Candidate_absent()
	   {
		   Generic.Click(Candidate_absent_card1_page, 10);
	   }
	   
	   public void Interview_Completed_Card1()
	   {
		   Generic.Click(Interview_Completed_Card1_page, 10);
	   }
	   
	   public void Network_error_card2()
	   {
		   Generic.Click(Network_error_card2_page, 10);
	   }
	   
	   public boolean CandidateCard()
	   {
		   return driver.findElements(By.xpath("//p[text() = 'Automation']")).size() > 0; 
	   }
	   
	   public void Status_Yes_Confirmation()
	   {
		   Generic.Click(Status_Yes_Confirmation_page, 10);
	   }
	   
	   public void Decline_button()
	   {
		   Generic.Click(Decline_button_page, 10);
	   }
	   
	   public void Decline_reason_page(String sent)
	   {
		   Generic.sendkeys(Decline_reason_page, sent, 10);
	   }
	   
	   public void Decline_button_popup()
	   {
		   Generic.Click(Decline_button_popup_page, 10);
	   }
	   
	   public String Interview_Missed()
	   {
		   return Interview_Missed_Page.getText();
	   }
	   
	   public String Interview_NetworkError()
	   {
		   return Interview_NetworkError_Page.getText();
	   }
	   
	   public String Interviewer_StatusnotProvided()
	   {
		   return Interviewer_StatusnotProvided_Page.getText();
	   }
	   
	   public boolean Expert_Slot_already_booked()
	   {
		   return Choose_time1_page.isEnabled();
	   }
}      


