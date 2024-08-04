package testngscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WebTable_Specificcolumdata extends Commonfunctionclass {

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

	     // retrieve the data from specific colum from webtable
	    
	        /*
	         * xpath=//*[@id='customers']/tboday/tr[2]/td[1] --Alfreds Futterkiste

//*[@id='customers']/tboday/tr[3]/td[2] -Centro comercial Moctezuma

//*[@id='customers']/tboday/tr[4]/td[2] - Ernst Handel
	         * 
	         */
	    
	       String bxpath="//*[@id='customers']/tbody/tr[";
	       
	       String axpath="]/td[1]";
	       
	          for(int i=2;i<tr_rows.size();i++) {
	        	  
	        	   String actualxpath=bxpath+i+axpath;
	        	   
	        	  String companyname= driver.findElement(By.xpath(actualxpath)).getText();
	          
	        	  Reporter.log(companyname,true);
	          }
}
	
}
