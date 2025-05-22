package Test;

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
		  profile2 = new Candidate_profilePage2(driver);
		  profile2.Clickhere();
	  }
}
