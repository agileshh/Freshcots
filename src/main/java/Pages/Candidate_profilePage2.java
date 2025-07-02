package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utills.Generic;

public class Candidate_profilePage2 extends Generic
{
	WebDriver driver;
	
	//Annotations
	@FindBy(xpath = "//button[normalize-space()='Add Experience']")
	WebElement Add_Experiencebutton_page;
	
	@FindBy(xpath = "//input[@placeholder='Type your role ex: frontend developer']")
	WebElement Experience_Designation_page;
	
	@FindBy(xpath = "//*[@aria-labelledby='employment-type']")
	WebElement Experience_Employmentdropdown_page;
	
	@FindBy(xpath = "//li[normalize-space()='Full-time']")
	WebElement Experience_Employmentoption_page;
	
	@FindBy(xpath = "//*[@placeholder='Please type the company name']")
	WebElement Experience_Company_page;
	
	@FindBy(xpath = "//*[@aria-labelledby='industry-type']")
	WebElement Experience_Industrytypedd_page;
	
	@FindBy(xpath = "//li[normalize-space()='Engineering and Technology']")
	WebElement Experience_Industytypeoption_page;
	
	@FindBy(xpath = "//*[@aria-labelledby='country']")
	WebElement Experience_countrydd_page;
	
	@FindBy(xpath = "//li[normalize-space()='India']")
	WebElement Experience_countryoption_page;
	
	@FindBy(xpath = "//*[@aria-labelledby='state']")
	WebElement Experience_statedd_page;
	
	@FindBy(xpath = "//li[normalize-space()='Andhra Pradesh']")
	WebElement Experience_stateoption_page;
	
	@FindBy(xpath = "//*[@aria-labelledby='city']")
	WebElement Experience_citydd_page;
	
	@FindBy(xpath = "//li[normalize-space()='Chirala']")
	WebElement Experience_cityoption_page;
	
	@FindBy(xpath = "//*[@aria-labelledby='work-mode']")
	WebElement Experience_workmodedd_page;
	
	@FindBy(xpath = "//li[normalize-space()='On-Site']")
	WebElement Experience_workmodeoption_page;
	
	@FindBy(xpath = "(//*[@aria-labelledby='start-project-month'])[1]")
	WebElement From_month_Dropdown_page;
	
	@FindBy(xpath = "//li[@class = 'MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-5llfx1' and @data-value= 'Jun' ]")
	WebElement From_month_option_page;
	
	@FindBy(xpath = "(//*[@aria-labelledby='start-project-year'])[1]")
	WebElement From_year_Dropdown_page;
	
	@FindBy(xpath = "//li[@class = 'MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-5llfx1' and @data-value= '2014' ]")
	WebElement From_year_option_page;
	
	@FindBy(xpath = "//span[@class='MuiButtonBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium PrivateSwitchBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium css-1o9oo5y']")
	WebElement Experience_checkbox_page;
	
	@FindBy(xpath = "//*[@placeholder='Type here']")
	WebElement Experience_desc_page;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement Experience_savebutton_page;
	
	@FindBy(xpath = "//button[normalize-space()='Add Projects']")
	WebElement Add_Projectbutton_page;
	
	@FindBy(xpath = "//*[@placeholder = 'Type the name of your project']")
	WebElement Project_Projectname_page;
	
	@FindBy(xpath = "//*[@placeholder = 'Paste your project link']//*[@placeholder = 'Paste your project link']")
	WebElement Project_Projectlink_page;
	
	@FindBy(xpath = "(//input[contains(@id,':r')])[3]")
	WebElement Project_Tech_page;
	
	@FindBy(xpath = "(//*[@aria-labelledby='start-project-month'])[1]")
	WebElement Pro_From_month_Dropdown_page;
	
	@FindBy(xpath = "//li[@class = 'MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-5llfx1' and @data-value= 'Jun' ]")
	WebElement Pro_From_month_option_page;
	
	@FindBy(xpath = "(//*[@aria-labelledby='start-project-year'])[1]")
	WebElement Pro_From_year_Dropdown_page;
	
	@FindBy(xpath = "//li[@class = 'MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-5llfx1' and @data-value= '2016' ]")
	WebElement Pro_From_year_option_page;
	
