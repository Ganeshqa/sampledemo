package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_optionscount extends Commonfunctionclass  {
	

	public static void dropdownoptions() throws InterruptedException {
			 
		 
		 driver.findElement(By.linkText("Create a new account")).click();
		 Thread.sleep(3000);
		 
		 Select country=new Select(driver.findElement(By.id("country")));
		 
		  // count no of options in dropdown
		 
		   List<WebElement> options= country.getOptions();
		   
		   System.out.println("no of options in dropdown is="+options.size());
		   
		    // retrieve the country names from dropdown
		   
		      for(int i=0;i<options.size();i++) {
		    	  
		    	   WebElement countryname=options.get(i);
		      
		    	   System.out.println("name of the country is="+countryname.getText());
		    	   
		    	     if(countryname.getText().equalsIgnoreCase("Brazil")) {
		    	    	 
		    	    	 countryname.click();
		    	     }
		      }
		 
		 }

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Launchbrowser("firefox","https://mail.rediff.com/cgi-bin/login.cgi");
		dropdownoptions();
		
	}

}
