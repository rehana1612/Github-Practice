package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PaymentManager 
{
  @Test
  public void applyDiscount() 
  {
	  System.out.println("apply discount");
  }
  
  @Parameters({"action"})
  @Test
  public void makePayment(String paymentType, ITestContext context) 
  {
	  if(paymentType.equals("instantpayment"))
	 System.out.println("make instant payment"); 
	  else
		  System.out.println("pay@hotel");
	  
	 //booking id
	  String bookingID="rehana1612";
	  context.setAttribute("bID", bookingID);
	 
  }
}
