package Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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

public class HR_Rating_Review extends Baseclass
{
	public WebDriver driver;
	public LoginPage login;
	public Candidate_ProfilePage profile;  
	public Candidate_profilePage2 profile2;  
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
	  
	  //@Test (priority = 0)
	  @Severity(SeverityLevel.BLOCKER)
	  @Description("To validate the Completion of Interview")
	  public void Interview_Completed() throws InterruptedException
	  {
		  login = new LoginPage(driver);
		  Availability = new Candidate_Availability_Page(driver);	 
		  Schedule= new Expert_Schedule_Page(driver);
		  ACS = new ACS_Page(driver);
		  Generic.loginWithOTP(login, "expert1");
		  Generic_ACS_Rating.ACS_Interview_NetworkError(Schedule);
		  Generic.logout(login);
		  Generic.loginWithOTP(login, "candidate1");
		  Generic_Avail.Canidate_Availability_HR(Availability);
		  Generic.logout(login);
		  Generic.loginWithOTP(login, "expert1");
		  Generic_Schedule.ScheduleInterview(Schedule);
		  Generic_ACS_Rating.ACS_Interview(ACS);
		  Generic_ACS_Rating.ACS_Interview_Completed(Schedule);
		  Generic.logout(login);
	  }
	  
	  @Test (priority = 0)
	  @Severity(SeverityLevel.NORMAL)
	  @Description("To validate the Maximum time of Interview")
	  public void Maximum_Time_Interview() throws InterruptedException
	  {
		  login = new LoginPage(driver);
		  Availability = new Candidate_Availability_Page(driver);	 
		  Schedule= new Expert_Schedule_Page(driver);
		  ACS = new ACS_Page(driver);
		  softAssert = new SoftAssert();
		  Generic.loginWithOTP(login, "candidate4");
		  Generic_Avail.Canidate_Availability_HR(Availability);
		  Generic.logout(login);
		  Generic.loginWithOTP(login, "expert1");
		  Generic_Schedule.ScheduleInterview(Schedule);
		  Generic_ACS_Rating.ACS_Interview_15Mins(ACS);
		  Generic_ACS_Rating.ACS_Interview_Completed(Schedule);
		  Generic.logout(login);
	  }
	                                              
	  //@Test (priority = 1)
	  @Severity(SeverityLevel.NORMAL)
	  @Description("To validate the Rating provided by Interviewer")
	  public void Interviewer_Rating() throws InterruptedException
	  {
		  login = new LoginPage(driver);
		  Availability = new Candidate_Availability_Page(driver);	 
		  Rate_Review = new Rating_and_Review_page (driver);
		  Generic.loginWithOTP(login, "expert1");
		  Generic_Avail.Canidate_Availability_HR_Screen(Availability);
		  Generic.RefreshPage(driver);
		  Assert.assertTrue( Rate_Review.HR_Rating_Pending());	  
		  Generic.logout(login);
		  Generic.loginWithOTP(login, "expert1");
		  Generic_ACS_Rating.Interviewer_Rating(Rate_Review);
		  Generic.logout(login);
		  softAssert.assertAll();
	  }
		  
	  //@Test (priority = 2)
	  @Severity(SeverityLevel.NORMAL)
	  @Description("To validate the Rating provided by Reviewer")
	  public void Reviewer_Rating() throws InterruptedException
	  {
		  login = new LoginPage(driver);
		  Availability = new Candidate_Availability_Page(driver);
		  Rate_Review = new Rating_and_Review_page (driver);
		  softAssert = new SoftAssert();
		  Generic.loginWithOTP(login, "expert2");
		  Generic_ACS_Rating.Reviewer_Rating(Rate_Review);
		  Generic.logout(login);
		  Generic.loginWithOTP(login, "candidate1");
		  Generic_Avail.Canidate_Availability_HR_Screen(Availability);
		  Generic.RefreshPage(driver);
		  softAssert.assertTrue( Rate_Review.HR_Approved());	 
		  Rate_Review.Go_To_Profile(); 	 
		  softAssert.assertAll();
	  }	  
	  
	  @AfterMethod
	  public void cleanUp() 
	  {
		driver.quit();
	  }
}
