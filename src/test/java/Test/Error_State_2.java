package Test;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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

import org.testng.annotations.BeforeMethod;

import Base.Baseclass;

public class Error_State_2 extends Baseclass
{
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
		  
		   @Test (priority = 1)
		  @Severity(SeverityLevel.BLOCKER)
		  @Description("To validate the condition if Expert didn't provides the Interview status after the Interview call")
		  public void JoinNowButton_After_Interview() throws InterruptedException
		  {
			  login = new LoginPage(driver);
			  profile = new Candidate_ProfilePage1_About(driver);
			  Availability = new Candidate_Availability_Page(driver);	 
			  Schedule= new Expert_Schedule_Page(driver);
			  ACS = new ACS_Page(driver);
			  Generic.loginWithOTP(login, "candidate7");
			  Generic_Avail.Canidate_Availability_HR_Screen(Availability);
			  Assert.assertFalse(ACS.Joinnow_button_Enabled());
		  }
		  
		   @Test (priority = 1)
		   @Severity(SeverityLevel.BLOCKER)
		   @Description("Validate wheteher Interview")
			  public void Card_Removed_If_Timeover_ExpertPOV() throws InterruptedException
			  {
			   login = new LoginPage(driver);
			   Availability = new Candidate_Availability_Page(driver);	 
			   Schedule= new Expert_Schedule_Page(driver);
			   ACS = new ACS_Page(driver);
			   String targetTimeStr = "07:00:00";
			   LocalDateTime currentTime = LocalDateTime.now();
			   LocalTime targetTime = LocalTime.parse(targetTimeStr);
		       LocalDateTime targetDateTime = LocalDateTime.of(LocalDate.now().plusDays(1), targetTime);
		       Generic.loginWithOTP(login, "candidate1");
		       Generic_Avail.Canidate_Availability_HR(Availability);
		       Generic.logout(login);
		       Generic.loginWithOTP(login, "expert1");
			   Generic_Schedule.ScheduleInterview(Schedule);
			   ACS.Interview_dropdown();
			   ACS.UpcomingTab_nav();
			   if (targetDateTime != targetDateTime)
			   {
				   
			   }
			  } 
		
		   @AfterMethod
		  public void cleanUp() 
		  {
			driver.quit();
		  }
}
