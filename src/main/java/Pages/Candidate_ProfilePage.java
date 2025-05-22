package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utills.Generic;

public class Candidate_ProfilePage extends Generic
{
	WebDriver driver;
	
	//Annotations
	@FindBy(xpath = "//button[normalize-space()='View Profile']")
	WebElement Viewprofile_buttonPage;
	
	@FindBy(xpath = "(//button[contains(@class, 'MuiButtonBase-root MuiIconButton-root')])[3]")
	WebElement Clickuploadpicpage;
	
	@FindBy(xpath = "//button[normalize-space()='Use Camera']")
	WebElement Clickusecamarapage;
	
	@FindBy(xpath = "//button[normalize-space()='Take Photo']")
	WebElement Takepicpage;
	
	@FindBy(xpath = "//button[normalize-space()='Upload Photo']")
	WebElement uploadpicpage;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement savepicbuttonpage;
	
	@FindBy(xpath = "//button[normalize-space()='Record Now']")
	WebElement recordnowbuttonpage;
	
	@FindBy(xpath = "//button[normalize-space()='Start Record']")
	WebElement startrecordbuttonpage;
	
	@FindBy(xpath = "//button[normalize-space()='Stop']")
	WebElement stoprecordbuttonpage;
	
	@FindBy(xpath = "//button[normalize-space()='Submit For Review']")
	WebElement submitforreviewbuttonpage;
	
	@FindBy(xpath = "//button[@id='long-button']")
	WebElement Retakebuttonkebabpage;
	
	@FindBy(xpath = "//li[@role='menuitem']")
	WebElement Retakebuttonpage;
	
	@FindBy(xpath = "//button[normalize-space()='view video']")
	WebElement viewvideobuttonpage;
	
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-13txczy']")
	WebElement Underreviewtextpage;
	
	@FindBy(xpath = "//span[@class='MuiChip-label MuiChip-labelSmall css-b9zgoq'][normalize-space()='10%']")
	WebElement Percentage_bar_page;
	
	@FindBy(xpath = "//button[normalize-space()='Add Profile Summary']")
	WebElement Addprofile_button_page;
	
	@FindBy(xpath = "//textarea[contains(@id ,':r')]")
	WebElement addprofile_text_area_page;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement addprofile_savebutton_page;
	
	@FindBy(xpath = "//button[normalize-space()='Add Interest']")
	WebElement add_AreaofIntrestButton_page;
	
	@FindBy(xpath = "//div[@role='combobox']")
	WebElement add_AreaofIntrest_Industrydropdown_page;
	
	@FindBy(xpath = "//li[@role='option']")
	WebElement add_AreaofIntrest_IToption_page;
	
	@FindBy(xpath = "//input[contains(@id,':r')]")
	WebElement SelectDomain_Dropdown_page;
	
	@FindBy(xpath = "(//li[contains(@id , ':r')])[5]")
	WebElement select_option_page;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement add_AreaofIntrest_savebutton_page;
	
	@FindBy(xpath = "//button[normalize-space()='Add Identification']")
	WebElement Add_Identificationbutton_page;
	
	@FindBy(xpath = "//div[@aria-labelledby = 'birth-year']")
	WebElement yearofbirthdropdownpage;
	
	@FindBy(xpath = "//li[normalize-space()='2019']")
	WebElement yearofbirthoptionpage;
	
	@FindBy(xpath = "(//div[contains(@class , 'MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary')])[6]")
	WebElement Genderdropdownpage;
	
	@FindBy(xpath = "//li[normalize-space()='Male']")
	WebElement Genderoptionpage;
	
	@FindBy(xpath = "//button[@class = 'MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium MuiAutocomplete-popupIndicator css-amwtx2']")
	WebElement Statedropdownpage;
	
	@FindBy(xpath = "//li[contains(text(),'Andaman and Nicobar Islands')]")
	WebElement Stateoptionpage;
	
	@FindBy(xpath = "(//button[@class ='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium MuiAutocomplete-popupIndicator css-amwtx2' ])[2]")
	WebElement Citydropdownpage;
	
