package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utills.Generic;

public class Candidate_ProfilePage3_SkillandCarrear extends Generic

{
	WebDriver driver;
	
	@FindBy(xpath = "//button[normalize-space()='Add Skills']")
	WebElement Addskill_button_page;
	
	@FindBy(xpath = "//div[@class='MuiCardContent-root css-15q2cw4']//div[@class='MuiBox-root css-axw7ok']//div[@class='cursor-pointer']//*[name()='svg']")
	WebElement Editskill_button_page;
	
	@FindBy(xpath = "//div[@class='MuiStack-root css-1jdgafz']//div[1]//div[1]//div[1]//button[5]")
	WebElement Skills_Communicationrating_page;
	
	@FindBy(xpath = "//div[@class='MuiStack-root css-1jdgafz']//div[2]//div[1]//div[1]//button[5]")
	WebElement Skills_criticalthink_page;
	
	@FindBy(xpath = "//div[@class='MuiStack-root css-1jdgafz']//div[3]//div[1]//div[1]//button[4]")
	WebElement Skills_personality_page;
	
	@FindBy(xpath = "//input[@placeholder='Type your one Primary skill & self rate']")
	WebElement Skills_primaryskill_dropdown_page;
	
	@FindBy(xpath = "//*[@class= 'MuiAutocomplete-listbox css-lth87l']/li")
	List<WebElement> Skills_primaryskill_option_page;
	
	@FindBy(xpath = "//input[@placeholder='Type your one secondary skill & self rate']")
	WebElement Skills_secondaryskill_dropdown_page;
	
	@FindBy(xpath = "//*[@class= 'MuiAutocomplete-listbox css-lth87l']/li")
	List<WebElement> Skills_secondaryskill_option1_page;
	
	@FindBy(xpath = "//li[text() = 'Java']")
	WebElement Skills_secondaryskill_option2_page;
	
	@FindBy(xpath = "(//p[contains(@class , 'MuiFormHelperText-root Mui-error MuiFormHelperText-sizeSmall MuiFormHelperText-contained')])[2]")
	WebElement Skill_warning_message_page;
	
	@FindBy(xpath = "//div[5]//div[2]//div[1]//div[1]//div[1]//div[1]//button[5]")
	WebElement Skills_primaryrating_page;
	
	@FindBy(xpath = "//div[6]//div[2]//div[1]//div[1]//div[1]//div[1]//button[5]")
	WebElement Skills_secondaryrating_page;
	
	@FindBy(xpath = "//input[@placeholder='Type your other skills']")
	WebElement Skills_otherskilldropdown_page;
	
	@FindBy(xpath = "//*[@class= 'MuiAutocomplete-listbox css-lth87l']/li")
	List<WebElement> Skills_otherskilloption_page;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement Skills_savebutton_page;
	
	@FindBy(xpath = "(//*[@class='MuiChip-label MuiChip-labelSmall css-b9zgoq'])[1]")
	WebElement Skill_Percentagecompletion_page;
	
	@FindBy(xpath = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root css-bglhl2']//div[@class='MuiBox-root css-0']//div[@class='MuiCardContent-root css-15q2cw4']//div[@class='cursor-pointer']//*[name()='svg']")
	WebElement Skill_Editbutton_page;
	
	@FindBy(xpath = "//button[normalize-space()='Add Career Info']")
	WebElement AddcareerInfo_button_page;
	
	@FindBy(xpath = "//input[@id='availability']")
	WebElement CareerInfo_Availabilitydropdown_page;
	
	@FindBy(xpath = "//*[@class= 'MuiAutocomplete-listbox css-lth87l']/li")
	List<WebElement> CareerInfo_Availabilityoption_page1;
	
	@FindBy(xpath = "//li[@id='availability-option-1']")
	WebElement CareerInfo_Availabilityoption_page2;
	
	@FindBy(xpath = "//input[@id='preferred-locations']")
	WebElement CareerInfo_loactiondropdown_page;
	
	@FindBy(xpath = "//*[@aria-labelledby= 'preferred-locations-label']/li")
	List<WebElement> CareerInfo_loactionoption_page;
	
	@FindBy(xpath = "//input[@placeholder='EX: 2,50,000']")
	WebElement CareerInfo_sal_page;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement CareerInfo_savebutton_page;
	
	@FindBy(xpath = "//body/div[@id='root']/div[@class='MuiBox-root css-0']/div[@class='MuiContainer-root MuiContainer-maxWidthXl css-1cmizrj']/div[@class='MuiBox-root css-11u4k1p']/div[@class='MuiBox-root css-1hz0jbq']/div[@class='MuiBox-root css-ovclti']/div[@class='MuiBox-root css-0']/div[@class='MuiBox-root css-10egq61']/div[@class='MuiBox-root css-6p6ziu']/div[@class='MuiStack-root css-10zbyz5']/div[5]/div[1]/div[1]/div[1]/div[1]//*[name()='svg']")
	WebElement CareerInfo_edit_page;
	
	@FindBy(xpath = "(//*[@class='MuiChip-label MuiChip-labelSmall css-b9zgoq'])[1]")
	WebElement CareerInfo_Percentagecompletion_page;
	
	//Constructor
    public Candidate_ProfilePage3_SkillandCarrear(WebDriver driver)
   {
    	this.driver = driver;
	    PageFactory.initElements(driver, this);
   }
    
    //Action class
    public void Addskill_button()
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",Addskill_button_page );
        js.executeScript("arguments[0].click();", Addskill_button_page);
     }

