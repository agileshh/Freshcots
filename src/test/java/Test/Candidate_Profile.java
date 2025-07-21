package Test;

import java.io.IOException;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Base.Baseclass;
import Pages.Candidate_ProfilePage1_About;
import Pages.Candidate_ProfilePage3_SkillandCarrear;
import Pages.Candidate_ProfilePage4_ProjectandCertitify;
import Pages.Candidate_ProfilePage5_Experience;
import Pages.Candidate_profilePage2_IDandEdu;
import Pages.LoginPage;
import Utills.Excel_Utils1;
import Utills.Generic;
import Utills.Generic_Profile;
import Utills.Generic_Profile2;

public class Candidate_Profile extends Baseclass
{
	public WebDriver driver;
	public LoginPage login;
	public Candidate_ProfilePage1_About profile;  
	public Candidate_profilePage2_IDandEdu profile2;  
	public Candidate_ProfilePage3_SkillandCarrear profile3;  
	public Candidate_ProfilePage4_ProjectandCertitify profile4;  
	public Candidate_ProfilePage5_Experience profile5;  

	  @BeforeMethod
	  public void setup() throws IOException, InterruptedException
	  {
		  driver= Initializebrowser("chrome");
		  login = new LoginPage(driver);
		  profile = new Candidate_ProfilePage1_About(driver);
		  Generic.loginWithOTP(login, "candidate9");
		  profile.ViewProfilebutton();
	  }
	  
	  @DataProvider(name = "formData")
	  public Object[][] getData() 
	  {
		    String path = "C:\\Users\\arusi\\Repo\\Freshcots%20Test%20Automation\\AutomationTesting\\Freshcots\\TestData\\TestData.xlsx";
		    Object[][] testData = Excel_Utils1.getTestData(path, "Summary");
		    return testData;
	  }
	  
	 // @Test (priority= 0) 
	  public void displaypicture_TakePhoto() throws InterruptedException
	  {
		  profile = new Candidate_ProfilePage1_About(driver);
		  Generic_Profile2.Display_Pic_Takephoto(profile);
	  }		  
	 
	 // @Test (priority= 0) 
	  public void displaypicture_UploadPhoto() throws InterruptedException
	  {
		  profile = new Candidate_ProfilePage1_About(driver);
		  Generic_Profile2.Display_Pic_UploadPic(profile);
	  }		  
	  
	 // @Test (priority= 1)
	  public void SelfIntro() throws InterruptedException
	  {
		 profile = new Candidate_ProfilePage1_About(driver);
		 Generic_Profile.Self_Intro(profile);
	  }
	  
	  //@Test (dataProvider = "formData",priority= 3)
	  public void Profile_summary(String Summary, String Domain) throws InterruptedException
	  {
		  profile = new Candidate_ProfilePage1_About(driver);
    	  Generic_Profile.Profile_summary(profile, Summary);
	  }
	  
     // @Test  (priority= 3)
	  public void AreaofIntrest(String Domain) throws InterruptedException
	  {
    	  profile = new Candidate_ProfilePage1_About(driver);
    	  Generic_Profile.AreaofIntrest(profile,Domain);
	  }	 
	  
	  @Test (priority= 4)
	  public void Identification() throws InterruptedException
	  {
		  profile2 = new Candidate_profilePage2_IDandEdu(driver);
		  Generic_Profile.Identification(profile2);
	  }
	  
	  //@Test(priority= 5)
	  public void Skills() throws InterruptedException
	  {
		  profile3 = new Candidate_ProfilePage3_SkillandCarrear(driver);
		  Generic_Profile.skill(profile3);
	  }
	  	  
	  //@Test(priority= 6)
	  public void CareerInfo () throws InterruptedException
	  {
		 profile3 = new Candidate_ProfilePage3_SkillandCarrear(driver);
		 Generic_Profile2.CareerInfo(profile3);	 
	  } 
	  
	  //@Test(priority= 7)
	  public void Education() throws InterruptedException
	  {
		  profile2 = new Candidate_profilePage2_IDandEdu(driver);
		  Generic_Profile2.Education(profile2);
	  }	  
	  
	  //@Test (priority= 8)
	  public void Experience(String statename) throws InterruptedException
	  {
		  profile5 = new Candidate_ProfilePage5_Experience(driver);
		  Generic_Profile2.Experience(profile5, statename);
	  }	
	  
	 // @Test (priority= 9)
	  public void Project() throws InterruptedException
	  {
		  profile4 = new Candidate_ProfilePage4_ProjectandCertitify(driver);
		  Generic_Profile2.Project(profile4);
	  }
	  
	 // @Test (priority= 10)
	  public void Certificates() throws InterruptedException
	  {
		  profile4 = new Candidate_ProfilePage4_ProjectandCertitify(driver);
		  Generic_Profile2.Certificates(profile4);
	  }
	  
	 // @AfterMethod
	  public void cleanUp() 
	  {
		driver.quit();
	  }
 }

