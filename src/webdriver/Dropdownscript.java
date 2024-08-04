package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownscript {
	
    static WebDriver driver;
	
	 public static void firefox() {
	    	
	    	System.setProperty("webdriver.gecko.driver","geckodriver.exe");
	    	driver=new FirefoxDriver();
	    	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    	driver.manage().window().maximize();
	    	
	 }
	 
	 public static void dropdown() throws InterruptedException {
		 
		 driver.findElement(By.linkText("Create a new account")).click();
		 Thread.sleep(3000);
		 
		 Select day=new Select(driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Day')]")));
		 
		     day.selectByValue("04");
		     
		 Select month=new Select(driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Month')]")));
		 
		     month.selectByVisibleText("FEB");
		     
		 Select year=new Select(driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Year')]")));
		 
		      year.selectByValue("1998");
		 		
		 
	 }
	 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		firefox();
		dropdown();
	}

}
