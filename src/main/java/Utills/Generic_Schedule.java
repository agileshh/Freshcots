package Utills;

import org.openqa.selenium.WebDriver;

import Pages.Expert_Schedule_Page;

public class Generic_Schedule 
{
	public static WebDriver driver;
	
	public static boolean ScheduleInterview_UnmatchedExpert(Expert_Schedule_Page Schedule) throws InterruptedException 
	{
	   Schedule.Interview_dropdown();
	   Schedule.PickCandidate();
	   return Schedule.SelectSlot1_IsEnabled();
	}
	     
	public static boolean Expert_Slot_already_booked(Expert_Schedule_Page Schedule) throws InterruptedException 
	{
		  Schedule.Interview_dropdown();
		  Schedule.PickCandidate();
		  Schedule.SelectSlot1();
		  return Schedule.Expert_Slot_already_booked();
    }
	
	public static void ScheduleInterview(Expert_Schedule_Page Schedule) throws InterruptedException 
	{
		  Schedule.Interview_dropdown();
		  Schedule.PickCandidate();
		  Schedule.SelectSlot1();
		  Schedule.Choose_time1();
		  Schedule.Confirmbutton();
    }
	                                      
	public static void ScheduleInterview_Tech(Expert_Schedule_Page Schedule) throws InterruptedException 
	{
		  Schedule.Interview_dropdown();
		  Schedule.PickCandidate();
		  Schedule.SelectSlot1();
		  Schedule.Choose_time2();
		  Schedule.Confirmbutton();
    }
}