	@FindBy(xpath = "(//*[@aria-labelledby='start-project-month'])[2]")
	WebElement Pro_To_month_Dropdown_page;
	
	@FindBy(xpath = "//li[@class = 'MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-5llfx1' and @data-value= 'Aug' ]")
	WebElement Pro_To_month_option_page;
	
	@FindBy(xpath = "(//*[@aria-labelledby='start-project-year'])[2]")
	WebElement Pro_To_year_dropdown_page;
	
	@FindBy(xpath = "//li[@class = 'MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-5llfx1' and @data-value= '2017' ]")
	WebElement Pro_To_year_option_page;
	
	@FindBy(xpath = "//textarea[contains(@id,':r')]")
	WebElement Project_Description_page;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement Project_save_page;
	
	@FindBy(xpath = "//button[normalize-space()='Add Certifications']")
	WebElement Add_Certification_button_page;
	
	@FindBy(xpath = "(//input[contains(@id,':r')])[1]")
	WebElement Certification_name_page;
	
	@FindBy(xpath = "(//input[contains(@id,':r')])[2]")
	WebElement Certification_link_page;
	
	@FindBy(xpath = "(//input[contains(@id,':r')])[3]")
	WebElement Certification_provider_page;
	
	@FindBy(xpath = "(//*[@aria-labelledby='startMonth'])[1]")
	WebElement Cer_from_month_dropdown_page;
	
	@FindBy(xpath = "//li[@class = 'MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-5llfx1' and @data-value= 'Jun' ]")
	WebElement Cer_from_month_option_page;
	
	@FindBy(xpath = "(//*[@aria-labelledby='startYear'])[1]")
	WebElement Cer_from_year_dropdown_page;
	
	@FindBy(xpath = "//li[@class = 'MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-5llfx1' and @data-value= '2016' ]")
	WebElement Cer_from_year_option_page;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement Cer_checkbox_page;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement Cer_savebutton_page;
	
	@FindBy(xpath = "//button[normalize-space()='Click Here']")
	WebElement Clickhere_page;
	
	//Constructor
    public Candidate_profilePage2(WebDriver driver)
   {
    	this.driver = driver;
	    PageFactory.initElements(driver, this);
   }
    
