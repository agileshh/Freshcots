package Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Baseclass;
import Pages.ACS_Page;
import Pages.Candidate_Availability_Page;
import Pages.Candidate_ProfilePage1_About;
import Pages.Candidate_profilePage2_IDandEdu;
import Pages.Expert_Schedule_Page;
import Pages.LoginPage;
import Pages.Rating_and_Review_page;
import Utills.Generic;
import Utills.Generic_ACS_Rating;
import Utills.Generic_Avail;
import Utills.Generic_Schedule;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class Error_state extends Baseclass
{
	public WebDriver driver;
	public LoginPage login;
	public Candidate_ProfilePage1_About profile;  
	public Candidate_profilePage2_IDandEdu profile2;  
	public Candidate_Availability_Page Availability;  
	public Expert_Schedule_Page Schedule;
	public ACS_Page ACS;
	public Rating_and_Review_page Rate_Review;
	public SoftAssert softAssert;
	
	  @BeforeMethod
	  public void setup() throws IOException, InterruptedException
	  {
		  driver= Initializebrowser("chrome");
	  }
	  
	  //@Test(priority= 0)
	  @Severity(SeverityLevel.MINOR)
	  @Description("To validate the Maximum attempt by candidate and validate the either card is displaying or not")
	  public void Max_Decline_from_Candidateside_and__CardDisplay() throws InterruptedException
	  {
		  login = new LoginPage(driver);
		  profile = new Candidate_ProfilePage1_About(driver);
		  Availability = new Candidate_Availability_Page(driver);	 
		  Schedule= new Expert_Schedule_Page(driver);
		  softAssert = new SoftAssert();
		  for(int i =0;i<=5;i++)
		  {
			  if (i<=4)
			  {
				  Generic.loginWithOTP(login, "candidate2");
				  Generic_Avail.Canidate_Availability_HR(Availability);
				  Generic.logout(login);
				  Generic.loginWithOTP(login, "expert1");
	              Generic_Schedule.ScheduleInterview(Schedule);
				  Generic.logout(login);
				  Generic.loginWithOTP(login, "candidate2");
				  Generic_ACS_Rating.Decline_Interview_Candidate(Availability);
				  Generic.logout(login);
			  }	
			  else if(i == 5)
			  {
				  Generic.loginWithOTP(login, "candidate2");
				  Availability.InterviewDD();
				  Availability.HR_Tab_Page();
				  Assert.assertFalse(Availability.Request_button_Disabledbutton(), "Button Enabled");
				  String Actual = Availability.Request_Disabledbutton_textverify();
				  String Expected = "Your account has been blocked due to multiple attempts kindly contact our admin";
				  softAssert.assertEquals(Actual, Expected);
				  Generic.logout(login);
			  }
		  }
		  Generic.loginWithOTP(login, "expert1");
		  Schedule.Interview_dropdown();
	      Schedule.Upcoming();
	      Thread.sleep(3000);
	      softAssert.assertFalse(Schedule.CandidateCard(), "Card displayed");
	      softAssert.assertAll();
	      Generic.logout(login);
	  }
	  
	  @Test (priority = 1)
	  @Severity(SeverityLevel.MINOR)
	  @Description("To validate the Maximum decline attempt by Expert")
	  public void Declined_from_Expertside() throws InterruptedException
	  {
		  login = new LoginPage(driver);
		  profile = new Candidate_ProfilePage1_About(driver);
		  Availability = new Candidate_Availability_Page(driver);	 
		  Schedule= new Expert_Schedule_Page(driver);
		  softAssert = new SoftAssert();
		  Generic.loginWithOTP(login, "candidate1");
		  Generic_Avail.Canidate_Availability_HR(Availability);
		  Generic.logout(login);
		  Generic.loginWithOTP(login,"expert1");
		  Generic_ACS_Rating.Decline_Interview_Expert(Schedule);
		  Generic.logout(login);
		  Generic.loginWithOTP(login, "candidate1");
		  Availability.InterviewDD();
		  Availability.HR_Tab_Page();
		  String actual = Availability.InfoMessage_Expert_Decline();
		  String Expected = "The interviewer has declined the interview";
		  softAssert.assertEquals(actual, Expected);	
		  softAssert.assertAll();
	  }
	  
	  //@Test (priority = 2)
	  @Severity(SeverityLevel.NORMAL)
	  @Description("To validate the Status of Absent provided by Interviewer and Maximum number of Absent attempt by Candidate")
	  public void Absent() throws InterruptedException
	  {
		  login = new LoginPage(driver);
		  profile = new Candidate_ProfilePage1_About(driver);
		  Availability = new Candidate_Availability_Page(driver);	 
		  Schedule= new Expert_Schedule_Page(driver);
		  ACS = new ACS_Page(driver);
		  softAssert = new SoftAssert();
		  for(int i =0;i<=4;i++)
		  {
			  Generic.loginWithOTP(login, "candidate3");
			  Generic_Avail.Canidate_Availability_HR(Availability);
			  Generic.logout(login);
			  Generic.loginWithOTP(login, "expert1");
			  Generic_Schedule.ScheduleInterview(Schedule);
			  Generic_ACS_Rating.ACS_Interview(ACS);
			  Generic_ACS_Rating.ACS_Interview_Absent(Schedule);
			  Generic.logout(login);
			  Generic.loginWithOTP(login, "candidate1");
			  try
			  {
				  Generic_Avail.Canidate_Availability_HR_Screen(Availability);
				  String Actual = Schedule.Interview_Missed();
				  String Expected = "Missed!";
				  softAssert.assertEquals(Actual, Expected);
				  Generic.logout(login);
			  }catch (Exception e) {
				  e.getMessage();
			  }
		  }
		  String Actual = Availability.Request_Disabledbutton_textverify();
		  String Expected = "Your account has been blocked due to multiple attempts kindly contact our admin";
		  softAssert.assertEquals(Actual, Expected);
		  Generic.logout(login);
		  softAssert.assertAll();
	  }
	  
	  //@Test (priority = 3)
	  @Severity(SeverityLevel.NORMAL)
	  @Description("To validate the status of Network error and Validate either Candidate canrequest for one more attempt")
	  public void Network_Error() throws InterruptedException
	  {
		  login = new LoginPage(driver);
		  profile = new Candidate_ProfilePage1_About(driver);
		  Availability = new Candidate_Availability_Page(driver);	 
		  Schedule= new Expert_Schedule_Page(driver);
		  ACS = new ACS_Page(driver);
		  softAssert = new SoftAssert();
		  Generic.loginWithOTP(login, "candidate1");
		  Generic_Avail.Canidate_Availability_HR(Availability);
		  Generic.logout(login);
		  Generic.loginWithOTP(login, "expert1");
		  Generic_Schedule.ScheduleInterview(Schedule);
		  Generic_ACS_Rating.ACS_Interview(ACS);
		  Generic_ACS_Rating.ACS_Interview_NetworkError(Schedule);
		  Generic.logout(login);
		  Generic.loginWithOTP(login, "candidate1");
		  String Actual = Schedule.Interview_NetworkError();
		  String Expected = "Your call was disconnected due to a low internet connection";
		  softAssert.assertEquals(Actual, Expected);
		  Generic.RefreshPage(driver);
		  Generic_Avail.Canidate_Availability_HR(Availability);
		  softAssert.assertAll();
	  }
	  
	  //@Test (priority = 4)
	  @Severity(SeverityLevel.NORMAL)
	  @Description("To validate the schedule with Other skill expert")
	  public void Interviewer_Schedule_ExpertwithOtherSKill() throws InterruptedException
	  {
		  login = new LoginPage(driver);
		  Availability = new Candidate_Availability_Page(driver);
		  Schedule= new Expert_Schedule_Page(driver);
		  softAssert = new SoftAssert();
		  Generic.loginWithOTP(login, "candidate1");
		  Generic_Avail.Canidate_Availability_HR(Availability);
		  Generic.logout(login);
		  Generic.loginWithOTP(login, "expert5");
		  softAssert.assertFalse(Generic_Schedule.ScheduleInterview_UnmatchedExpert(Schedule));
		  softAssert.assertAll();
	  }
	  
	 // @Test (priority = 5)
	  @Severity(SeverityLevel.BLOCKER)
	  @Description("To validate the condition if Expert didn't provides the Interview status after the Interview call")
	  public void Interview_Status_Not_Provided() throws InterruptedException
	  {
		  login = new LoginPage(driver);
		  profile = new Candidate_ProfilePage1_About(driver);
		  Availability = new Candidate_Availability_Page(driver);	 
		  Schedule= new Expert_Schedule_Page(driver);
		  ACS = new ACS_Page(driver);
		  softAssert = new SoftAssert();
		  Generic.loginWithOTP(login, "candidate1");
		  Generic_Avail.Canidate_Availability_HR(Availability);
		  Generic.logout(login);
		  Generic.loginWithOTP(login, "expert1");
		  Generic_Schedule.ScheduleInterview(Schedule);
		  Generic_ACS_Rating.ACS_Interview(ACS);
		  Generic.logout(login);
		  Generic.loginWithOTP(login, "candidate1");
		  Generic_Avail.Canidate_Availability_HR_Screen(Availability);
		  String Actual = Schedule.Interviewer_StatusnotProvided();
		  String Expected = "Waiting for your interview status update.";
		  softAssert.assertEquals(Actual, Expected);
		  Generic.RefreshPage(driver);
		  softAssert.assertFalse(Availability.Check_StausNotGiven());
		  softAssert.assertAll();
	  } 
	  
	  @AfterMethod
	  public void cleanUp() 
	  {
		driver.quit();
	  }
}