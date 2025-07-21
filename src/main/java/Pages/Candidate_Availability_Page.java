package Pages;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utills.Generic;

public class Candidate_Availability_Page
{
 
	   WebDriver driver;
	   
	   //Annotation
	   @FindBy(xpath = "//button[normalize-space()='Click Here']") WebElement HR_Navigation_Page;
	   
	   @FindBy(xpath = "//span[normalize-space()='Interview']")	   WebElement InterviewDD_Page;
	   
	   @FindBy(xpath = "//span[normalize-space()='HR']")    	   WebElement HR_Tab_Page;
	   
	   @FindBy(xpath = "//span[normalize-space()='Technical']")	   WebElement Tech_Tab_Page;
	   
	   @FindBy(xpath = "//button[normalize-space()='Request Interview']")	   WebElement RequestInterviewbutton_Page;
	   
	   @FindBy(xpath = "//button[normalize-space()='Request Again']")	   WebElement RequestAgainbutton_Page;
	      
	   @FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary Mui-disabled MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1qj2z7j']")	   
	   WebElement Confirmbutton_Page;
	   
	   @FindBy(xpath = "MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary Mui-disabled MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1qj2z7j")	   
	   WebElement Cancelbutton_Page;
	   
	   @FindBy(xpath = "(//td[@class = 'MuiTableCell-root MuiTableCell-body MuiTableCell-alignCenter MuiTableCell-sizeMedium css-1498stf'])[2]")	   WebElement SelctSlot1_Page;
	   
	   @FindBy(xpath = "(//td[@class = 'MuiTableCell-root MuiTableCell-body MuiTableCell-alignCenter MuiTableCell-sizeMedium css-1498stf'])[3]")
	   WebElement SelctSlot2_Page;
	   
	   @FindBy(xpath = "//th[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-stickyHeader MuiTableCell-alignCenter MuiTableCell-sizeMedium css-5zhpm4']//input[@type='checkbox']")
	   WebElement Morningsession_SelectAll_page;
	   
	   @FindBy(xpath = "(//input[@class='PrivateSwitchBase-input css-j8yymo'])[2]")	   WebElement Afternoonsession_SelectAll_page;
	   
	   @FindBy(xpath = "(//input[@class='PrivateSwitchBase-input css-j8yymo'])[3]")
	   WebElement Eveningsession_SelectAll_page;
	   
	   @FindBy(xpath = "(//*[@class = 'MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-trzrgr'])[2]")
	   WebElement Edit_button_page;
	   
	   @FindBy(xpath = "//*[@class = 'MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedInherit MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-colorInherit MuiButton-root MuiButton-outlined MuiButton-outlinedInherit MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-colorInherit css-ep6j51']")
	   WebElement Cancel_button_page;
	   
	   @FindBy(xpath = "//*[@class= 'MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-xz9haa']")  WebElement CancelIcon__page;
	   
	   @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorError MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorError css-bmstu9']")
	   WebElement CancelIcon_button__page;
	   
	   @FindBy(xpath = "//*[@class= 'MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorError MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorError css-bmstu9']")
	   WebElement Cancelbutton_popup__page;
	   
	   @FindBy(xpath = "//*[normalize-space() = 'Confirm']")
	   WebElement Confirmbutton_Click_page;
	   
	   @FindBy(xpath = "//button[@class= 'MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-fullWidth Mui-disabled MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-fullWidth css-195hrdw']")
	   WebElement Tech_RequestdisableVerofy_page;
	   
	   @FindBy(xpath = "//*[@class = 'MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary css-1w263no']")
	   WebElement Tech_tabNavigation_page;
	   
	   @FindBy(xpath = "//p[@class = 'MuiTypography-root MuiTypography-body2 css-1i2s3q0']")   WebElement Validate_Message_page;
	   
	   @FindBy(xpath = "(//*[normalize-space() = 'Decline'])[1]")   WebElement Decline_button_page;
	   
	   @FindBy(xpath = "//*[@placeholder = 'Type here']")   WebElement Decline_reason_page;
	   
	   @FindBy(xpath = "(//*[normalize-space() = 'Decline'])[3]")   WebElement Decline_button_popup_page;
	   
	   @FindBy(xpath = "//*[@class= 'MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-fullWidth Mui-disabled MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-fullWidth css-195hrdw']")
	   WebElement Request_button_Disabledbutton_page;
	   
	   @FindBy(xpath = "//*[text() = 'Your account has been blocked due to multiple attempts kindly contact our admin']")  WebElement Request_Disabledbutton_textverify;
	   
	   @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-afpww']")   WebElement InfoMessage_Expert_Decline;
	   
	   @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-43etnu']")  WebElement Under_Review_Text;
	   
	   //Constructor
	   public Candidate_Availability_Page(WebDriver driver)
	   {
		   this.driver = driver;
	       PageFactory.initElements(driver, this);
	   }
	   
