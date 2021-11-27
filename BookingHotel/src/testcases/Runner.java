package testcases;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		TestNGRunner runner=new TestNGRunner(1);
		runner.creatSuite("Booking Suite", false);
		
		System.out.println(".....Create Booking Test - Apply Discount -- pay at hotel......");
		runner.addTest("Create Booking Test - Apply Discount -- pay at hotel");
		runner.addTestParameter("action", "pay@hotel");
		
		List<String> includeMethodNames=new ArrayList<String>();
		includeMethodNames.add("searchHotel");
		includeMethodNames.add("selectHotel");
		includeMethodNames.add("enterGuestInfo");
		runner.addTestClass("testcases.BookingSearch", includeMethodNames);
		
		includeMethodNames.add("applyDiscount");
		includeMethodNames.add("makePayment");
		runner.addTestClass("testcases.PaymentManager", includeMethodNames);
		
		//2nd test
		
		  System.out.println(".....Create Booking Test - Apply Discount -- pay at hotel......");
		  runner.addTest("Create Booking Test - no Discount -- pay at hotel");
		  runner.addTestParameter("action", "pay@hotel");
		  
		  List<String> includeMethodNames1=new ArrayList<String>();
		  includeMethodNames1.add("searchHotel");
		  includeMethodNames1.add("selectHotel");
		  includeMethodNames1.add("enterGuestInfo");
		  runner.addTestClass("testcases.BookingSearch", includeMethodNames1);
		  
		  includeMethodNames1.add("applyDiscount");
		  includeMethodNames1.add("makePayment");
		  runner.addTestClass("testcases.PaymentManager", includeMethodNames1);
		 
		  runner.run();

	}

}
