package testngscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Handling_webtable extends Commonfunctionclass {

	@Test
	public static void WebTable() throws InterruptedException {
		
		driver.findElement(By.cssSelector("div.w3-row:nth-child(3) > div:nth-child(1) > div:nth-child(1) > a:nth-child(3)")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='HTML Tables']")).click();
		Thread.sleep(3000);
		WebElement table=driver.findElement(By.id("customers"));
		
		 // it will count no of rows in webtable
		
		List<WebElement>tr_rows=table.findElements(By.tagName("tr"));
		Reporter.log("no of rows in webtable is="+tr_rows.size(),true);
		
		// count no of colums in webtable
		
	    List<WebElement>tc_colums=table.findElements(By.tagName("th"));
	    Reporter.log("no of colums in webtable is="+tc_colums.size(),true);
	    
	        // retrieve the test data from webtable
	    
	              int row_num=1;
	              
	              for(WebElement trows:tr_rows) {
	            	  
	            	List<WebElement>tabledata=  trows.findElements(By.tagName("td"));
	              
	              int col_num=1;
	              
	               for(WebElement data:tabledata) {
	            	   
	            	   Reporter.log("row="+row_num+",col="+col_num+",text="+data.getText());
	               

	                    col_num++;
	            	   
	               }
	                    row_num++;
	              }
	                  
	}
}
/*
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >
<suite name="TrainingTestSuite" annotations= "JDK" thread-count="2" parallel="tests">

 
 <test name="tesing the functionality orange hrms in chrome browser">
 
 <parameter name="Browsername" value="firefox"></parameter>
 <parameter name="url" value="https://www.w3schools.com"></parameter>
  
  <classes>

    
	 <class name="testngscript.Handling_webtable"/> 
	 
     
  </classes>

</test>

*/