	@FindBy(xpath = "(//li[contains(@id ,':r')])[3]")
	WebElement Cityoptionpage;
	
	@FindBy(xpath = "(//div[@role='combobox'])[3]")
	WebElement Languagedropdownpage;
	
	@FindBy(xpath = "//li[normalize-space()='Albanian']")
	WebElement Language_option_page;
	
	@FindBy(xpath = "//label[1]//span[1]//input[1]")
	WebElement Language_Proficiancy_page;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement Savebutton_page;
	
	@FindBy(xpath = "//button[normalize-space()='Add Education']")
	WebElement Add_Education_button_page ;
	
	@FindBy(xpath = "//div[@role='presentation']//div[1]//div[1]//div[1]//div[1]//div[1]//button[1]//*[name()='svg']")
	WebElement Institution_dropdown_page;
	
	@FindBy(xpath = "(//li[contains(@id,':r')])[2]")
	WebElement Institution_option_page ;
	
	@FindBy(xpath = "//div[@class='MuiBox-root css-dur6e7']//div[3]//div[1]//div[1]//div[1]//div[1]//button[1]//*[name()='svg']")
	WebElement State_dropdown_page;
	
	@FindBy(xpath = "(//li[contains(@id, ':r')])[2]")
	WebElement State_option_page;
	
	@FindBy(xpath = "//div[4]//div[1]//div[1]//div[1]//div[1]//button[1]//*[name()='svg']")
	WebElement City_dropdown_page;
	
	@FindBy(xpath = "//li[text() = 'Anantapur']")
	WebElement City_option_page;
	
	@FindBy(xpath = "(//div[@class='MuiAutocomplete-endAdornment css-iuka1o'])[4]")
	WebElement Course_dropdown_page;
	
	@FindBy(xpath = "//li[text() = 'B.E']")
	WebElement Course_option_page;
	
	@FindBy(xpath = "//input[@placeholder = 'Choose your department']")
	WebElement Department_dropdown_page;
	
	@FindBy(xpath = "//li[text() = 'AI/ML']")
	WebElement Department_option_page;
	
	@FindBy(xpath = "//div[@class = 'MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-xhuv26' and @aria-labelledby= 'start-month']")
	WebElement From_month_Dropdown_page;
	
	@FindBy(xpath = "//li[@class = 'MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-5llfx1' and @data-value= 'Jun' ]")
	WebElement From_month_option_page;
	
	@FindBy(xpath = "//div[@class = 'MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-xhuv26' and @aria-labelledby= 'start-year']")
	WebElement From_year_Dropdown_page;
	
	@FindBy(xpath = "//li[@class = 'MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-5llfx1' and @data-value= '2014' ]")
	WebElement From_year_option_page;
	
	@FindBy(xpath = "//div[@class = 'MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-xhuv26' and @aria-labelledby= 'end-month']")
	WebElement To_month_Dropdown_page;
	
	@FindBy(xpath = "//li[@class = 'MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-5llfx1' and @data-value= 'Apr' ]")
	WebElement To_month_option_page;
	
	@FindBy(xpath = "//div[@class = 'MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-xhuv26' and @aria-labelledby= 'end-year']")
	WebElement To_year_Dropdown_page;
	
	@FindBy(xpath = "//li[@class = 'MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-5llfx1' and @data-value= '2017' ]")
	WebElement To_year_option_page;
	
	
	@FindBy(xpath = "//input[@value='Part-time']")
	WebElement Course_type_page;
	
	@FindBy(xpath = "//input[@placeholder='Type in percentage %']")
	WebElement Mark_page;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement Save_button_Education_page;
	
	@FindBy(xpath = "//button[normalize-space()='Add Skills']")
	WebElement Addskill_button_page;
	
	@FindBy(xpath = "//div[@class='MuiStack-root css-1jdgafz']//div[1]//div[1]//div[1]//button[5]")
	WebElement Skills_Communicationrating_page;
	
	@FindBy(xpath = "//div[@class='MuiStack-root css-1jdgafz']//div[2]//div[1]//div[1]//button[5]")
	WebElement Skills_criticalthink_page;
	
