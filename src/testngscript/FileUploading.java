package testngscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploading {

	  static WebDriver driver;
	  
      @Test
	  public static void Launchbrowser() throws InterruptedException {
		  
		  	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    	driver=new ChromeDriver();
	    	driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php");
	    	driver.manage().window().maximize();
	    	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    	driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
	    	driver.findElement(By.id("btnLogin")).click();
	    	driver.navigate().to("http://orangehrm.qedgetech.com/symfony/web/index.php");
	    	
	    	Thread.sleep(3000);
	    	
	    	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	    	
	    	driver.findElement(By.id("btnAdd")).click();
	    	
	    	Thread.sleep(5000);
	    	
	    	WebElement file=driver.findElement(By.id("photofile"));
	    	
	    	  String driveLetter = "D";
	 	     String fileName = "paint1.jpg";
	 	     String filePath = driveLetter + ":\\" + fileName;  // type=file
	    	
	    	file.sendKeys(filePath);
	    	
	    	/*    
   // Runtime.getRuntime().exec("C:\\Users\\Ganesh\\Desktop\\paint1.png");
    
    //robot.keyPress and robot.keyRelease every single key you can use Toolkit to copy the String to the clipboard and then paste it.'
    
    StringSelection s = new StringSelection("C:\\Users\\Ganesh\\Desktop\\paint1.png");  //type=text
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
    Robot robot = new Robot();
    robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
    robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
    robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
    robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
    robot.keyPress(java.awt.event.KeyEvent.VK_V);
    robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
    Thread.sleep(5000);
    robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
    
    
    /* toolkit classs to copy the string file
     * 
     * vk_control & vk_v -- paste the file which is copied
     * 
     * robot.keyRelease -- release the control key button
     * 
     * robot.keypress(java.awt.event.keyEvent.vk_ENTER)
     */

	    	
	    	  
	  }
}
