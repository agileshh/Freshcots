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
import org.testng.annotations.Test;

import Base.Baseclass;
import Pages.Candidate_ProfilePage;
import Pages.Candidate_profilePage2;
import Pages.LoginPage;
import Utills.Generic;

public class Candidate_Profile extends Baseclass
{
	public WebDriver driver;
	public LoginPage login;
	public Candidate_ProfilePage profile;  
	public Candidate_profilePage2 profile2;  
	
	  @BeforeMethod
	  public void setup() throws IOException, InterruptedException
	  {
		  driver= Initializebrowser("chrome");
		  login = new LoginPage(driver);
		  Generic.loginWithOTP(login, "candidate1");
		  profile = new Candidate_ProfilePage(driver);
		  profile.ViewProfilebutton();
	  }
	  
	  @Test (priority= 0) 
	  public void displaypicture() throws InterruptedException
	  {
		 try
		 {
			  profile = new Candidate_ProfilePage(driver);
			  profile.Uploadpic();
			  profile.Usecamara();
			  Thread.sleep(4000);
			  profile.Takepic();
			  profile.savepicbutton();
			  Thread.sleep(5000);
			  String actualText= "15%";
			  String ExpectedText = profile.dp_Percentagecompletion();
			  Assert.assertEquals(ExpectedText,actualText);
		 }catch(Exception ignored) {}
	  }		  
	  
	  @Test (priority= 1)
	  public void SelfIntro() throws InterruptedException
	  {
		 profile = new Candidate_ProfilePage(driver);
		 try
		 {
			  profile.record_selfintro_button();
			  Thread.sleep(4000);
			  profile.startrecordbutton();
			  Thread.sleep(4000);
			  profile.stoprecordbutton();	
			  profile.submitforreviewbutton();
			  //profile.viewvideobutton();	
			 // profile.viewvideocancelicon();
		 }catch (Exception e) {
			 System.out.println( e.getMessage());  
			 System.out.println("Video already recorded");
		 }	 
		 try
		 {
			 if(profile.Under_reviewtext())
			 {
				 profile.Retakebutton();
				 profile.startrecordbutton();
				 profile.stoprecordbutton();	
				 profile.submitforreviewbutton();	
				 System.out.println("Under review is Condition is passed");
			 }if(profile.Approvedtext())
			 {
				 Assert.assertTrue(profile.Approvedtext(), "'Approved' text is not visible.");
			     Assert.assertTrue(profile.isRetakeButtonDisabled(), "Retake button should be disabled.");
			 }		 
		 }catch (Exception e) {
			 System.out.println("Demo");
		 }	 
	   }
	  
	  @Test (priority= 2)
	  public void Profile() throws InterruptedException
	  {
		  try
		  {
			  profile = new Candidate_ProfilePage(driver);
			  profile.Addprofile_button();
			  Thread.sleep(3000);
			  profile.addprofile_text_area("Hi I am XYZ writing the teste cases in both manual and Automation as well...keep going");
		      profile.addprofile_savebutton();
		      Thread.sleep(5000);
		      String actualText = "20%";
		      String ExpectedText = profile.profile_Percentagecompletion();
			  Assert.assertEquals(ExpectedText,actualText);
		  }catch (Exception e)  {
			  System.out.println( e.getMessage());
			  System.out.println("Profile already exist");
		  }	  	  
		  try
		  {
			  if(profile.Profile_Edit_Icon_Exist())
			  {
				  profile.Profile_Edit_Icon1();
				  profile.Profile_EditCancel_Icon();
				  String Expected = "Hi I am XYZ writing the teste cases in both manual and Automation as well...keep going";
				  String Actual = profile.Profile_GetText();
				  Assert.assertEquals(Expected, Actual);
			  }
		  }catch (Exception e)  {
			  System.out.println("No edit icon cant able to edit");
			  System.out.println( e.getMessage());
		  }	  
	  }
	  
