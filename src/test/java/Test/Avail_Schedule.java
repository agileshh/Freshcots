package Test;

import static org.testng.Assert.assertFalse;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
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
import Utills.Generic_Schedule;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class Avail_Schedule extends Baseclass
{
		public WebDriver driver;
		public LoginPage login;
		public Candidate_ProfilePage1_About profile;  
		public Candidate_profilePage2_IDandEdu profile2;  
		public Candidate_Availability_Page Availability;  
		public Expert_Schedule_Page Schedule;
		public ACS_Page ACS;
		public SoftAssert softassert; 
		public Rating_and_Review_page Rate_Review;
		
		  @BeforeMethod
		  public void setup() throws IOException, InterruptedException
		  {
			  driver= Initializebrowser("chrome");
			 
		  }
	
		  //@Test (priority = 0)
		  @Severity(SeverityLevel.NORMAL)
		  @Description("Validate whether expert can select the same booked slot for another Interview")
		  public void Expert_ScheduledSlot_SelectAgain() throws InterruptedException
		  {
			  login = new LoginPage(driver);
			  Availability = new Candidate_Availability_Page(driver);	
			  Schedule = new Expert_Schedule_Page(driver);
			  softassert = new SoftAssert();
			  Generic.loginWithOTP(login,"candidate4");
			  Generic_Avail.Canidate_Availability_HR(Availability);
			  Generic.logout(login);
			  Generic.loginWithOTP(login, "expert1");
			  Generic_Schedule.ScheduleInterview(Schedule);
			  Generic.logout(login);
			  Generic.loginWithOTP(login, "candidate5");
			  Generic_Avail.Canidate_Availability_HR(Availability);
			  Generic.logout(login);
			  Generic.loginWithOTP(login, "expert1");
			  softassert.assertFalse(Generic_Schedule.Expert_Slot_already_booked(Schedule));
			  softassert.assertAll();
		  }
		  
		  @Test (priority = 1)
		  @Severity(SeverityLevel.NORMAL)
		  @Description("Validate whether candidate can request again for Hr Interview after HR Interview and ratings")
		  public void RequestButton_After_Rating() throws InterruptedException
		  {
			  login = new LoginPage(driver);
			  Availability = new Candidate_Availability_Page(driver);	
			  Schedule = new Expert_Schedule_Page(driver);
			  softassert = new SoftAssert();
			  Generic.loginWithOTP(login,"candidate6");
			  softassert.assertFalse(Generic_Avail.RequestAfterRating(Availability));
		  }
		  
		  @Test (priority= 2)
		  @Severity(SeverityLevel.NORMAL)
		  @Description("Validate whether Candidate can request for Tech Interview before Hr Interview")
		  public void Validate_TechRequestButton_BeforeHrRating() throws InterruptedException
		  {
			  login = new LoginPage(driver);
			  Availability = new Candidate_Availability_Page(driver);
			  SoftAssert asrt = new SoftAssert();
			  Generic.loginWithOTP(login, "candidate1");
			  Availability.InterviewDD();
			  Availability.Tech_Tab_Page();
			  asrt.assertFalse(Availability.RequestInterviewbutton_Verify(), "Button not enabled");
			  String Actual = "Complete your HR interview to become eligible to request an Technical interview.";
			  String Expected = Availability.Validate_Message();	
			  asrt.assertEquals(Actual,Expected);
			  asrt.assertAll();
		  }
		  
		  @Test (priority= 5)
		  @Severity(SeverityLevel.NORMAL)
		  @Description("Validate whether Candidate can edit the requested slot") ///Needs to done
		  public void Validate_EditButton() throws InterruptedException
		  {
			  login = new LoginPage(driver);
			  Availability = new Candidate_Availability_Page(driver);
			  Generic_Avail.Canidate_Availability_HR(Availability);
			  Availability.Edit_button_page();
			  Availability.Eveningsession_SelectAll();
			  Availability.Confirmbutton_Click();
		  }
		              
		  @AfterMethod
		  public void cleanUp() 
		  {
			driver.quit();
		  }
}
