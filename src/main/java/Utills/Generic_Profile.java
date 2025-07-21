package Utills;

import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import Pages.Candidate_ProfilePage1_About;
import Pages.Candidate_ProfilePage3_SkillandCarrear;
import Pages.Candidate_profilePage2_IDandEdu;
import Pages.Expert_Schedule_Page;

public class Generic_Profile 
{
	public static void Self_Intro(Candidate_ProfilePage1_About profile) throws InterruptedException 
	{
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
	
	public static void Profile_summary(Candidate_ProfilePage1_About profile,String Summary) throws InterruptedException 
	{
		SoftAssert softassert = new SoftAssert();
		try
		  {
			  
			  profile.Addprofile_button();
			  Thread.sleep(3000);
			  profile.addprofile_text_area(Summary);
		      profile.addprofile_savebutton();
		      Thread.sleep(5000);
		      String actualText = "20%";
		      String ExpectedText = profile.profile_Percentagecompletion();
		      softassert.assertEquals(ExpectedText,actualText);
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
				  softassert.assertEquals(Expected, Actual);
			  }
		  }catch (Exception e)  {
			  System.out.println("No edit icon cant able to edit");
			  System.out.println( e.getMessage());
		  }	  
	}
	
	public static void AreaofIntrest(Candidate_ProfilePage1_About profile, List<String> Domain) throws InterruptedException 
	{
	   	SoftAssert softassert = new SoftAssert();
		  try  { 
			 profile.add_AreaofIntrestButton();
		  }
		  catch(Exception e) {
		  profile.AreaofIntrest_Editbutton();
		  }
       	  profile.add_AreaofIntrest_Industrydropdown();
       	  profile.add_AreaofIntrest_IToption();
       	  profile.SelectDomain_Dropdown();
       	  profile.Select_domain(Domain);
       	  Thread.sleep(5000);
       	  profile.add_AreaofIntrest_savebutton();
       	  Thread.sleep(5000);
       	  String actualText= "25%";
       	  String ExpectedText = profile.AreaofIntrest_Percentagecompletion();
        	//softassert.assertEquals(ExpectedText,actualText);  
        	//softassert.assertAll();
	} 	
	
	public static void Identification(Candidate_profilePage2_IDandEdu profile2,String Gender, String State,String City) throws InterruptedException 
	{
		SoftAssert softassertion = new SoftAssert();
		try
		   {
			   profile2.Add_Identificationbutton();
			   profile2.yearofbirthdropdown();
			   profile2.yearofbirth();
			   profile2.Genderdropdown();
		       profile2.Genderoption(Gender);
			   profile2.Statedropdown();
			   profile2.Stateoptionpage(State);
			   profile2.Citydropdown();
			   profile2.Cityoption(City);
			   // profile2.Languagedropdown();
			   //profile2.Language_option(Language);
			   //profile2.Language_Proficiancy();
			   profile2.Savebutton();  
			   String actualText= "45%";
			   String ExpectedText = profile2.Identification_Percentagecompletion();
			   softassertion.assertEquals(ExpectedText,actualText);
		   }catch(Exception e) {
			   e.printStackTrace(); 
		   }	   
	}
	
	public static void skill(Candidate_ProfilePage3_SkillandCarrear profile3,String primarySkill,String SecondarySkill,String otherSkill) throws InterruptedException 
	{
		  SoftAssert softassertion = new SoftAssert();
		try
		   {
			   profile3.Addskill_button();
			   profile3.Skills_Communicationrating();
			   profile3.Skills_criticalthink();
			   profile3.Skills_personality();
			   profile3.Skills_primaryskill_dropdown();
			   profile3.Skills_primaryskill_option(primarySkill);
			   profile3.Skills_primaryrating();
			   profile3.Skills_secondaryskill_dropdown();
			   profile3.Skills_secondaryskill_option1(SecondarySkill);
			   profile3.Skills_secondaryrating();
			   profile3.Skills_otherskilldropdown();
			   profile3.Skills_otherskilloption(otherSkill);
			   profile3.Skills_savebutton();	 
			   Thread.sleep(5000);
			   String actualText= "55%";
			   String ExpectedText = profile3.Skill_Percentagecompletion();
			   softassertion.assertEquals(ExpectedText,actualText);
		   }catch(Exception e) {
			   System.out.println( e.getMessage());
		   }
		   try
		   {
			   profile3.Skill_Editbutton();
			   profile3.Skills_secondaryskill_dropdown();
			   profile3.Skills_secondaryskill_option2();
			   String actual = profile3.Skill_warning_message();
			   softassertion.assertEquals(actual, "Primary and secondary skills should be different");
		   }catch (Exception e) {
			   System.out.println(e.getMessage());
		   }
	}
	
	public static void PrimrySKill_SecondarySkills_CrossVerify(Candidate_ProfilePage3_SkillandCarrear profile3,String primarySkill,String SecondarySkill,String otherSkill ) throws InterruptedException 
	{
		profile3.Editskill_button();   
		profile3.Skills_primaryskill_dropdown();
		profile3.Skills_primaryskill_option(primarySkill);
		profile3.Skills_primaryrating();
		profile3.Skills_secondaryskill_dropdown();
		profile3.Skills_primaryskill_option(primarySkill);
		profile3.Skills_secondaryrating();
	}

}
