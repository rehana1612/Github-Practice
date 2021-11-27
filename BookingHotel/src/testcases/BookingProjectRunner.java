package testcases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class BookingProjectRunner 
{

	public static void main(String[] args) 
	{
		TestNG testng=new TestNG();
		
		XmlSuite mysuite=new XmlSuite();
		mysuite.setName("Booking suite");
		List<XmlSuite> allsuites=new ArrayList<XmlSuite>();
		allsuites.add(mysuite);
		testng.setXmlSuites(allsuites);
		
		XmlTest createBookingTest=new XmlTest(mysuite);
		createBookingTest.setName("Create Booking Test - Apply Discount -- pay at hotel");
		
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("action", "pay@hotel");
		createBookingTest.setParameters(parameters);
		
		List<XmlClass> testClasses=new ArrayList<XmlClass>();
		
		XmlClass testClass=new XmlClass("testcases.BookingSearch");
		List<XmlInclude> methods = new ArrayList<XmlInclude>();
		methods.add(new XmlInclude("searchHotel",1));
		methods.add(new XmlInclude("selectHotel",2));
		methods.add(new XmlInclude("enterGuestInfo",3));
		testClass.setIncludedMethods(methods);
		testClasses.add(testClass);
		
		testClass=new XmlClass("testcases.PaymentManager");
		methods.add(new XmlInclude("applyDiscount",1));
		methods.add(new XmlInclude("makePayment",2));
		testClass.setIncludedMethods(methods);
		testClasses.add(testClass);
		
		testClass=new XmlClass("testcases.CostomerCommunications");
		methods.add(new XmlInclude("checkMail",1));
		methods.add(new XmlInclude("checkMobile",2));
		testClass.setIncludedMethods(methods);
		testClasses.add(testClass);
		
		createBookingTest.setXmlClasses(testClasses);
		
		testng.run();

	}

}
