package Test;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Base.Baseclass;
import io.qameta.allure.Attachment;

public class AllureTestListners implements ITestListener
{
	public static String getTestmethodName(ITestResult itt)
	{
		return itt.getMethod().getConstructorOrMethod().getName();	
	}
	
	@Attachment()
	public byte[] CatchFailedcases(WebDriver driver) 
	{
	    return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}
	
	public void onStart(ITestContext itTest)
	{
		System.out.println("Started the Test" + itTest.getName());
		//itTest.setAttribute("WebDriver", Baseclass.);
	}
}
