package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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
import Utills.Generic_PositiveFlow;
import Utills.Generic_Schedule;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class Positive_Flow extends Baseclass
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
	  public void HR_Interview() throws InterruptedException
	  {
		  login = new LoginPage(driver);
		  profile = new Candidate_ProfilePage1_About(driver);
		  Availability = new Candidate_Availability_Page(driver);	 
		  Schedule= new Expert_Schedule_Page(driver);
		  ACS = new ACS_Page(driver);
		  Rate_Review = new Rating_and_Review_page (driver);
		  Generic.loginWithOTP(login, "candidate7");
		  Generic_Avail.Canidate_Availability_HR(Availability);
		  Generic.logout(login);
		  Generic.loginWithOTP(login, "expert1");
		  Generic_Schedule.ScheduleInterview(Schedule);
		  Generic_ACS_Rating.ACS_Interview(ACS);
		  Generic_ACS_Rating.ACS_Interview_Completed(Schedule);
		  Generic_ACS_Rating.Interviewer_Rating(Rate_Review);
		  Generic.logout(login);
		  Generic.loginWithOTP(login, "expert2");
		  Generic_ACS_Rating.Reviewer_Rating(Rate_Review);
		  Generic.logout(login);
	  }
	  
	  @Test(priority= 0)
	  public void End_to_End() throws InterruptedException
	  {
		  login = new LoginPage(driver);
		  profile = new Candidate_ProfilePage1_About(driver);
		  Availability = new Candidate_Availability_Page(driver);	 
		  Schedule= new Expert_Schedule_Page(driver);
		  ACS = new ACS_Page(driver);
		  Rate_Review = new Rating_and_Review_page (driver);
		  Generic_PositiveFlow.HR_Interview_and_Interviewerrating(login, Availability, Schedule, ACS, Rate_Review);
		  Generic_PositiveFlow.Tech_Interview_and_Rating(login, Schedule, ACS, Rate_Review);
	  }
}