    public void Editskill_button()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.elementToBeClickable(Editskill_button_page));
    	Editskill_button_page.click();
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

    public void Skills_primaryskill_option(String PrimarySkill)
    {
    	for (WebElement option : Skills_primaryskill_option_page) 
	   	{ 
	   		 if (option.getText().equalsIgnoreCase(PrimarySkill))
	            {
	   		 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	   		   	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(option));
	   		   	Generic.Click(option, 30);
	             break;
	            } 	 
	        }
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

    public void Skills_secondaryskill_option1(String SecondarySkill){
    	for (WebElement option : Skills_secondaryskill_option1_page) 
	   	{ 
	   		 if (option.getText().equalsIgnoreCase(SecondarySkill))
	            {
	   		 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	   		   	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(option));
	   		   	Generic.Click(option, 30);
	             break;
	            } 	 
	        }
    	}
    
    public String Skill_warning_message()
    {
    	return Skill_warning_message_page.getText();
    }

    public void Skills_secondaryskill_option2()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(Skills_secondaryskill_option2_page));
    	Generic.Click(Skills_secondaryskill_option2_page, 20);
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

    public void Skills_otherskilloption(String Otherskills)
    {
    	for (WebElement option : Skills_otherskilloption_page) 
	   	{ 
	   		 if (option.getText().equalsIgnoreCase(Otherskills))
	            {
	   		 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	   		   	WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(option));
	   		   	Generic.Click(option, 30);
	             break;
	            } 	 
	        }
    }

    public void Skills_savebutton()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(Skills_savebutton_page));
    	Generic.Click(Skills_savebutton_page, 10);
    }   

    public boolean Skills_savebutton_Disabled()
    {
    	return Skills_savebutton_page.isEnabled();
    }   

    public void Skill_Editbutton()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(Skill_Editbutton_page));
    	Generic.Click(Skill_Editbutton_page, 20);

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

    public void CareerInfo_Availabilityoption1(String Availability) {
    	for (WebElement option : CareerInfo_Availabilityoption_page1)
    	{
    		if(option.getText().equalsIgnoreCase(Availability)) {
    			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    			wait.until(ExpectedConditions.elementToBeClickable(option));
    			Generic.Click(option, 30);
    			break;
    		}
    	}
    }

    public void CareerInfo_Availabilityoption2()
    {
    	Generic.Click(CareerInfo_Availabilityoption_page2, 10);
    }

    public void CareerInfo_loactiondropdown()
    {
    	Generic.Click(CareerInfo_loactiondropdown_page, 10);
    }

    public void CareerInfo_loactionoption(String location)  {
    	for (WebElement option : CareerInfo_loactionoption_page)
    	{
    		if(option.getText().equalsIgnoreCase(location)) {
    			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    			wait.until(ExpectedConditions.elementToBeClickable(option));
    			Generic.Click(option, 30);
    			break;
    		}
    	}
    }

    public void CareerInfo_sal(String Sal)
    {
    	CareerInfo_sal_page.sendKeys(Sal);
    	CareerInfo_sal_page.sendKeys(Keys.ENTER);
    }

    public void CareerInfo_savebutton()
    {
    	Generic.Click(CareerInfo_savebutton_page, 10);
    }

    public void CareerInfo_edit_page()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(CareerInfo_edit_page));
    	Generic.Click(CareerInfo_edit_page, 10);
    }

    public String CareerInfo_Percentagecompletion()
    {
    	 return CareerInfo_Percentagecompletion_page.getText();
    }
    
    public String Skill_Percentagecompletion()
    {
    	 return Skill_Percentagecompletion_page.getText();
    }
    
}
