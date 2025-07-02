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
import Pages.Candidate_ProfilePage;
import Pages.Candidate_profilePage2;
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
		public Candidate_ProfilePage profile;  
		public Candidate_profilePage2 profile2;  
		public Candidate_Availability_Page Availability;  
		public Expert_Schedule_Page Schedule;
		public ACS_Page ACS;
		public SoftAssert softassert; 
		  @BeforeMethod
		  public void setup() throws IOException, InterruptedException
		  {
			  driver= Initializebrowser("chrome");
			 
		  }
	
		  //@Test (priority = 0)
		  @Severity(SeverityLevel.NORMAL)
		  @Description("Validate whether expert can select the slot for another Interview")
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
		  
		  @Test (priority = 0)
		  @Severity(SeverityLevel.NORMAL)
		  @Description("Validate whether candodate can request for Interview ")
		  public void RequestButton_After_Rating() throws InterruptedException
		  {
			  login = new LoginPage(driver);
			  Availability = new Candidate_Availability_Page(driver);	
			  Schedule = new Expert_Schedule_Page(driver);
			  softassert = new SoftAssert();
			  Generic.loginWithOTP(login,"candidate6");
			  softassert.assertFalse(Generic_Avail.RequestAfterRating(Availability));
		  }
		              
		  @AfterMethod
		  public void cleanUp() 
		  {
			driver.quit();
		  }
}
