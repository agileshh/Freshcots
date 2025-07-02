package Utills;

import org.openqa.selenium.WebDriver;

import Pages.Candidate_Availability_Page;

public class Generic_Avail 
{
	public static WebDriver driver;
	
	public static void Canidate_Availability_HR_Screen(Candidate_Availability_Page Availability) throws InterruptedException 
	{
		  Availability.InterviewDD();
		  Availability.HR_Tab_Page();
	}
	
	public static boolean RequestAfterRating(Candidate_Availability_Page Availability) throws InterruptedException 
	{
		  Availability.InterviewDD();
		  Availability.HR_Tab_Page();
		  return Availability.RequestAfterRating();
	}
	
	public static void Canidate_Availability_Tech_Screen(Candidate_Availability_Page Availability) throws InterruptedException 
	{
		  Availability.InterviewDD();
		  Availability.Tech_Tab_Page();
	}
	
	public static void Canidate_Availability_HR(Candidate_Availability_Page Availability) throws InterruptedException 
	{
		  Availability.InterviewDD();
		  Availability.HR_Tab_Page();
		  try
		  {
			  Availability.Cancel_button();
			  Availability.CancelIcon_button();		  
		  }catch (Exception e) {e.getMessage();}
		  try
		  {
			  Availability.RequestInterviewbutton();
		  }catch (Exception e) {e.getMessage();}
		  try {
			  Availability.RequestAgainbutton();		 
		  }catch(Exception e) {e.getMessage();}
		   Availability.Morningsession_SelectAll();
		   Availability.Confirmbutton_Click();
    }
	
	public static void Canidate_Availability_Tech(Candidate_Availability_Page Availability) throws InterruptedException 
	{
		  Availability.InterviewDD();
		  Availability.Tech_Tab_Page();
		  try
		  {
			  Availability.Cancel_button();
			  Availability.CancelIcon_button();  
		  }catch (Exception e) {e.getMessage();}
		  try
		  {
			  Availability.RequestAgainbutton();		 
		  }catch(Exception e) {
			  Availability.RequestInterviewbutton();
		  }
		   Availability.Morningsession_SelectAll();
		   Availability.Confirmbutton_Click();
    }
}
