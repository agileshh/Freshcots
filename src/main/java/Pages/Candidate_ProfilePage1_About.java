package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utills.Generic;

public class Candidate_ProfilePage1_About extends Generic
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
	WebElement uploaddppage;
	
	@FindBy(xpath = "(//button[@class= 'MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-xz9haa'])[2]")
	WebElement Dp_Cancelpage;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement savepicbuttonpage;
	
	@FindBy(xpath = "(//*[@class='MuiChip-label MuiChip-labelSmall css-b9zgoq'])[1]")
	WebElement dp_Percentagecompletion_page;
	
	@FindBy(xpath = "//button[normalize-space()='Change Photo']")
	WebElement Changephotopage;
	
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
	
	@FindBy(xpath = "//div[@class = 'MuiBox-root css-1ext2y6']")
	WebElement viewvideocanceliconpage;
	
	@FindBy(xpath = "//p[text() = 'Under review']")
	WebElement Underreviewtextpage;
	
	@FindBy(xpath = "//p[text() = 'Approved']")
	WebElement Approvedtextpage;
	
	@FindBy(xpath = "(//*[@class='MuiChip-label MuiChip-labelSmall css-b9zgoq'])[1]")
	WebElement Selfintro_Percentagecompletion_page;
	
	@FindBy(xpath = "//button[normalize-space()='Add Profile Summary']")
	WebElement Addprofile_button_page;
	
	@FindBy(xpath = "//textarea[contains(@id ,':r')]")
	WebElement addprofile_text_area_page;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement addprofile_savebutton_page;
	
	@FindBy(xpath = "(//*[@class='MuiChip-label MuiChip-labelSmall css-b9zgoq'])[1]")
	WebElement profile_Percentagecompletion_page;
	
	@FindBy(xpath = "(//div[@class='cursor-pointer'])[1]")
	WebElement Profile_Edit_Icon_page;
	
	@FindBy(xpath = "//button[@class = 'MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-xz9haa']")
	WebElement Profile_EditCancel_Icon_page;
	
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-GrayBodytext1 css-gil8bc']")
	WebElement Profile_GetText_page;
	
	@FindBy(xpath = "//button[normalize-space()='Add Interest']")
	WebElement add_AreaofIntrestButton_page;
	
	@FindBy(xpath = "//div[@role='combobox']")
	WebElement add_AreaofIntrest_Industrydropdown_page;
	
	@FindBy(xpath = "//li[@role='option']")
	WebElement add_AreaofIntrest_IToption_page;
	
	@FindBy(xpath = "//input[contains(@id,':r')]")
	WebElement SelectDomain_Dropdown_page;
	
	@FindBy(xpath = "//*[@class = 'MuiAutocomplete-listbox css-lth87l']/li")
	List<WebElement> select_option_page;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement add_AreaofIntrest_savebutton_page;
	
	@FindBy(xpath = "//body/div[@id='root']/div[@class='MuiBox-root css-0']/div[@class='MuiContainer-root MuiContainer-maxWidthXl css-1cmizrj']/div[@class='MuiBox-root css-11u4k1p']/div[@class='MuiBox-root css-1hz0jbq']/div[@class='MuiBox-root css-ovclti']/div[@class='MuiBox-root css-0']/div[@class='MuiBox-root css-10egq61']/div[@class='MuiBox-root css-6p6ziu']/div[@class='MuiStack-root css-10zbyz5']/div[@class='MuiBox-root css-0']/div[2]/div[1]/div[1]/div[1]//*[name()='svg']")
	WebElement AreaofIntrest_Editbutton_page;
	
	@FindBy(xpath = "(//*[@class='MuiChip-label MuiChip-labelSmall css-b9zgoq'])[1]")
	WebElement AreaofIntrest_Percentagecompletion_page;
	
	//Constructor
	 public Candidate_ProfilePage1_About(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);  // ✅ This is important
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
    }
    
    public void uploadnewpic(String imagePath)
    {
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
    	 js.executeScript("arguments[0].style.display='block';", uploaddppage);
     	//((JavascriptExecutor) driver).executeScript("arguments[0].click();", uploaddppage);
    	uploaddppage.sendKeys(imagePath);
    }
    
    public void Usecamara()
    {
    	Generic.Click(Clickusecamarapage, 10);
    }
    
    public void Takepic()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.elementToBeClickable(Takepicpage));
    	Generic.Click(Takepicpage, 30);
    }
    
    public void savepicbutton()
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", savepicbuttonpage);
        js.executeScript("arguments[0].click();", savepicbuttonpage);
    }
    
    public void Dp_Cancel()
    {
    	Generic.Click(Dp_Cancelpage, 10);
    }
    
    public void record_selfintro_button()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.elementToBeClickable(recordnowbuttonpage));
    	Generic.Click(recordnowbuttonpage, 30);
    }
    
    public void startrecordbutton()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.elementToBeClickable(startrecordbuttonpage));
    	Generic.Click(startrecordbuttonpage, 30);
    }
    
    public void stoprecordbutton()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.elementToBeClickable(stoprecordbuttonpage));
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
    
    public void viewvideocancelicon() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
     	((JavascriptExecutor) driver).executeScript("arguments[0].click();", viewvideocanceliconpage);
    } 
    
    public boolean Under_reviewtext() {
    	try
    	{
    		return Underreviewtextpage.isDisplayed();
    	}catch (NoSuchElementException e) {
    		return false;
    	}
    }
                                 
    public boolean Approvedtext()
    {
    	try {
            return Approvedtextpage.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    
    public boolean isRetakeButtonDisabled() {
        return !Retakebuttonkebabpage.isEnabled();
    }
    
    public String Under_reviewtext1()
    {
       return Underreviewtextpage.getText();
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
    
    public void addprofile_text_area(String Summary1)
    {
    	addprofile_text_area_page.clear();
    	addprofile_text_area_page.sendKeys(Summary1);
    	addprofile_text_area_page.sendKeys(Keys.ENTER);
    }
    
    public void addprofile_savebutton()
    {
    	Generic.Click(addprofile_savebutton_page, 0);
    }
    
    public boolean Profile_Edit_Icon_Exist()
    {
        try
        {
        	return Profile_Edit_Icon_page.isEnabled();
        }catch(NoSuchElementException e) {
        	return false;
        }
    }
    
    public void Profile_Edit_Icon1()
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", Profile_Edit_Icon_page);
        Generic.Click(Profile_Edit_Icon_page, 10);
    }
    
    public void Profile_EditCancel_Icon()
    {
    	Generic.Click(Profile_EditCancel_Icon_page, 0);
    }

    public String Profile_GetText()
    {
		return Profile_GetText_page.getText();  	
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
    
    public void Select_domain(List<String> valuesToSelect) throws InterruptedException {
    	 for (String value : valuesToSelect)  {
             boolean found = false;
             for (WebElement option : select_option_page)  {
                 if (option.getText().trim().equalsIgnoreCase(value.trim()))  {
                     option.click(); // select the item
                     found = true;
                     Thread.sleep(300); // slight wait between clicks
                     break;
                    
                 }
             }
         }
    }
    
    public void add_AreaofIntrest_savebutton()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.elementToBeClickable(add_AreaofIntrest_savebutton_page));
    	Generic.Click(add_AreaofIntrest_savebutton_page, 20);
    }
    
    public void AreaofIntrest_Editbutton()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.elementToBeClickable(AreaofIntrest_Editbutton_page));
    	Generic.Click(AreaofIntrest_Editbutton_page, 20);
    }
    
    public String dp_Percentagecompletion()
    {
    	 return dp_Percentagecompletion_page.getText();
    }
    
    public String profile_Percentagecompletion()
    {
    	 return profile_Percentagecompletion_page.getText();
    }
    
    public String AreaofIntrest_Percentagecompletion()
    {
    	 return AreaofIntrest_Percentagecompletion_page.getText();
    }

}