	@FindBy(xpath = "//div[@class='MuiStack-root css-1jdgafz']//div[3]//div[1]//div[1]//button[4]")
	WebElement Skills_personality_page;
	
	@FindBy(xpath = "//input[@placeholder='Type your one Primary skill & self rate']")
	WebElement Skills_primaryskill_dropdown_page;
	
	@FindBy(xpath = "//li[text() = 'Java']")
	WebElement Skills_primaryskill_option_page;
	
	@FindBy(xpath = "//input[@placeholder='Type your one secondary skill & self rate']")
	WebElement Skills_secondaryskill_dropdown_page;
	
	@FindBy(xpath = "//li[text() = 'C#']")
	WebElement Skills_secondaryskill_option_page;
	
	@FindBy(xpath = "//div[5]//div[2]//div[1]//div[1]//div[1]//div[1]//button[5]")
	WebElement Skills_primaryrating_page;
	
	@FindBy(xpath = "//div[6]//div[2]//div[1]//div[1]//div[1]//div[1]//button[5]")
	WebElement Skills_secondaryrating_page;
	
	@FindBy(xpath = "//input[@placeholder='Type your other skills']")
	WebElement Skills_otherskilldropdown_page;
	
	@FindBy(xpath = "//li[text() = 'dbms']")
	WebElement Skills_otherskilloption_page;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement Skills_savebutton_page;
	
	@FindBy(xpath = "//button[normalize-space()='Add Career Info']")
	WebElement AddcareerInfo_button_page;
	
	@FindBy(xpath = "//input[@id='availability']")
	WebElement CareerInfo_Availabilitydropdown_page;
	
	@FindBy(xpath = "//li[@id='availability-option-0']")
	WebElement CareerInfo_Availabilityoption_page;
	
	@FindBy(xpath = "//input[@id='preferred-locations']")
	WebElement CareerInfo_loactiondropdown_page;
	
	@FindBy(xpath = "//li[@id='preferred-locations-option-5']")
	WebElement CareerInfo_loactionoption_page;
	
	@FindBy(xpath = "//input[@placeholder='EX: 2,50,000']")
	WebElement CareerInfo_sal_page;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement CareerInfo_savebutton_page;
	
	//Constructor
    public Candidate_ProfilePage(WebDriver driver)
   {
    	this.driver = driver;
	    PageFactory.initElements(driver, this);
   }
    
    //Action class
    public void ViewProfilebutton()
    {
 	   Generic.Click(Viewprofile_buttonPage, 0);
    }
    
    public void Uploadpic()
    {
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
    	((JavascriptExecutor) driver).executeScript("arguments[0].click();", Clickuploadpicpage);
    	//Generic.Click(Clickuploadpicpage, 10);
    }
    
    public void Usecamara()
    {
    	Generic.Click(Clickusecamarapage, 10);
    }
    
