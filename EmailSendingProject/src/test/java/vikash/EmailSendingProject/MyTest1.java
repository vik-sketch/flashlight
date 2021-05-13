package vikash.EmailSendingProject;
import org.apache.commons.mail.EmailException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyTest1 {
										// Eclipse have this facility (which introduced in previous pic)
	@Test								// I selected lines from (24-33) then right click > Refactor > Extract method
	public void myTest() {				// Eclipse will create a method itself for those selected lines
		
		int a= 90;
		int b= 10;
		
		Assert.assertEquals(a, b);
		System.out.println("====TestDone=====");
	}
		
	@BeforeClass
	public void beforeClass() {
		System.out.println("====starting the test======");
	}
		
	@AfterMethod
	public void afterClass(ITestResult result) throws EmailException {
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			HowToSendEmailAfterTestExecution.sendEmail();
		    System.out.println("Test failed and email sent");		    
		}		
	}															 // this class file is related to previous pic/class file
}																// o/p - mail will be sent
