package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Baseclass;
import Pages.Candidate_ProfilePage;
import Pages.Candidate_profilePage2;
import Pages.LoginPage;

public class Candidate_Profile extends Baseclass
{
	public WebDriver driver;
	public LoginPage login;
	public Candidate_ProfilePage profile;  
	public Candidate_profilePage2 profile2;  
	
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
		  login.enterOTP(otp);
		  login.ValidOTP();
		  profile = new Candidate_ProfilePage(driver);
		  profile.ViewProfilebutton();
	  }
	  
	  //@Test (priority= 1)
	  public void displaypicture() throws InterruptedException
	  {
		  profile = new Candidate_ProfilePage(driver);
		  Thread.sleep(5000);
		  profile.Uploadpic();
		  profile.Usecamara();
		  profile.Takepic();
		  profile.savepicbutton();
	  }		  
	  
	 // @Test (priority= 1)
	  public void SelfIntro() throws InterruptedException
	  {
		  profile = new Candidate_ProfilePage(driver);
		  try 
		  {
			  profile.record_selfintro_button();
			  profile.startrecordbutton();
			  Thread.sleep(5000);
			  profile.stoprecordbutton();	
			  profile.submitforreviewbutton();
			  profile.viewvideobutton();
			  
		  }catch (Exception e)
		  {       
			  e.getMessage();
		  }
		  if(profile.Under_reviewtext()) 
	      {
				 System.out.println("Passed");
				 profile.Retakebuttonkebab();
				 profile.Retakebutton();			 
	      }		 
	   }
	  
	
	 // @Test (priority= 2)
	  public void Profile() throws InterruptedException
	  {
		  try
		  {
			  profile = new Candidate_ProfilePage(driver);
			  profile.Addprofile_button();
			  Thread.sleep(3000);
			  profile.addprofile_text_area("Hi I am XYZ writing the teste cases in both manual and Automation as well...keep going");
		      profile.addprofile_savebutton();
		  }catch (Exception e)
		  {
			  e.getMessage();
		  }	  
	  }
	  
     // @Test  (priority= 3)
	  public void AreaofIntrest()
	  {
    	  try 
    	  {
    		  profile = new Candidate_ProfilePage(driver);
        	  profile.add_AreaofIntrestButton();
        	  profile.add_AreaofIntrest_Industrydropdown();
        	  profile.add_AreaofIntrest_IToption();
        	  profile.SelectDomain_Dropdown();
        	  profile.select_option();
        	  profile.add_AreaofIntrest_savebutton();
    	  }catch (Exception e)
		  {
			  e.getMessage();
		  }	  
	  }	 
	  
	  //@Test (priority= 1)
	  public void Identification() throws InterruptedException
	  {
		   profile = new Candidate_ProfilePage(driver);
		   Thread.sleep(3000);
		   profile.Add_Identificationbutton();
		   profile.yearofbirthdropdown();
		   profile.yearofbirthoption();
		   profile.Genderdropdown();
	       profile.Genderoption();
		  profile.Statedropdown();
		  profile.Stateoptionpage();
		  profile.Citydropdown();
		  profile.Cityoption();
		  //profile.Languagedropdown();
		  //profile.Language_option();
		  //profile.Language_Proficiancy();
		  profile.Savebutton();	 
	  }
	  
	 // @Test(priority= 2)
	  public void Education() throws InterruptedException
	  {
		   profile = new Candidate_ProfilePage(driver);
		   Thread.sleep(3000); 
		   profile.Add_Education_button();
		   profile.Institution_dropdown();
		   profile.Institution_option();
		   profile.State_dropdown();
		   profile.State_option();
		   profile.City_dropdown();
		   profile.City_option();
		   profile.Course_dropdown();
		   profile.Course_option();
		   profile.Department_dropdown();
		   profile.Department_option();		
		   profile.From_month_Dropdown();
		   profile.From_month_option();
		   profile.From_year_Dropdown();
		   profile.From_year_option();
		   profile.To_month_Dropdown();
		   profile.To_month_option();
		   profile.To_year_Dropdown();
		   profile.To_year_option();
		   //profile.Course_type();
		   profile.Mark("58");
		   profile.Save_button_Education();
	  }	  
	  
	  // @Test(priority= 1)
	  public void Skills() throws InterruptedException
	  {
		   profile = new Candidate_ProfilePage(driver);
		   profile.Addskill_button();
		   profile.Skills_Communicationrating();
		   profile.Skills_criticalthink();
		   profile.Skills_personality();
		   profile.Skills_primaryskill_dropdown();
		   profile.Skills_primaryskill_option();
		   profile.Skills_primaryrating();
		   profile.Skills_secondaryskill_dropdown();
		   profile.Skills_secondaryskill_option();
		   profile.Skills_secondaryrating();
		   profile.Skills_otherskilldropdown();
		   profile.Skills_otherskilloption();
		   profile.Skills_savebutton();	   
	  }
	  
	//  @Test(priority= 1)
	  public void CareerInfo ()
	  {
		  profile = new Candidate_ProfilePage(driver);
		  profile.AddcareerInfo_button();
		  profile.CareerInfo_Availabilitydropdown();
		  profile.CareerInfo_Availabilityoption();
		  profile.CareerInfo_loactiondropdown();
		  profile.CareerInfo_loactionoption();
		  profile.CareerInfo_sal("300000");
		  profile.CareerInfo_savebutton();
	  }
	  
	  @Test (priority= 1)
	  public void Experience() throws InterruptedException
	  {
		  profile2 = new Candidate_profilePage2(driver);
		  Thread.sleep(5000);
		  profile2.Add_Experiencebutton();
		  profile2.Experience_Designation("QA");
		  profile2.Experience_Employmentdropdown_page();
		  profile2.Experience_Employmentoption();
		  profile2.Experience_Company("Arus");
		  profile2.Experience_Industrytypedd();
		  profile2.Experience_Industytypeoption();
		  profile2.Experience_countrydd();
		  profile2.Experience_countryoption();
		  profile2.Experience_statedd();
		  profile2.Experience_stateoption();
		  profile2.Experience_citydd();
		  profile2.Experience_cityoption();
		  profile2.Experience_workmodedd();
		  profile2.Experience_workmodeoption();
		  profile2.From_month_Dropdown();
		  profile2.From_month_option();
		  profile2.From_year_Dropdown();
		  profile2.From_year_option();
		  profile2.Experience_checkbox();
		  profile2.Experience_desc("qqqqqqqwwwwwweeeeeeeerrrrrrrrttttttyyyyyyyyyuuuuuuuuuuiiiiiiiiiooooooooprrrrrrrrrrrrrrpppppp");
		  profile2.Experience_savebutton();
	  }	  
	  
	  
	  //@AfterTest
	  public void close()
	  {
		  driver.close();
	  }
}

