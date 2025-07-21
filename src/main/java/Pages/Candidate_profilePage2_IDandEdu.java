package Pages;

import java.util.List; 
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utills.Generic;

public class Candidate_profilePage2_IDandEdu extends Generic
{
	WebDriver driver;
	
	@FindBy(xpath = "//button[normalize-space()='Add Identification']") WebElement Add_Identificationbutton_page;
	
	@FindBy(xpath = "//div[@aria-labelledby = 'birth-year']") WebElement yearofbirthdropdownpage;
	
	@FindBy(xpath = "//li[normalize-space()='1997']") WebElement yearofbirthoptionpage;
	
	@FindBy(xpath = "(//div[contains(@class , 'MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary')])[6]") WebElement Genderdropdownpage;			
	
	@FindBy(xpath = "//*[@class = 'MuiList-root MuiList-padding MuiMenu-list css-ubifyk']/li") List<WebElement> Genderoptionpage;
	
	@FindBy(xpath = "//button[@class = 'MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium MuiAutocomplete-popupIndicator css-amwtx2']") WebElement Statedropdownpage;
	
	@FindBy(xpath = "//ul[@class = 'MuiAutocomplete-listbox css-lth87l']/li") List<WebElement> Stateoptionpage;
	
	@FindBy(xpath = "(//button[@class ='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium MuiAutocomplete-popupIndicator css-amwtx2' ])[2]") WebElement Citydropdownpage;
	
	@FindBy(xpath = "//ul[@role = 'listbox']/li") List<WebElement> Cityoptionpage;
	
	@FindBy(xpath = "(//*[contains(@id, ':r')])[9]") WebElement Languagedropdownpage;
	
	@FindBy(xpath = "//*[contains(@id, 'listbox')]/li") List<WebElement> Language_option_page;
	
	@FindBy(xpath = "//label[1]//span[1]//input[1]") WebElement Language_Proficiancy_page;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")	WebElement Savebutton_page;
	
	@FindBy(xpath = "(//*[@class='MuiChip-label MuiChip-labelSmall css-b9zgoq'])[1]")	WebElement Identification_Percentagecompletion_page;
	
	@FindBy(xpath = "//button[normalize-space()='Add Education']")	WebElement Add_Education_button_page ;
	
	@FindBy(xpath = "//div[@role='presentation']//div[1]//div[1]//div[1]//div[1]//div[1]//button[1]//*[name()='svg']")	WebElement Institution_dropdown_page;
	
	@FindBy(xpath = "//*[@role = 'listbox']/li") List<WebElement> Institution_option_page ;
	
	@FindBy(xpath = "//div[@class='MuiBox-root css-dur6e7']//div[3]//div[1]//div[1]//div[1]//div[1]//button[1]//*[name()='svg']")	WebElement State_dropdown_page;
	
	@FindBy(xpath = "//*[@class= 'MuiAutocomplete-listbox css-lth87l']/li")	List<WebElement> State_option_page;
	
	@FindBy(xpath = "//div[4]//div[1]//div[1]//div[1]//div[1]//button[1]//*[name()='svg']")	WebElement City_dropdown_page;
	
	@FindBy(xpath = "//ul[@role = 'listbox']/li")	List<WebElement> City_option_page;
	
	@FindBy(xpath = "(//div[@class='MuiAutocomplete-endAdornment css-iuka1o'])[4]") WebElement Course_dropdown_page;
	
	@FindBy(xpath = "//ul[@role = 'listbox']/li")	List<WebElement> Course_option_page;
	
	@FindBy(xpath = "//input[@placeholder = 'Choose your department']")	WebElement Department_dropdown_page;
	
	@FindBy(xpath = "//ul[@role = 'listbox']/li")	List<WebElement> Department_option_page;
	
	@FindBy(xpath = "//div[@class = 'MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-xhuv26' and @aria-labelledby= 'start-month']")	WebElement From_month_Dropdown_page;
	
	@FindBy(xpath = "//li[normalize-space()='May']")	WebElement From_month_option_page;
	
	@FindBy(xpath = "//div[@class = 'MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-xhuv26' and @aria-labelledby= 'start-year']")	WebElement From_year_Dropdown_page;
	
	@FindBy(xpath = "//li[normalize-space()='2014']")	WebElement From_year_option_page;
	
	@FindBy(xpath = "//div[@class = 'MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-xhuv26' and @aria-labelledby= 'end-month']")	WebElement To_month_Dropdown_page;
	
	@FindBy(xpath = "//li[@class = 'MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-5llfx1' and @data-value= 'Apr' ]")	WebElement To_month_option_page;
	
