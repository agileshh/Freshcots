package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass 
{
   public WebDriver driver;
   public Properties prop;

public void loadproperties() throws IOException
   {
	   prop = new Properties();
	   try 
	   {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Configure\\Config.properties");
		prop.load(fis);
	   } catch (FileNotFoundException e) 
	   {
		 e.printStackTrace();
	   }
   }
   
   public WebDriver Initializebrowser(String browser) throws IOException 
   {
	    Map<String, Object> prefs = new HashMap<>();
	    prefs.put("profile.default_content_setting_values.media_stream_camera", 1); // 1 = Allow
        prefs.put("profile.default_content_setting_values.media_stream_mic", 1);    // 1 = Allow
	    ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("prefs", prefs);

	    if (browser.equalsIgnoreCase("chrome"))
	    {
	        driver = new ChromeDriver(options);
	    }
	    else if (browser.equalsIgnoreCase("firefox"))
	    {
	        driver = new FirefoxDriver();
	    }
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://app-freshcots-ui-qa-southindia-001.azurewebsites.net/");
	    return driver;
	}
}
