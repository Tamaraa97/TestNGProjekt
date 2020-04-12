package Primer1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.AssertJUnit;

public class NewTest {
	
	//kad stavimo * kod importa pod to spadaju sve importovne metode
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before auire");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}
	@Test(priority=2)
	public void test1() {
		System.out.println("tets1");
	}
	@Test(priority=1)
	public void test2() {
		System.out.println("tets2");
	}
  
}
