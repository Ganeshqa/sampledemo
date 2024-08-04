package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Spicejetapp extends Commonfunctionclass {

	   public static void spicejet() throws InterruptedException {
		   
		    driver.findElement(By.xpath("//*[text()='round trip']")).click();
		    
		    driver.findElement(By.cssSelector("div.r-1g40b8q:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).click();
		    
		    WebElement flyfrom=driver.findElement(By.xpath("//*[text()='Bengaluru']"));
		    
		                      flyfrom.click();
		                      flyfrom.click();
		    
		    driver.findElement(By.xpath("//*[@value,'Select Destination']")).click();
		    
		    Thread.sleep(3000);
		    
		   driver.findElement(By.cssSelector("div.r-1awozwy:nth-child(20) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
		   
	   }
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Launchbrowser("firefox","https://www.spicejet.com/");
		spicejet();
	}

}
