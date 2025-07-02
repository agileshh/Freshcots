package Test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.Powerapps_Page;

public class Powerapps 
{
	  WebDriver driver;
	  public Powerapps_Page powerapps;

	 @BeforeMethod
	  public void setup() 
	  {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://apps.powerapps.com/play/e/c817ecd4-a71d-e108-a96a-8c7882ed69dc/a/56d33454-4f25-4f8e-9b69-2db1fd39eaed?tenantId=c8413ef8-115f-4477-bc65-a0290476c302&hint=148ea6c0-e568-42ed-b704-5621147bd5d6&sourcetime=1745397996636");
	  }
	 
	 @Test
	 public void login() throws InterruptedException
	 {
		 powerapps= new Powerapps_Page(driver);
		 Thread.sleep(5000);
		 powerapps.Login_textfield("agileshh@freshcots.com");
		 powerapps.SendButton_page();
		 Thread.sleep(3000);
		 powerapps.Password_textfield("Vksdognas@97");
		 powerapps.submitbutton_Auth();
		 powerapps.yesbutton();
		 Thread.sleep(3000);
		 powerapps.SwitchTO_iframe();
		 Thread.sleep(3000);
		 powerapps.Email_ID("Agileshh");
		 powerapps.SendButton();
		 Thread.sleep(3000);
		 powerapps.OTP_box("1847");	
		 powerapps.SubmitButton();
		 //powerapps.SwitchTO_iframe();
		 powerapps.HamburgerMenu();
		 powerapps.UserVideoMenu();
		 powerapps.ViewVideobutton();
		 powerapps.Approvebutton();
	 }
}
