package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.internal.BaseClassFinder;

import Utills.Generic;

public class Rating_and_Review_page 
{
	   WebDriver driver;
	   
	   //Annotation
	   
	   @FindBy(xpath = "//span[normalize-space()='Interview']")
	   WebElement Interview_dropdown_page;
	   
	   @FindBy(xpath = "//span[normalize-space()='Ratings']")
	   WebElement Ratings_page;
	   
	   @FindBy(xpath = "//button[normalize-space()= 'Ratings']")
	   WebElement Rating_Tab_page;
	   
	   @FindBy(xpath = "(//*[normalize-space()='Give Ratings'])[1]")
	   WebElement Give_rating_page;
	   
	   @FindBy(xpath = "//*[normalize-space()='Give Ratings']")
	   WebElement Give_rating_Reviewer_page;
	   
	   @FindBy(xpath = "//button[contains(text(),'▶ Play')]")
	   WebElement Playbutton_page;
	   
	   @FindBy(xpath = "//div[@class='MuiBox-root css-0']//div[1]//div[1]//button[5]")
	   WebElement Communication_rate_page;
	   
	   @FindBy(xpath = "//div[@class='MuiBox-root css-1lnh1kv']//div[2]//div[1]//button[5]")
	   WebElement CriticalThink_rate_page;
	   
	   @FindBy(xpath = "(//*[normalize-space() = '5'])[3] ")
	   WebElement Personality_rate_page;
	   
	   @FindBy(xpath = "//button[normalize-space()='Save']")
	   WebElement Save_button_page;
	   
	   @FindBy(xpath = "//button[normalize-space()='Cancel']")
	   WebElement Cancel_button_page;
	   
	   @FindBy(xpath = "//div[@class='MuiBox-root css-11h9wu4']//span[@class='MuiChip-label MuiChip-labelMedium css-14vsv3w'][normalize-space()='pending']")
	   WebElement HR_Rating_Pending;
	   
	   @FindBy(xpath = "(//span[normalize-space()='Done'])[1]")
	   WebElement HR_Rating_Done;
	   
	   @FindBy(xpath = "//div[@class='MuiBox-root css-j2fuo0']//span[@class='MuiChip-label MuiChip-labelMedium css-14vsv3w'][normalize-space()='pending']")
	   WebElement Reviewer_Rating_Pending;
	   
	   @FindBy(xpath = "(//span[normalize-space()='Done'])[2]")
	   WebElement Reviewer_Rating_Done;
	   
	   @FindBy(xpath = "//p[text() = 'Your ratings and video are now available on your profile']")
	   WebElement HR_Approved;
	   
	   @FindBy(xpath = "//p[text() = 'Your ratings and video are now available on your profile']")
	   WebElement Tech_Approved;
	   
	   @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-43etnu']")
	   WebElement Under_Review_Text;
	   
	   @FindBy(xpath = "//button[normalize-space()='Go to profile']")
	   WebElement Go_To_Profile;
	   
	   @FindBy(xpath = "//span[normalize-space()='Review & Rate']")
	   WebElement Review_and_rate;
	   
	   @FindBy(xpath = "//button[normalize-space()='Grab one for review']")
	   WebElement Grab_One_Button;
	   
	   @FindBy(xpath = "//h5[normalize-space()='1']")
	   WebElement Candidate_For_Review_text;
	   
	   @FindBy(xpath = "//h5[normalize-space()='0']")
	   WebElement No_Candidate_For_Review;
	   
	   //Constructor
	   public Rating_and_Review_page(WebDriver driver)
	   {
		   this.driver = driver;
	       PageFactory.initElements(driver, this);
	   }
	   
	   //Action Class  
	   public void Interview_dropdown()
	   {
		   Generic.Click(Interview_dropdown_page, 10);
	   }
	   
	   public void Ratings_page()
	   {
		   Generic.Click(Ratings_page, 10);
	   }
	   
	   public void Rating_Tab()
	   {
		   Generic.Click(Rating_Tab_page, 10);
	   }
	   
	   public void Give_rating()
	   {
		   Generic.Click(Give_rating_page, 10);
	   }
	   
	   public void Give_rating_Reviewer()
	   {
		   Generic.Click(Give_rating_Reviewer_page, 10);
	   }
	   
	   public void Communication_rate()
	   {
		   Generic.Click(Communication_rate_page, 10);
	   }
	   
	   public void CriticalThink_rate()
	   {
		   Generic.Click(CriticalThink_rate_page, 10);
	   }
	   
	   public void Personality_rate()
	   {
		   Generic.Click(Personality_rate_page, 10);
	   }
	   
	   public void Save_button()
	   {
		   Generic.Click(Save_button_page, 10);
	   }
	   
	   public boolean HR_Rating_Pending()
	   {
		   return HR_Rating_Pending.isDisplayed();
	   }
	   
	   public boolean HR_Rating_Done ()
	   {
		   return HR_Rating_Done.isDisplayed();
	   }
	   
	   public boolean Reviewer_Rating_Pending()
	   {
		   return Reviewer_Rating_Pending.isDisplayed();	  
	   }
	   
	   public boolean Reviewer_Rating_Done()
	   {
		   return Reviewer_Rating_Done.isDisplayed();
	   }
	   
	   public boolean HR_Approved ()
	   {
		   return HR_Approved.isDisplayed();
	   }

	   public void Review_and_rate()
	   {
		   Generic.Click(Review_and_rate, 10);
	   }
	   
	   public void Grab_One_Button()
	   {
		   Generic.Click(Grab_One_Button, 10);
	   }
	   
	   public boolean Grab_One_Button_EnableorDisable()
	   {
		   return Grab_One_Button.isEnabled();
	   }
	   
	   public void Go_To_Profile()
	   {
		   Generic.Click(Go_To_Profile, 10);
	   }
	    
	   public boolean Candidate_For_Review_text()
	   {
		   return Candidate_For_Review_text.isDisplayed();	  
	   }
	   
	   public boolean Under_Review_Text()
	   {
		   return Under_Review_Text.isDisplayed();	  
	   }
	   
	   public boolean Tech_Approved ()
	   {
		   return Tech_Approved.isDisplayed();
	   }
	   
	   public boolean No_Candidate_For_Review ()
	   {
		   return No_Candidate_For_Review.isDisplayed();
	   }
}
