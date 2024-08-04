package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Advantageshopping {
	
	      static WebDriver driver;
	
	 public static void chrome() {
	    	
	    	System.setProperty("webdriver.chrome.driver","Chromedriver.exe");
	    	driver=new ChromeDriver();
	    	driver.get("https://www.advantageonlineshopping.com");
	    	driver.manage().window().maximize();
	    	
	 
	    }
	 
	 public static void createaccount() throws InterruptedException {
		 
	     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 
		driver.findElement(By.id("menuUser")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("CREATE NEW ACCOUNT")).click();
		
		 WebElement username=driver.findElement(By.name("usernameRegisterPage"));
		                    username.click();
		                    username.sendKeys("Samuel_Joe");
		                    
		                    
		WebElement emailid=driver.findElement(By.name("emailRegisterPage"));
		                   emailid.click();
		                   emailid.sendKeys("Samuel.joe@gmail.com");
		                   
	    WebElement pwd=driver.findElement(By.name("passwordRegisterPage"));
	                   pwd.click();
	                   pwd.sendKeys("Samuel@1234");
	                   
	    WebElement cpwd=driver.findElement(By.name("confirm_passwordRegisterPage"));
	                    cpwd.click();
	                    cpwd.sendKeys("Samuel@1234");
	                    
	     driver.findElement(By.name("first_nameRegisterPage")).sendKeys("Samuel");
	     
	     driver.findElement(By.name("last_nameRegisterPage")).sendKeys("Joseph");
	     
	     driver.findElement(By.name("phone_numberRegisterPage")).sendKeys("9034424555");
	     
	     driver.findElement(By.name("countryListboxRegisterPage")).click();
	     
	     Select country=new Select(driver.findElement(By.name("countryListboxRegisterPage")));
	     
	                    country.selectByVisibleText("India");
	                    
	     driver.findElement(By.name("cityRegisterPage")).sendKeys("Hyderabad");
	     
	     driver.findElement(By.name("addressRegisterPage")).sendKeys("hyderabad");
	     
	     driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys("Telangana");
	     
	     driver.findElement(By.name("i_agree")).click();
	     
	     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	     
	     driver.findElement(By.id("register_btn")).click();
		 
	 }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		chrome();
		createaccount();
		
	}

}
