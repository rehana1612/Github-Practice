package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class CostomerCommunications 
{
  @Test
  public void checkMail(ITestContext context) 
  {
	System.out.println("check mail");  
	String bookingID=(String)context.getAttribute("bID");
	System.out.println(bookingID);
  }
  
  @Test
  public void checkMobile(ITestContext context) 
  {
	 System.out.println("check mobile"); 
	 String bookingID=(String)context.getAttribute("bID");
	 System.out.println(bookingID);
  }
}
