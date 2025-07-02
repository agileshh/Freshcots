package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Utills.DriverFactory;

public class InterviewFlowTest 
{
	    WebDriver candidateDriver;
	    WebDriver interviewerDriver;

	    LoginPage candidateLogin;
	    LoginPage interviewerLogin;

	    InterviewRoomPage candidateRoom;
	    InterviewRoomPage interviewerRoom;

	    @Test
	    public void simulateInterviewSession() throws InterruptedException 
	    {
	        // Initialize two browsers
	        candidateDriver = DriverFactory.initDriver("candidate");
	        interviewerDriver = DriverFactory.initDriver("interviewer");

	        // Candidate login
	        candidateLogin = new LoginPage(candidateDriver);
	        candidateLogin.doLogin("candidateUser", "candidatePass");

	        // Interviewer login
	        interviewerLogin = new LoginPage(interviewerDriver);
	        interviewerLogin.doLogin("interviewerUser", "interviewerPass");

	        // Join interview room (same room from both browsers)
	        String interviewRoomURL = "https://your-app.com/interview-room/123";

	        candidateRoom = new InterviewRoomPage(candidateDriver);
	        interviewerRoom = new InterviewRoomPage(interviewerDriver);

	        candidateRoom.joinInterviewRoom(interviewRoomURL);
	        interviewerRoom.joinInterviewRoom(interviewRoomURL);

	        // Keep session active for observation (optional)
	        Thread.sleep(30 * 60 * 1000); // 30 mins
	    }

	    @AfterTest
	    public void tearDown() 
	    {
	        if (candidateDriver != null) {
	            candidateDriver.quit();
	        }
	        if (interviewerDriver != null) {
	            interviewerDriver.quit();
	        }
	    }
}
