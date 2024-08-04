package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	
	    static WebDriver driver;
	    
	    public static void Firefox() {
	    	
	    	System.setProperty("webdriver.gecko.driver","geckodriver.exe");
	    	driver=new FirefoxDriver();
	    	driver.get("https://www.google.com");
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    }
	    
	    public static void chrome() {
	    	
	    	System.setProperty("webdriver.chrome.driver","Chromedriver.exe");
	    	driver=new ChromeDriver();
	    	driver.get("https://www.facebook.com");
	    	driver.manage().window().maximize();
	    	
	    }
	    
	    public static void Edge() {
	    	
	    	System.setProperty("webdriver.edge.driver","msedgedriver.exe");
	    	driver=new EdgeDriver();
	    	driver.get("https://www.google.com");
	    	driver.manage().window().maximize();
	    	
	    }
	    
	    public static void Navigation() throws InterruptedException {
	    	
	    	Firefox();
	    	driver.navigate().to("https:facebook.com");
	    	Thread.sleep(3000);
	    	driver.navigate().back();
	    	Thread.sleep(3000);
	    	driver.navigate().forward();
	    	Thread.sleep(3000);
	    	driver.navigate().refresh();
	    	Thread.sleep(3000);
	    	driver.quit();
	    	 
	    }
	    

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Firefox();
		chrome();
		Edge();
		Navigation();
	}

}