	@FindBy(xpath = "//div[@class = 'MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-xhuv26' and @aria-labelledby= 'end-year']")	WebElement To_year_Dropdown_page;
	
	@FindBy(xpath = "//li[@class = 'MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-5llfx1' and @data-value= '2017' ]")	WebElement To_year_option_page;
	
	@FindBy(xpath = "//input[@value='Part-time']")	WebElement Course_type_page;
	
	@FindBy(xpath = "//input[@placeholder='Type in percentage %']")	WebElement Mark_page;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")	WebElement Save_button_Education_page;
	
	@FindBy(xpath = "(//*[@class='MuiChip-label MuiChip-labelSmall css-b9zgoq'])[1]")	WebElement Education_Percentagecompletion_page;
	
	@FindBy(xpath = "(//div[@class = 'cursor-pointer'])[4]")	WebElement Editbutton_page;
	
	@FindBy(xpath = "(//span[@class = 'MuiButton-icon MuiButton-endIcon MuiButton-iconSizeMedium css-1g78ho2'])[1]")	WebElement Addmore_Edu_button_page;
	
	@FindBy(xpath = "(//button[@class = 'MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-mfslm7'])[3]")	WebElement Delete_Edu_button_page;
	
	//Constructor
    public Candidate_profilePage2_IDandEdu(WebDriver driver)
   {
    	this.driver = driver;
	    PageFactory.initElements(driver, this);
   }

   //Action CLass
    public void Add_Identificationbutton()  {
   	   JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView(true);", Add_Identificationbutton_page);
       js.executeScript("arguments[0].click();", Add_Identificationbutton_page);
    }

   public void yearofbirthdropdown()  {
   	Generic.Click(yearofbirthdropdownpage, 10);
   }

   public void yearofbirth() {
	   JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView(true);", yearofbirthoptionpage);
       js.executeScript("arguments[0].click();", yearofbirthoptionpage);
     }
  
