package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	@FindBy(xpath = "//*[@type='checkbox']")
	WebElement Experience_checkbox_page;
	
	@FindBy(xpath = "//*[@placeholder='Type here']")
	WebElement Experience_desc_page;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement Experience_savebutton_page;
	
	
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
}