    //Action class
    public void Add_Experiencebutton()
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", Add_Experiencebutton_page);
        js.executeScript("arguments[0].click();", Add_Experiencebutton_page);
    }
    
    public void Experience_Designation(String sent)
    {
    	Generic.sendkeys(Experience_Designation_page, sent, 0);
    }	
    
    public void Experience_Employmentdropdown_page()
    {
    	Generic.Click(Experience_Employmentdropdown_page, 0);
    }	
    
    public void Experience_Employmentoption()
    {
    	Generic.Click(Experience_Employmentoption_page, 0);
    }	
    
    public void Experience_Company(String sent)
    {
    	Generic.sendkeys(Experience_Company_page,sent, 10);
    }	
    
    public void Experience_Industrytypedd()
    {
    	Generic.Click(Experience_Industrytypedd_page, 0);
    }	
    
    public void Experience_Industytypeoption()
    {
    	Generic.Click(Experience_Industytypeoption_page, 0);
    }	
    
    public void Experience_countrydd()
    {
    	Generic.Click(Experience_countrydd_page, 0);
    }	
    
    public void Experience_countryoption()
    {
    	Generic.Click(Experience_countryoption_page, 0);
    }	
    
    public void Experience_statedd()
    {
    	Generic.Click(Experience_statedd_page, 0);
    }	
    
    public void Experience_stateoption()
    {
    	Generic.Click(Experience_stateoption_page, 0);
    }	
    
    public void Experience_citydd()
    {
    	Generic.Click(Experience_citydd_page, 0);
    }	
    
    public void Experience_cityoption()
    {
    	Generic.Click(Experience_cityoption_page, 0);
    }
    
    public void Experience_workmodedd()
    {
    	Generic.Click(Experience_workmodedd_page, 0);
    }
    
    public void Experience_workmodeoption()
    {
    	Generic.Click(Experience_workmodeoption_page, 0);
    }
    
    public void From_month_Dropdown()
    {
    	Generic.Click(From_month_Dropdown_page, 0);
    }
    
    public void From_month_option()
    {
    	Generic.Click(From_month_option_page, 0);
    }
    
    public void From_year_Dropdown()
    {
    	Generic.Click(From_year_Dropdown_page, 0);
    }
    
    public void From_year_option()
    {
    	Generic.Click(From_year_option_page, 0);
    }
    
    public void Experience_checkbox()
    {
    	Generic.Click(Experience_checkbox_page, 0);
    }
    
    public void Experience_desc(String sent)
    {
    	Generic.sendkeys(Experience_desc_page,sent, 0);
    }
    
    public void Experience_savebutton()
    {
    	Generic.Click(Experience_savebutton_page, 0);
    } 
    
    public void Add_Projectbutton()
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", Add_Projectbutton_page);
        js.executeScript("arguments[0].click();", Add_Projectbutton_page);
    }
    
    public void Project_Projectname(String sent)
    {
    	Generic.sendkeys(Project_Projectname_page, sent, 0);
    }
    
    public void Project_Projectlink(String sent)
    {
    	Generic.sendkeys(Project_Projectlink_page, sent, 0);
    }
    
    public void Project_Tech(String sent)
    {
    	Generic.sendkeys(Project_Tech_page, sent, 0);
    }
    
    public void Pro_From_month_Dropdown()
    {
    	Generic.Click(Pro_From_month_Dropdown_page, 0);
    }
    
    public void Pro_From_month_option()
    {
    	Generic.Click(Pro_From_month_option_page, 0);
    }
    
    public void Pro_From_year_Dropdown()
    {
    	Generic.Click(Pro_From_year_Dropdown_page, 0);
    }
    
    public void Pro_From_year_option()
    {
    	Generic.Click(Pro_From_year_option_page, 0);
    }
    
    public void Pro_To_month_Dropdown()
    {
    	Generic.Click(Pro_To_month_Dropdown_page, 0);
    }
    
    public void Pro_To_month_option()
    {
    	Generic.Click(Pro_To_month_option_page, 0);
    }
    
    public void Pro_To_year_dropdown()
    {
    	Generic.Click(Pro_To_year_dropdown_page, 0);
    }
    
    public void Pro_To_year_option()
    {
    	Generic.Click(Pro_To_year_option_page, 0);
    }
    
    public void Project_Description(String Sent)
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.elementToBeClickable(Project_Description_page));
    	Generic.sendkeys(Project_Description_page, Sent, 10); 	
    }
    
    public void Project_save()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.elementToBeClickable(Project_save_page));
    	Project_save_page.click();  	
    }
    
    public void Add_Certification_button()
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", Add_Certification_button_page);
        js.executeScript("arguments[0].click();", Add_Certification_button_page);
    }
    
    public void Certification_name(String Sent)
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.elementToBeClickable(Certification_name_page));
    	Generic.sendkeys(Certification_name_page, Sent, 10); 	
    }
    
    public void Certification_link(String Sent)
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.elementToBeClickable(Certification_link_page));
    	Generic.sendkeys(Certification_link_page, Sent, 10); 	
    }
    
    public void Certification_provider(String Sent)
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.elementToBeClickable(Certification_provider_page));
    	Generic.sendkeys(Certification_provider_page, Sent, 10); 	
    }
    
    public void Cer_from_month_dropdown()
    {
    	Generic.Click(Cer_from_month_dropdown_page, 0);
    }
    
    public void Cer_from_month_option()
    {
    	Generic.Click(Cer_from_month_option_page, 0);
    }
    
    public void Cer_from_year_dropdown()
    {
    	Generic.Click(Cer_from_year_dropdown_page, 0);
    }
    
    public void Cer_from_year_option()
    {
    	Generic.Click(Cer_from_year_option_page, 0);
    }
    
    public void Cer_checkbox()
    {
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView(true);", Cer_checkbox_page);
       js.executeScript("arguments[0].click();", Cer_checkbox_page);
    }
    
    public void Cer_savebutton()
    {
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView(true);", Cer_savebutton_page);
       js.executeScript("arguments[0].click();", Cer_savebutton_page);
    }
    
    public void Clickhere()
    {
    	Generic.Click(Clickhere_page, 10);
    }
    
}
