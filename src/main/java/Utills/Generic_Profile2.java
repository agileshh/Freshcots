package Utills;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import Pages.Candidate_ProfilePage1_About;
import Pages.Candidate_ProfilePage3_SkillandCarrear;
import Pages.Candidate_ProfilePage4_ProjectandCertitify;
import Pages.Candidate_ProfilePage5_Experience;
import Pages.Candidate_profilePage2_IDandEdu;

public class Generic_Profile2 
{
	public static void CareerInfo(Candidate_ProfilePage3_SkillandCarrear profile3,String Availability, String location) throws InterruptedException 
	{
		 SoftAssert softassert = new SoftAssert();
		 try
		 { 
			 profile3.AddcareerInfo_button();
			 profile3.CareerInfo_Availabilitydropdown();
			 profile3.CareerInfo_Availabilityoption1(Availability);
			 profile3.CareerInfo_loactiondropdown();
			 profile3.CareerInfo_loactionoption(location);
			 profile3.CareerInfo_sal("450000");
			 profile3.CareerInfo_savebutton();
			 profile3.CareerInfo_Percentagecompletion();
			  Thread.sleep(5000);
			  String ActualText = "60%";
			  String ExpectedText = profile3.CareerInfo_Percentagecompletion();
			  softassert.assertEquals(ExpectedText, ActualText);		
		 }catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
		 try
		 {
			 profile3.CareerInfo_edit_page();
			 profile3.CareerInfo_Availabilitydropdown();
			 profile3.CareerInfo_Availabilityoption2();
			 profile3.CareerInfo_sal("250000"); 
			 profile3.CareerInfo_savebutton();
		 }catch (Exception  e) {
			 System.out.println(e.getMessage());
		 }
	}
	
	public static void Education(Candidate_profilePage2_IDandEdu profile2,String Institute,String State, String City, String Course, String Department,String Mark) throws InterruptedException 
	{
		 try
		 {
			   for(int i =0;i<=2;i++)
			   {
				   try
				   {
					   profile2.Add_Education_button();
				   }catch(Exception e) {
					   profile2.Addmore_Edu_button();
				   }   
				   profile2.Institution_dropdown();
				   profile2.Institution_option(Institute);
				   profile2.State_dropdown();
				   profile2.State_option(State);
				   profile2.City_dropdown();
				   profile2.City_option(City);
				   profile2.Course_dropdown();
				   profile2.Course_option(Course);
				   profile2.Department_dropdown();
				   profile2.Department_option(Department);		
				   profile2.From_month_Dropdown();
				   profile2.From_month_option();
				   profile2.From_year_Dropdown();
				  profile2.From_year_option();
				   profile2.To_month_Dropdown();
				   profile2.To_month_option();
				   profile2.To_year_Dropdown();
				   profile2.To_year_option();
				   //profile.Course_type();
				   profile2.Mark(Mark);
				   profile2.Save_button_Education();
				   Thread.sleep(5000);
				   String actualText= "75%";
				   String ExpectedText = profile2.Education_Percentagecompletion();
				   //Assert.assertEquals(ExpectedText,actualText);
			   }	   		   
		 }catch(Exception e) {
			  System.out.println(e.getMessage());
		 } 
		 try
		 {
			 profile2.Editbutton();
			 profile2.Delete_Edu_button();
		 }catch(Exception e) {
			 System.out.println( e.getMessage());
			 System.out.println("Delete button not present");
		 }
    }
	
	public static void Experience(Candidate_ProfilePage5_Experience profile5,String Designation,String Company,String state,String Descrip) throws InterruptedException 
	{
		profile5.Add_Experiencebutton();
		profile5.Experience_Designation(Designation);
		profile5.Experience_Employmentdropdown_page();
		profile5.Experience_Employmentoption();
		profile5.Experience_Company(Company);
		profile5.Experience_Industrytypedd();
		profile5.Experience_Industytypeoption();
		profile5.Experience_countrydd();
		profile5.Experience_countryoption();
		profile5.Experience_statedd(state);
	    profile5.Experience_stateoption();
		profile5.Experience_citydd();
		profile5.Experience_cityoption();
		profile5.Experience_workmodedd();
		profile5.Experience_workmodeoption();
		profile5.From_month_Dropdown();
		profile5.From_month_option();
		profile5.From_year_Dropdown();
		profile5.From_year_option();
		profile5.Experience_checkbox();
		profile5.Experience_desc(Descrip);
		profile5.Experience_savebutton();
	}
	
	public static void Project(Candidate_ProfilePage4_ProjectandCertitify profile4) throws InterruptedException 
	{
		profile4.Add_Projectbutton();
		profile4.Project_Projectname("Second year project");
		profile4.Pro_From_month_Dropdown();
		profile4.Pro_From_month_option();
		profile4.Pro_From_year_Dropdown();
		profile4.Pro_From_year_option();
		profile4.Pro_To_month_Dropdown();
		profile4.Pro_To_month_option();
		profile4.Pro_To_year_dropdown();
		profile4.Pro_To_year_option();
		profile4.Project_Description("Please check the Incorrect answer below what u have been writen......fine thank you");
		profile4.Project_save();
	}
	
	public static void Certificates(Candidate_ProfilePage4_ProjectandCertitify profile4) throws InterruptedException 
	{
		profile4.Add_Certification_button();
		profile4.Certification_name("Yugabyte");
		profile4.Certification_provider("Qspider");
		profile4.Certification_link("www.camp.co.in");
		profile4.Cer_from_month_dropdown();
		profile4.Cer_from_month_option();
		profile4.Cer_from_year_dropdown();
		profile4.Cer_from_year_option();
		profile4.Cer_checkbox();
		profile4.Cer_savebutton();
	}
	
	public static void Display_Pic_Takephoto(Candidate_ProfilePage1_About profile) throws InterruptedException 
	{
		 try
		 {
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
	
	public static void Display_Pic_UploadPic(Candidate_ProfilePage1_About profile) throws InterruptedException 
	{
			  profile.Uploadpic();
			  String imagePath = "C:\\Users\\arusi\\Downloads\\1740232414388.jpeg";
			  profile.uploadnewpic(imagePath);
			  //profile.uploadnewpic();
			  profile.savepicbutton();
	}
}