	   //Action Class
	   public void HR_Navigation()
	   {
		   Generic.Click(HR_Navigation_Page, 10);
	   }
	   
	   public void InterviewDD()
	   {
		   Generic.Click(InterviewDD_Page, 10);
	   }
	   
	   public void HR_Tab_Page()
	   {
		   Generic.Click(HR_Tab_Page, 10);
	   }
	   
	   public void Tech_Tab_Page()
	   {
		   Generic.Click(Tech_Tab_Page, 10);
	   }
	   
	   public void RequestInterviewbutton()
	   {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		   wait.until(ExpectedConditions.elementToBeClickable(RequestInterviewbutton_Page)); 
		   Generic.Click(RequestInterviewbutton_Page, 10);
	   }
	   
	   public void RequestAgainbutton()
	   {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		   wait.until(ExpectedConditions.elementToBeClickable(RequestAgainbutton_Page));   
		   Generic.Click(RequestAgainbutton_Page, 10);
	   }
	   
	   public boolean RequestInterviewbutton_Verify()
	   {
		   return RequestInterviewbutton_Page.isEnabled();
	   }
	   
	   public void Confirmbutton_Click()
	   {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		   wait.until(ExpectedConditions.elementToBeClickable(Confirmbutton_Click_page));
		   Generic.Click(Confirmbutton_Click_page, 20);
	   }
	   
	   public boolean Confirmbutton_Verify_Page()
	   {
		   return (Confirmbutton_Page.isEnabled());		 
	   }
	   
	   public void SelctSlot1_Page()
	   {
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   ((JavascriptExecutor) driver).executeScript("arguments[0].click();", SelctSlot1_Page);
	   }
	   
	   public void SelctSlot2_Page()
	   {
		   Generic.Click(SelctSlot2_Page, 10);
	   }
	   
	   public void Morningsession_SelectAll()
	   {
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", Morningsession_SelectAll_page);
	        js.executeScript("arguments[0].click();", Morningsession_SelectAll_page);
	   }
	   
	   public void Afternoonsession_SelectAll()
	   {
		   JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", Afternoonsession_SelectAll_page);
	        js.executeScript("arguments[0].click();", Afternoonsession_SelectAll_page);
	   }
	   
	   public void Eveningsession_SelectAll()
	   {
		   JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", Eveningsession_SelectAll_page);
	        js.executeScript("arguments[0].click();", Eveningsession_SelectAll_page);
	   }
	   
	   public void Edit_button_page()
	   {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		   wait.until(ExpectedConditions.elementToBeClickable(Edit_button_page));
		   Generic.Click(Edit_button_page, 20);
	   }
	   
	   public void Cancel_button()
	   {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		   wait.until(ExpectedConditions.elementToBeClickable(Cancel_button_page));
		   Generic.Click(Cancel_button_page, 20);
	   }
	   
	   public void CancelIcon_button()
	   {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		   wait.until(ExpectedConditions.elementToBeClickable(CancelIcon_button__page));
		   Generic.Click(CancelIcon_button__page, 20);
	   }
	   
	   public void CancelIcon_Calander()
	   {
		   Generic.Click(CancelIcon__page, 10);
	   }
	   
	   public void Cancelbutton_popup__page()
	   {
		   Generic.Click(Cancelbutton_popup__page, 10);
	   }
	   
	   public void Tech_tabNavigation()
	   {
		   Generic.Click(Tech_tabNavigation_page, 10);
	   }
	   
	   public boolean Tech_RequestdisableVerify()
	   {
		   return Tech_RequestdisableVerofy_page.isEnabled();
	   }
	   public String Validate_Message()
	   {
		   return Validate_Message_page.getText();
	   }
	   
	   public void Decline_button()
	   {
		   Generic.Click(Decline_button_page, 10);
	   }
	   
	   public void Decline_button_popup()
	   {
		   Generic.Click(Decline_button_popup_page, 10);
	   }
	   
	   public void Decline_reason_page(String sent)
	   {
		   Generic.sendkeys(Decline_reason_page, sent, 10);
	   }
	   
	   public boolean Request_button_Disabledbutton()
	   {
		   return Request_button_Disabledbutton_page.isEnabled();
	   }
	   
	   public String Request_Disabledbutton_textverify()
	   {
		   return Request_Disabledbutton_textverify.getText();
	   }
	   
	   public String InfoMessage_Expert_Decline()
	   {
		   return InfoMessage_Expert_Decline.getText();
	   }
	   
	   public boolean Check_StausNotGiven()
	   {
		   return driver.findElements(By.xpath("//button[normalize-space()='Request Interview']")).size() > 0; 
	   }
	   
	   public boolean RequestAfterRating()
	   {
		   return driver.findElements(By.xpath("//button[normalize-space()='Request Interview']")).size() > 0; 
	   } 
}
