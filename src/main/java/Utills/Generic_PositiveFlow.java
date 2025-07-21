package Utills;

import Pages.ACS_Page;
import Pages.Candidate_Availability_Page;
import Pages.Expert_Schedule_Page;
import Pages.LoginPage;
import Pages.Rating_and_Review_page;

public class Generic_PositiveFlow 
{
	public static void HR_Interview_and_Interviewerrating(LoginPage login,Candidate_Availability_Page Availability,Expert_Schedule_Page Schedule ,ACS_Page ACS, Rating_and_Review_page Rate_Review) throws InterruptedException 
	{
		  Generic.loginWithOTP(login, "candidate1");

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
		   
		   Generic.logout(login);
		   Generic.loginWithOTP(login, "expert1"); 
		   
		   Schedule.Interview_dropdown();
		   Schedule.PickCandidate();
		   Schedule.SelectSlot1();
		   Schedule.Choose_time1();
		   Schedule.Confirmbutton();
		   
		   ACS.Interview_dropdown();
		   ACS.UpcomingTab_nav();
		   ACS.ACS_Joinnow_button();
		   Thread.sleep(20000);
		   ACS.ACS_MicIcon();
		   ACS.ACS_CamaraIcon();
		   ACS.ACS_startcall();
		   Thread.sleep(20000);
	       ACS.Leavebutton();
		   ACS.ConfirmLeave_button();
		   
		  Schedule.Interview_dropdown();
		  Schedule.Upcoming();
		  Schedule.Interview_Completed_Card1();
	      Schedule.Status_Yes_Confirmation();
			  
		   Rate_Review.Interview_dropdown();
		   Rate_Review.Ratings_page();
		   Rate_Review.Give_rating();
		   Rate_Review.Communication_rate();
		   Rate_Review.CriticalThink_rate();
		   Rate_Review.Personality_rate();
	   	   Rate_Review.Save_button();
	   	   
	   	  Generic.logout(login);
	      Generic.loginWithOTP(login, "expert2"); 
	      
	      Rate_Review.Review_and_rate();
		  Rate_Review.Grab_One_Button();
		  Rate_Review.Give_rating_Reviewer();
		  Rate_Review.Communication_rate();
		  Rate_Review.CriticalThink_rate();
		  Rate_Review.Personality_rate();
		  Rate_Review.Save_button();
    }
	
	public static void Tech_Interview_and_Rating(LoginPage login,Expert_Schedule_Page Schedule ,ACS_Page ACS, Rating_and_Review_page Rate_Review) throws InterruptedException 
	{
		 Generic.loginWithOTP(login, "expert3"); 
		   
		   Schedule.Interview_dropdown();
		   Schedule.PickCandidate();
		   Schedule.SelectSlot1();
		   Schedule.Choose_time1();
		   Schedule.Confirmbutton();
		   
		   ACS.Interview_dropdown();
		   ACS.UpcomingTab_nav();
		   ACS.ACS_Joinnow_button();
		   Thread.sleep(20000);
		   ACS.ACS_MicIcon();
		   ACS.ACS_CamaraIcon();
		   ACS.ACS_startcall();
		   Thread.sleep(20000);
	       ACS.Leavebutton();
		   ACS.ConfirmLeave_button();
		   
		  Schedule.Interview_dropdown();
		  Schedule.Upcoming();
		  Schedule.Interview_Completed_Card1();
	      Schedule.Status_Yes_Confirmation();
			  
		   Rate_Review.Interview_dropdown();
		   Rate_Review.Ratings_page();
		   Rate_Review.Give_rating();
		   Rate_Review.Communication_rate();
		   Rate_Review.CriticalThink_rate();
		   Rate_Review.Personality_rate();
	   	   Rate_Review.Save_button();
	   	   
	   	  Generic.logout(login);
	      Generic.loginWithOTP(login, "expert4"); 
	      
	      Rate_Review.Review_and_rate();
		  Rate_Review.Grab_One_Button();
		  Rate_Review.Give_rating_Reviewer();
		  Rate_Review.Communication_rate();
		  Rate_Review.CriticalThink_rate();
		  Rate_Review.Personality_rate();
		  Rate_Review.Save_button();
	}
}
