package testngscript;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {

	@Test(priority=0)
	 public static void Test1() {
		 
		 Assert.assertEquals(20,20);
	 }

	 @Test(priority=1)
	 public static void Test2() {
		 
		  SoftAssert obj=new SoftAssert();
		  System.out.println("Test2 method execution is started");
		  obj.assertEquals("hello","hello world","expected text is not matching with actual text");
		  System.out.println("Hello world");
		  System.out.println("Hello Java");
		  obj.assertAll();
	 }
	 
	 @Test(priority=2)
	 public static void Test3() {
		 
		  System.out.println("Test3 method execution is started");
		  Assert.assertEquals("hello","hello","expected text is not matching with actual text");
		  System.out.println("Hello vbscript");
		  System.out.println("Hello UFT");
	 }
	 
}
