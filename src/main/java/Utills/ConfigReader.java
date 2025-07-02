package Utills;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader
{
   public static Properties properties;
   public static FileInputStream fis;
   
   static
   {
       try  {
           String filePath = "C:\\Users\\arusi\\Repo\\Freshcots%20Test%20Automation\\AutomationTesting\\Freshcots\\src\\test\\resource\\config.properties";
           fis = new FileInputStream(filePath);
           properties = new Properties();
           properties.load(fis);
       } catch (IOException e) {e.getMessage();}
   }

   public static String getProperty(String key) 
   {
       return properties.getProperty(key);
   } 
}