   public void Genderdropdown(){
   	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
   	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(Genderdropdownpage));
   	Generic.Click(Genderdropdownpage, 30);
   }

   public void Genderoption(String Gender){
	   for (WebElement option : Genderoptionpage) 
	   	{ 
	   		 if (option.getText().equalsIgnoreCase(Gender))
	            {
	   		 	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	   		   	    WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(option));
	   		    	Generic.Click(option, 30);
	                break;
	            } 	 
	    }
   }

   public void Statedropdown() {
   	JavascriptExecutor js = (JavascriptExecutor) driver;
   	js.executeScript("arguments[0].scrollIntoView(true);", Statedropdownpage);
    js.executeScript("arguments[0].click();", Statedropdownpage);
   }

   public void Stateoptionpage(String State) {
	   for (WebElement option : Stateoptionpage) 
	   	{ 
	   		 if (option.getText().equalsIgnoreCase(State))
	            {
	   		 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	   		   	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(option));
	   		   	Generic.Click(option, 30);
	             break;
	            } 	 
	        }
   }

   public void Citydropdown()  {
   	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
   	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(Citydropdownpage));
   	Generic.Click(Citydropdownpage, 30);
   }


   public void Cityoption(String City)   {
	   for (WebElement option : Cityoptionpage) 
	   	{ 
	   		 if (option.getText().equalsIgnoreCase(City))
	            {
	   			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	   		   	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(option));
	   		   	Generic.Click(option, 30);
	            break;
	            } 	 
	        }
   }

   public void Languagedropdown()   {
   	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
   	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(Languagedropdownpage));
   	Generic.Click(Languagedropdownpage, 10);
   }

   public void Language_option(String Language)   {
	   for (WebElement option : Language_option_page) 
	   	{ 
	   		 if (option.getText().equalsIgnoreCase(Language))
	            {
	           	 JavascriptExecutor js = (JavascriptExecutor) driver;
	           	 js.executeScript("arguments[0].click();", option);
	            } 	 
	        }
   }
     
   public void Language_Proficiancy()  {
	   JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView(true);", Language_Proficiancy_page);
       js.executeScript("arguments[0].click();", Language_Proficiancy_page);
   }

   public void Savebutton()   {
   	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
   	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(Savebutton_page));
    Generic.Click(Savebutton_page, 40);
   }  

   public void Add_Education_button()   {
   	   JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView(true);", Add_Education_button_page);
       js.executeScript("arguments[0].click();", Add_Education_button_page);
   }

   public void Institution_dropdown()  {
   	Generic.Click(Institution_dropdown_page, 10);
   }

   public void Institution_option(String Institute)  {
	   for (WebElement option : Institution_option_page) 
	   	{ 
	   		 if (option.getText().equalsIgnoreCase(Institute))
	            {
	   			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	   		   	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(option));
	   		   	Generic.Click(option, 30);
	            break;
	            } 	 
	        }
   }

   public void State_dropdown()  {
   	Generic.Click(State_dropdown_page, 10);
   }

   public void State_option(String State)  {
	   for (WebElement option : State_option_page) 
	   	{ 
	   		 if (option.getText().equalsIgnoreCase(State))
	            {
	   			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	   		   	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(option));
	   		   	Generic.Click(option, 30);
	            break;
	            } 	 
	        }
	   //Generic.Click(State_option_page, 10);
   }

   public void City_dropdown()  {
   	Generic.Click(City_dropdown_page, 10);
   }

   public void City_option(String City)   {
	   for (WebElement option : City_option_page) 
	   	{ 
	   		 if (option.getText().equalsIgnoreCase(City))
	            {
	   			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	   		   	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(option));
	   		   	Generic.Click(option, 30);
	            break;
	            } 	 
	        }
	   //Generic.Click(City_option_page, 10);
   }

   public void Course_dropdown()  {
   	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(Course_dropdown_page));
   	Generic.Click(Course_dropdown_page, 10);
   }

   public void Course_option(String Course)  {
	   for (WebElement option : Course_option_page) 
	   	{ 
	   		 if (option.getText().equalsIgnoreCase(Course))
	            {
	   			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	   		   	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(option));
	   		   	Generic.Click(option, 30);
	            break;
	            } 	 
	        }
   }

   public void Department_dropdown()   {
   	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(Department_dropdown_page));
   	Generic.Click(Department_dropdown_page, 10);
   }

   public void Department_option(String Department)   {
	   for (WebElement option : Department_option_page) 
	   	{ 
	   		 if (option.getText().equalsIgnoreCase(Department))
	            {
	   			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	   		   	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(option));
	   		   	Generic.Click(option, 30);
	            break;
	            } 	 
	        }
   }

   public void From_month_Dropdown()   {
   	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(From_month_Dropdown_page));
   	Generic.Click(From_month_Dropdown_page, 10);
   }

   public void From_month_option()  {
	 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(From_month_option_page));
	   	Generic.Click(From_month_option_page, 10);
   }

   public void From_year_Dropdown()  {
   	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   	wait.until(ExpectedConditions.elementToBeClickable(From_year_Dropdown_page));
   	Generic.Click(From_year_Dropdown_page, 10);
   }

   public void From_year_option() {
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	   	wait.until(ExpectedConditions.elementToBeClickable(From_year_option_page));
	   	Generic.Click(From_year_option_page, 30);
   }

   public void To_month_Dropdown()  {
   	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   	wait.until(ExpectedConditions.elementToBeClickable(To_month_Dropdown_page));
   	Generic.Click(To_month_Dropdown_page, 10);
   }

   public void To_month_option()  {
   	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   	wait.until(ExpectedConditions.elementToBeClickable(To_month_option_page));
   	Generic.Click(To_month_option_page, 10);
   }

   public void To_year_Dropdown()  {
   	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(To_year_Dropdown_page));
   	Generic.Click(To_year_Dropdown_page, 10);
   }

   public void To_year_option()  {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   	wait.until(ExpectedConditions.elementToBeClickable(To_year_option_page));
   	Generic.Click(To_year_option_page, 10);
   }

   public void Course_type()  {
   	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait.until(ExpectedConditions.elementToBeClickable(Course_type_page));
   	Generic.Click(Course_type_page, 20);
   }

   public void Mark(String Mark)  {
	   Mark_page.sendKeys(Mark);
	   //Mark_page.sendKeys(Keys.ENTER);
   }

   public void Save_button_Education()  {
   	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait.until(ExpectedConditions.elementToBeClickable(Save_button_Education_page));
   	Save_button_Education_page.click();
   }

   public void Editbutton()  {
   	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
     wait.until(ExpectedConditions.elementToBeClickable(Editbutton_page));
   	Editbutton_page.click();
   }

   public void Addmore_Edu_button()  {
   	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.elementToBeClickable(Addmore_Edu_button_page));
   	Addmore_Edu_button_page.click();
   }

   public void Delete_Edu_button()  {
   	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
   	wait.until(ExpectedConditions.elementToBeClickable(Delete_Edu_button_page));
   	Delete_Edu_button_page.click();
   }

   public String Identification_Percentagecompletion()  {
   	 return Identification_Percentagecompletion_page.getText();
   }

   public String Education_Percentagecompletion() {
   	 return Education_Percentagecompletion_page.getText();
   }
}
