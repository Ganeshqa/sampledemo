package testngscript;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnoations {
	
	@BeforeSuite
	public void bsuite() {
		
		Reporter.log("Before suite method execution is started",true);
	}
	
	@BeforeTest
	public void btest() {
		
		Reporter.log("before test method execution is started",true);
		
	}
	
	@BeforeClass
	public void bclass() {
		
		Reporter.log("before class method execution is started",true);
	}
	
	@BeforeMethod
	public void bmethod() {
		
		Reporter.log("before method execution is started",true);
	}

	@Test
	public void Test1() {
		
		Reporter.log("executing test method is started",true);
	}
	
	@AfterMethod
	public void amethod() {
		
		Reporter.log("after method execution is started",true);
	}

	@AfterClass
	public void aclass() {
		
		Reporter.log("after class method execution is started",true);
	}
	
	@AfterTest
	public void atest() {
		
		Reporter.log("after test method execution is started",true);
		
	}
	
	@AfterSuite
	public void asuite() {
		
		Reporter.log("after suite method execution is started",true);
	}
	
}
