package Test;


import static org.testng.Assert.assertFalse;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.Baseclass;
import Pages.Candidate_Availability_Page;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Baseclass;

import Pages.Candidate_ProfilePage;
import Pages.Candidate_profilePage2;
import Pages.LoginPage;

public class Candidate_Availability extends Baseclass
{
	public WebDriver driver;
	public LoginPage login;
	public Candidate_ProfilePage profile;  
	public Candidate_profilePage2 profile2;  

	public Candidate_Availability_Page Availability;  
	
	  @BeforeMethod
	  public void setup() throws IOException, InterruptedException
	  {
		  driver= Initializebrowser("chrome");
		  login = new LoginPage(driver);
		  login.HomeLoginbutton();
		  Thread.sleep(4000);
		  login.loginemail("votyxa@polkaroad.net");
		  login.sendotpbutton();
		  String otp = "1847";
    }
    
	  @BeforeTest
	  public void setup() throws IOException
	  {
		  driver= Initializebrowser("chrome");
	  }
	  
	  @Test (priority= 0)
	  public void viewprofile() throws InterruptedException
	  {
		  login = new LoginPage(driver);
		  login.HomeLoginbutton();
		  Thread.sleep(3000);
		  login.loginemail("xugecycu@dreamclarify.org");
		  login.sendotpbutton();
		  String otp = "1847";
		  Thread.sleep(3000);
	  }
	  
	  @Test (priority= 0)
	  public void RequestforInterview() throws InterruptedException
	  {
		  Availability = new Candidate_Availability_Page(driver);
		  Availability.HR_Navigation();	 
		  Thread.sleep(4000);
		  Availability.RequestInterviewbutton();
		  Availability.SelctSlot1_Page();
		  Availability.Confirmbutton_Click();
	  }
	  
	  @Test (priority= 1)
	  public void Validate_EditButton() throws InterruptedException
	  {
		  Availability = new Candidate_Availability_Page(driver);
		  Availability.HR_Navigation();	 
		  Availability.Edit_button_page();
		  Availability.SelctSlot2_Page();
		  Availability.Confirmbutton_Click();
		  //Ava
		  Availability.Confirmbutton_Verify_Page();
		  Availability.Edit_button_page();
		  Availability.Eveningsession_SelectAll();
		  Availability.equals(Availability);
		  Availability.Confirmbutton_Verify_Page();
		  Availability.Edit_button_page();
	  }
	                           
	  @Test (priority= 2)
	  public void Validate_Cancelbutton() throws InterruptedException
	  {
		  Availability = new Candidate_Availability_Page(driver);
		  Availability.HR_Navigation();	 
		  try
		  {
			  Availability.Cancel_button();
			  Availability.Cancelbutton_popup__page(); 
		  } catch (Exception e) {
			  e.getMessage();
		  }
		  Assert.assertTrue(Availability.RequestInterviewbutton_Verify(), "Button displayed");
	  }
	  
	  @Test (priority= 3)
	  public void Re_Request() throws InterruptedException
	  {
		  Availability = new Candidate_Availability_Page(driver);
		  Availability.HR_Navigation();	 
		  Availability.RequestInterviewbutton();
		  Availability.Morningsession_SelectAll();
		  Availability.Confirmbutton_Click();
	  }
	  
	  @Test (priority= 4)
	  public void Validate_TechRequestButton() throws InterruptedException
	  {
		  Availability = new Candidate_Availability_Page(driver);
		  Availability.Tech_tabNavigation();
		  SoftAssert asrt = new SoftAssert();
		  asrt.assertFalse(Availability.RequestInterviewbutton_Verify(), "Button not enabled");
		  String Actual = "Complete your HR interview to become eligible to request an Technical interview.";
		  String Expected = Availability.Validate_Message();	
		  asrt.assertEquals(Actual,Expected);
		  asrt.assertAll();
	  }
	  
	  @AfterMethod
	  public void cleanUp() 
	  {
		driver.quit();
	  }
}