    public void Takepic()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.elementToBeClickable(Takepicpage));
    	Generic.Click(Takepicpage, 20);
    }
    
    public void savepicbutton()
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", savepicbuttonpage);
        js.executeScript("arguments[0].click();", savepicbuttonpage);
    }
    
    public void record_selfintro_button()
    {
    	Generic.Click(recordnowbuttonpage, 0);
    }
    
    public void startrecordbutton()
    {
    	Generic.Click(startrecordbuttonpage, 0);
    }
    
    public void stoprecordbutton()
    {
    	Generic.Click(stoprecordbuttonpage, 30);
    }
    
    public void submitforreviewbutton()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(submitforreviewbuttonpage));
    	Generic.Click(submitforreviewbuttonpage, 0);
    }
    
    public void viewvideobutton()
    {
    	Generic.Click(viewvideobuttonpage, 0);
    } 
    
    public boolean Under_reviewtext()
    {
    	try
    	{
    		return Underreviewtextpage.isDisplayed();
    	}catch (Exception e)
    	{
    		return false;  	
    	}	
    }  
    
    public void Retakebuttonkebab()
    {
    	Generic.Click(Retakebuttonkebabpage, 0);
    } 
    
    public void Retakebutton()
    {
    	Generic.Click(Retakebuttonpage, 0);
    } 
    
    public void Addprofile_button()
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", Addprofile_button_page);
        js.executeScript("arguments[0].click();", Addprofile_button_page);
    }
    
    public void addprofile_text_area(String sent)
    {
   
    	Generic.sendkeys(addprofile_text_area_page, sent, 10);
    }
    
    public void addprofile_savebutton()
    {
    	Generic.Click(addprofile_savebutton_page, 0);
    }
    
    public void add_AreaofIntrestButton()
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", add_AreaofIntrestButton_page);
        js.executeScript("arguments[0].click();", add_AreaofIntrestButton_page);
    }
    
    public void add_AreaofIntrest_Industrydropdown()
    {
    	Generic.Click(add_AreaofIntrest_Industrydropdown_page, 10);
    }
    
    public void add_AreaofIntrest_IToption()
    {
    	Generic.Click(add_AreaofIntrest_IToption_page, 10);
    }
    
    public void SelectDomain_Dropdown()
    {
    	Generic.Click(SelectDomain_Dropdown_page, 10);
    }
    
    public void select_option()
    {
    	Generic.Click(select_option_page, 10);
    }
    
    public void add_AreaofIntrest_savebutton()
    {
    	Generic.Click(add_AreaofIntrest_savebutton_page, 10);
    }
    
    public void Add_Identificationbutton()
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", Add_Identificationbutton_page);
        js.executeScript("arguments[0].click();", Add_Identificationbutton_page);
    }
    
    public void yearofbirthdropdown()
    {
    	Generic.Click(yearofbirthdropdownpage, 10);
    }
    
    public void yearofbirthoption()
    {
    	Generic.Click(yearofbirthoptionpage, 10);
    }
    
    public void Genderdropdown()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(Genderdropdownpage));
    	Generic.Click(Genderdropdownpage, 10);
    }
    
    public void Genderoption()
    {
    	Generic.Click(Genderoptionpage, 10);
    }
    
    public void Statedropdown()
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView(true);", Statedropdownpage);
        js.executeScript("arguments[0].click();", Statedropdownpage);
    }
    
    public void Stateoptionpage()
    {
    	Generic.Click(Stateoptionpage, 10);
    }
    
    public void Citydropdown()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(Citydropdownpage));
    	Generic.Click(Citydropdownpage, 10);
    }
    
    
    public void Cityoption()
    {
    	Generic.Click(Cityoptionpage, 10);
    }
    
    public void Languagedropdown()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(Languagedropdownpage));
    	Generic.Click(Languagedropdownpage, 10);
    }
    
    public void Language_option()
    {
    	Generic.Click(Language_option_page, 10);
    }
    
    public void Language_Proficiancy()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(Language_Proficiancy_page));
    	Language_Proficiancy_page.click();
    }
    
    public void Savebutton()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(Savebutton_page));
    	Savebutton_page.click();
    }  
    
    public void Add_Education_button()
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", Add_Education_button_page);
        js.executeScript("arguments[0].click();", Add_Education_button_page);
    }
    
    public void Institution_dropdown()
    {
    	Generic.Click(Institution_dropdown_page, 10);
    }
    
    public void Institution_option()
    {
    	Generic.Click(Institution_option_page, 10);
    }
    
    public void State_dropdown()
    {
    	Generic.Click(State_dropdown_page, 10);
    }
    
    public void State_option()
    {
    	Generic.Click(State_option_page, 10);
    }
    
    public void City_dropdown()
    {
    	Generic.Click(City_dropdown_page, 10);
    }
    
    public void City_option()
    {
    	Generic.Click(City_option_page, 10);
    }
    
    public void Course_dropdown()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(Course_dropdown_page));
    	Generic.Click(Course_dropdown_page, 10);
    }
    
    public void Course_option()
    {
    	Generic.Click(Course_option_page, 10);
    }
    
    public void Department_dropdown()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(Department_dropdown_page));
    	Generic.Click(Department_dropdown_page, 10);
    }
    
    public void Department_option()
    {
    	Generic.Click(Department_option_page, 10);
    }
    
    public void From_month_Dropdown()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(From_month_Dropdown_page));
    	Generic.Click(From_month_Dropdown_page, 10);
    }
    
    public void From_month_option()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(From_month_option_page));
    	Generic.Click(From_month_option_page, 10);
    }
    
    public void From_year_Dropdown()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(From_year_Dropdown_page));
    	Generic.Click(From_year_Dropdown_page, 10);
    }
    
    public void From_year_option()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(From_year_option_page));
    	Generic.Click(From_year_option_page, 10);
    }
    
    public void To_month_Dropdown()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(To_month_Dropdown_page));
    	Generic.Click(To_month_Dropdown_page, 10);
    }
    
    public void To_month_option()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(To_month_option_page));
    	Generic.Click(To_month_option_page, 10);
    }
    
    public void To_year_Dropdown()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(To_year_Dropdown_page));
    	Generic.Click(To_year_Dropdown_page, 10);
    }
    
    public void To_year_option()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(To_year_option_page));
    	Generic.Click(To_year_option_page, 10);
    }
    
    public void Course_type()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(Course_type_page));
    	Generic.Click(Course_type_page, 20);
    }
    
    public void Mark(String sent)
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(Mark_page));
    	Generic.sendkeys(Mark_page,sent, 30);
    }
    
    public void Save_button_Education()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(Save_button_Education_page));
    	Save_button_Education_page.click();
    }
    
    public void Addskill_button()
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",Addskill_button_page );
        js.executeScript("arguments[0].click();", Addskill_button_page);
     }
    
    public void Skills_Communicationrating()
    {
    	Generic.Click(Skills_Communicationrating_page, 10);
    }
    
    public void Skills_criticalthink()
    {
    	Generic.Click(Skills_criticalthink_page, 10);
    }
    
    public void Skills_personality()
    {
    	Generic.Click(Skills_personality_page, 10);
    }
    
    public void Skills_primaryskill_dropdown()
    {
    	Generic.Click(Skills_primaryskill_dropdown_page, 10);
    }
    
    public void Skills_primaryskill_option()
    {
    	Generic.Click(Skills_primaryskill_option_page, 10);
    }
    
    public void Skills_primaryrating()
    {
    	Generic.Click(Skills_primaryrating_page, 10);
    }
    
    public void Skills_secondaryskill_dropdown()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(Skills_secondaryskill_dropdown_page));
    	Generic.Click(Skills_secondaryskill_dropdown_page, 10);
    }
    
    public void Skills_secondaryskill_option()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(Skills_secondaryskill_option_page));
    	Generic.Click(Skills_secondaryskill_option_page, 10);
    }
    
    public void Skills_secondaryrating()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(Skills_secondaryrating_page));
    	Generic.Click(Skills_secondaryrating_page, 10);
    }
    
    public void Skills_otherskilldropdown()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(Skills_otherskilldropdown_page));
    	Generic.Click(Skills_otherskilldropdown_page, 10);
    }
    
    public void Skills_otherskilloption()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(Skills_otherskilloption_page));
    	Generic.Click(Skills_otherskilloption_page, 30);
    }
    
    public void Skills_savebutton()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(Skills_savebutton_page));
    	Generic.Click(Skills_savebutton_page, 10);
    }   
    
    public void AddcareerInfo_button()
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",AddcareerInfo_button_page );
        js.executeScript("arguments[0].click();", AddcareerInfo_button_page);
    }
    
    public void CareerInfo_Availabilitydropdown()
    {
    	Generic.Click(CareerInfo_Availabilitydropdown_page, 10);
    }
    
    public void CareerInfo_Availabilityoption()
    {
    	Generic.Click(CareerInfo_Availabilityoption_page, 10);
    }
    
    public void CareerInfo_loactiondropdown()
    {
    	Generic.Click(CareerInfo_loactiondropdown_page, 10);
    }
    
    public void CareerInfo_loactionoption()
    {
    	Generic.Click(CareerInfo_loactionoption_page, 10);
    }
    
    public void CareerInfo_sal(String sent)
    {
    	Generic.sendkeys(CareerInfo_sal_page, sent, 10);
    }
    
    public void CareerInfo_savebutton()
    {
    	Generic.Click(CareerInfo_savebutton_page, 10);
    }
}

