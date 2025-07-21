package Utills;

import org.openqa.selenium.WebDriver;

import Pages.ACS_Page;
import Pages.Candidate_Availability_Page;
import Pages.Expert_Schedule_Page;
import Pages.Rating_and_Review_page;

public class Generic_ACS_Rating
{
	public static WebDriver driver;
	
	 public static void Decline_Interview_Candidate(Candidate_Availability_Page Availability) 
	 {
		  Availability.InterviewDD();
		  Availability.HR_Tab_Page();
		  Availability.Decline_button();
		  Availability.Decline_reason_page("I dont want to attend the meeting in this room sorry to inform yu");
		  Availability.Decline_button_popup();
	 }
	 
	 public static void Decline_Interview_Expert(Expert_Schedule_Page Schedule) 
	 {
		  Schedule.Interview_dropdown();
		  Schedule.PickCandidate();
		  Schedule.SelectSlot1();
		  Schedule.Choose_time1();
		  Schedule.Confirmbutton();
		  Schedule.Upcoming();
		  Schedule.Decline_button();
		  Schedule.Decline_reason_page("Hey there!!Sorry fpr Inconvenience could not attend the call");
		  Schedule.Decline_button_popup();
	 }
	 
	 public static void ACS_Interview_DisonnectandJoin(WebDriver driver,ACS_Page ACS) throws InterruptedException
	 {
		  ACS.Interview_dropdown();
		  ACS.UpcomingTab_nav();
		  ACS.JoinNowButtonParticularTime();
		  //ACS.ACS_Joinnow_button();
		  Thread.sleep(8000);
		  ACS.ACS_MicIcon();
		  ACS.ACS_CamaraIcon();
		  ACS.ACS_startcall();
		  Thread.sleep(20000);
		  driver.close();
	 }
	 
	 public static void ACS_Interview(ACS_Page ACS) throws InterruptedException
	 {
		  ACS.Interview_dropdown();
		  ACS.UpcomingTab_nav();
		  ACS.Joinnow_button_Enabled();
		  ACS.ACS_Joinnow_button();
		  Thread.sleep(20000);
		  ACS.ACS_MicIcon();
		  ACS.ACS_CamaraIcon();
		  ACS.ACS_startcall();
		 // ACS.ViewCandidateprofile();
		  Thread.sleep(20000);
		  ACS.Leavebutton();
		  ACS.ConfirmLeave_button();
	 }
	 
	 public static void ACS_Interview_15Mins(ACS_Page ACS) throws InterruptedException
	 {
		  ACS.Interview_dropdown();
		  ACS.UpcomingTab_nav();
		  ACS.ACS_Joinnow_button();
		  Thread.sleep(20000);
		  ACS.ACS_MicIcon();
		  ACS.ACS_CamaraIcon();
		  ACS.ACS_startcall();
		  Thread.sleep(900000);  //15mins
		  ACS.Leavebutton();
		  ACS.ConfirmLeave_button();
	 }
	 
	 public static void ACS_Interview_Absent(Expert_Schedule_Page Schedule) throws InterruptedException
	 {
		  Schedule.Interview_dropdown();
		  Schedule.Upcoming();
		  Schedule.Candidate_absent();
		  Schedule.Status_Yes_Confirmation();
	 }
	 
	 public static void ACS_Interview_Completed(Expert_Schedule_Page Schedule) throws InterruptedException
	 {
		  Schedule.Interview_dropdown();
		  Schedule.Upcoming();
		  Schedule.Interview_Completed_Card1();
		  Schedule.Status_Yes_Confirmation();
	 }
	 
	 public static void ACS_Interview_NetworkError(Expert_Schedule_Page Schedule) throws InterruptedException
	 {
		  Schedule.Interview_dropdown();
		  Schedule.Upcoming();
		  Schedule.Network_error_card2();
		  Schedule.Status_Yes_Confirmation();
	 }
	 
	 public static void Interviewer_Rating(Rating_and_Review_page Rate_Review)
	 {
		  Rate_Review.Interview_dropdown();
		  Rate_Review.Ratings_page();
		  Rate_Review.Give_rating();
		  Rate_Review.Communication_rate();
		  Rate_Review.CriticalThink_rate();
		  Rate_Review.Personality_rate();
		  Rate_Review.Save_button();
	 }
	 
	 public static void Reviewer_Rating(Rating_and_Review_page Rate_Review)
	 {
		  Rate_Review.Review_and_rate();
		  Rate_Review.Grab_One_Button();
		  Rate_Review.Give_rating_Reviewer();
		  Rate_Review.Communication_rate();
		  Rate_Review.CriticalThink_rate();
		  Rate_Review.Personality_rate();
		  Rate_Review.Save_button();
	 }
}
