package Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Base.Baseclass;
import Pages.Candidate_ProfilePage1_About;
import Pages.Candidate_ProfilePage3_SkillandCarrear;
import Pages.Candidate_ProfilePage5_Experience;
import Pages.Candidate_profilePage2_IDandEdu;
import Pages.LoginPage;
import Utills.Excel_Utils1;
import Utills.Excel_Utils_Collective_Data;
import Utills.Generic;
import Utills.Generic_Profile;
import Utills.Generic_Profile2;

public class Statexample extends Baseclass
{
	private WebDriver driver;
	
	public LoginPage login;
	public Candidate_ProfilePage1_About profile;  
	public Candidate_profilePage2_IDandEdu profile2;  
	public Candidate_ProfilePage3_SkillandCarrear profile3;
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
	  
	  @DataProvider(name = "Experience")
	  public Object[][] getProfileData() 	  {
		    final String path = System.getProperty("user.dir")+ "/TestData/TestData.xlsx";
		    Object[][] testData = Excel_Utils1.getTestData(path, "Experience");
		    return testData;
	  } 
	  
	  @DataProvider(name = "Summary")
	  public Object[][] getSummaryData() 	  {
		    final String path = System.getProperty("user.dir")+ "/TestData/TestData.xlsx";
		    Object[][] testData = Excel_Utils1.getTestData(path, "Summary");
		    return testData;
	  } 
	  
	  @DataProvider(name = "Identification")
	  public Object[][] getIdentificationData() 	  {
		    final String path = System.getProperty("user.dir")+ "/TestData/TestData.xlsx";
		    Object[][] testData = Excel_Utils1.getTestData(path, "Identification");
		    return testData;
	  } 
	  
	  @DataProvider(name = "Education")
	  public Object[][] getEducationData() 	  {
		    final String path = System.getProperty("user.dir")+ "/TestData/TestData.xlsx";
		    Object[][] testData = Excel_Utils1.getTestData(path, "Education");
		    return testData;
	  } 
	  
	  @DataProvider(name = "Skills")
	  public Object[][] getSkillsData()   {
		    final  String path = System.getProperty("user.dir")+ "/TestData/TestData.xlsx";
		    Object[][] testData = Excel_Utils1.getTestData(path, "Skills");
		    return testData;
	  } 
	  
	  @DataProvider(name = "Career info")
	  public Object[][] getCareerData() 	  {
		    final  String path = System.getProperty("user.dir")+ "/TestData/TestData.xlsx";
		    Object[][] testData = Excel_Utils1.getTestData(path, "Career");
		    return testData;
	  }  
	  
	  @DataProvider(name = "AreaofInterest")
	  public Object[][] getAreaofInterestData() {
		    final String path = System.getProperty("user.dir")+ "/TestData/TestData.xlsx";
		    Object[][] testData = Excel_Utils_Collective_Data.getTestData(path, "AreaofInterest");
		    return testData;
	  } 
	  
	  //@Test (dataProvider = "formData",priority=0)
	  public void Experience(String Designation,String Company,String state,String Descrip) throws InterruptedException	  {  
		  profile5 = new Candidate_ProfilePage5_Experience(driver);
		  Generic_Profile2.Experience(profile5, Designation,Company,state,Descrip);
	  }	
	  
	  //@Test (dataProvider = "Summary",priority=0)
	  public void Profile_summary(String Summary) throws InterruptedException
	  {
		  profile = new Candidate_ProfilePage1_About(driver);
		  Generic_Profile.Profile_summary(profile, Summary);
	  }
	  
	  //@Test (dataProvider = "Identification",priority= 1)
	  public void Identification(String Gender, String State,String City) throws InterruptedException
	  {
		  profile2 = new Candidate_profilePage2_IDandEdu(driver);
		  Generic_Profile.Identification(profile2,Gender,State,City);
	  } 
	  
	  //@Test (dataProvider = "Education",priority= 1)
	  public void Education(String Institute,String State, String City, String Course, String Department, String Mark) throws InterruptedException
	  {
		  profile2 = new Candidate_profilePage2_IDandEdu(driver);
		  Generic_Profile2.Education(profile2,Institute,State,City,Course,Department, Mark);
	  }	  
	  
	  //@Test (dataProvider = "Skills",priority= 2)
	  public void Skills(String primarySkill,String SecondarySkill,String otherSkill) throws InterruptedException
	  {
		  profile3 = new Candidate_ProfilePage3_SkillandCarrear(driver);
		  Generic_Profile.skill(profile3,primarySkill,SecondarySkill,otherSkill);
	  }
	  
	  //@Test (dataProvider = "Career info",priority= 1)
	  public void CareerInfo (String Availability, String location) throws InterruptedException
	  {
		 profile3 = new Candidate_ProfilePage3_SkillandCarrear(driver);
		 Generic_Profile2.CareerInfo(profile3,Availability,location); 
	  } 
	  
	  @Test (dataProvider = "AreaofInterest",priority= 0)
	  public void AreaofIntrest(List<String> Domain ) throws InterruptedException
	  {
    	  profile = new Candidate_ProfilePage1_About(driver);
    	  Generic_Profile.AreaofIntrest(profile, Domain);
	  }	
}