      @Test  (priority= 3)
	  public void AreaofIntrest() throws InterruptedException
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
        	  Thread.sleep(5000);
        	  String actualText= "25%";
        	  String ExpectedText = profile.AreaofIntrest_Percentagecompletion();
        	  Assert.assertEquals(ExpectedText,actualText);
    	  }catch (Exception e)
		  {
    		   System.out.println( e.getMessage());
		  }	  
	  }	 
	  
	  @Test (priority= 4)
	  public void Identification() throws InterruptedException
	  {
		   try
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
			   Thread.sleep(5000);
			   String actualText= "45%";
			   String ExpectedText = profile.Identification_Percentagecompletion();
			   Assert.assertEquals(ExpectedText,actualText);
		   }catch(Exception e) {
			   System.out.println( e.getMessage());
		   }	   
	  }
	  
	  @Test(priority= 5)
	  public void Skills() throws InterruptedException
	  {
		   try
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
			   profile.Skills_secondaryskill_option1();
			   profile.Skills_secondaryrating();
			   profile.Skills_otherskilldropdown();
			   profile.Skills_otherskilloption();
			   profile.Skills_savebutton();	 
			   Thread.sleep(5000);
			   String actualText= "55%";
			   String ExpectedText = profile.Skill_Percentagecompletion();
			   Assert.assertEquals(ExpectedText,actualText);
		   }catch(Exception e) {
			   System.out.println( e.getMessage());
		   }
		   try
		   {
			   profile = new Candidate_ProfilePage(driver);
			   profile.Skill_Editbutton();
			   profile.Skills_secondaryskill_dropdown();
			   profile.Skills_secondaryskill_option2();
			   String actual = profile.Skill_warning_message();
			   Assert.assertEquals(actual, "Primary and secondary skills should be different");
		   }catch (Exception e) {
			   System.out.println(e.getMessage());
		   }
	  }
	  
	  @Test(priority= 6)
	  public void CareerInfo () throws InterruptedException
	  {
		 try
		 {
			  profile = new Candidate_ProfilePage(driver);
			  profile.AddcareerInfo_button();
			  profile.CareerInfo_Availabilitydropdown();
			  profile.CareerInfo_Availabilityoption1();
			  profile.CareerInfo_loactiondropdown();
			  profile.CareerInfo_loactionoption();
			  profile.CareerInfo_sal("300000");
			  profile.CareerInfo_savebutton();
			  profile.CareerInfo_Percentagecompletion();
			  Thread.sleep(5000);
			  String ActualText = "60%";
			  String ExpectedText = profile.CareerInfo_Percentagecompletion();
		      Assert.assertEquals(ExpectedText, ActualText);		
		 }catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
		 try
		 {
			 profile = new Candidate_ProfilePage(driver);	
			 profile.CareerInfo_edit_page();
			 profile.CareerInfo_Availabilitydropdown();
			 profile.CareerInfo_Availabilityoption2();
			 profile.CareerInfo_sal("250000"); 
			 profile.CareerInfo_savebutton();
		 }catch (Exception  e) {
			 System.out.println(e.getMessage());
		 }
	  } 
	  
	  @Test(priority= 7)
	  public void Education() throws InterruptedException
	  {
		 try
		 {
			   for(int i =0;i<=2;i++)
			   {
				   profile = new Candidate_ProfilePage(driver);
				   Thread.sleep(3000); 
				   try
				   {
					   profile.Add_Education_button();
				   }catch(Exception e) {
					   profile.Addmore_Edu_button();
				   }   
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
				   Thread.sleep(5000);
				   String actualText= "75%";
				   String ExpectedText = profile.Education_Percentagecompletion();
				   Assert.assertEquals(ExpectedText,actualText);
			   }	   		   
		 }catch(Exception e) {
			  System.out.println(e.getMessage());
		 } 
		 try
		 {
			 profile = new Candidate_ProfilePage(driver);
			 profile.Editbutton();
			 profile.Delete_Edu_button();
		 }catch(Exception e) {
			 System.out.println( e.getMessage());
			 System.out.println("Delete button not present");
		 }
	  }	  
	  
	  //@Test (priority= 8)
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
	  
	 // @Test (priority= 9)
	  public void Project() throws InterruptedException
	  {
		  profile2 = new Candidate_profilePage2(driver);
		  Thread.sleep(5000);
		  profile2.Add_Projectbutton();
		  profile2.Project_Projectname("Second year project");
		  profile2.Pro_From_month_Dropdown();
		  profile2.Pro_From_month_option();
		  profile2.Pro_From_year_Dropdown();
		  profile2.Pro_From_year_option();
		  profile2.Pro_To_month_Dropdown();
		  profile2.Pro_To_month_option();
		  profile2.Pro_To_year_dropdown();
		  profile2.Pro_To_year_option();
		  profile2.Project_Description("Please check the Incorrect answer below what u have been writen......fine thank you");
		  profile2.Project_save();
	  }
	  
	 // @Test (priority= 10)
	  public void Certificates() throws InterruptedException
	  {
		  profile2 = new Candidate_profilePage2(driver);
		  Thread.sleep(5000);
		  profile2.Add_Certification_button();
		  profile2.Certification_name("Yugabyte");
		  profile2.Certification_provider("Qspider");
		  profile2.Certification_link("www.camp.co.in");
		  profile2.Cer_from_month_dropdown();
		  profile2.Cer_from_month_option();
		  profile2.Cer_from_year_dropdown();
		  profile2.Cer_from_year_option();
		  profile2.Cer_checkbox();
		  profile2.Cer_savebutton();
	  }
	  
	  @AfterMethod
	  public void cleanUp() 
	  {
		driver.quit();
	  }
 }

