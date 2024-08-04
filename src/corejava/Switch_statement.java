package corejava;

import java.util.Scanner;

public class Switch_statement {
	
	public static void Bankinfo() {
		
		  Scanner obj=new Scanner(System.in);
		  
		  System.out.println("Enter the Bank name");
		  
		  String Bankname=obj.next();
		
		  switch(Bankname) {
		  
		  case "HSBC":
			  
			  System.out.println("Rate of interest for personal loan is="+10.5);
			  
			  break;
			  
		  case "HDFC":
			  
              System.out.println("Rate of interest for personal loan is="+11.5);
			  
			  break;
			  
		  case "JPMC":
			  
               System.out.println("Rate of interest for personal loan is="+12.5);
			  
			  break;
		  
		  case "CITI":
			  
               System.out.println("Rate of interest for personal loan is="+13.5);
			  
			   break;
			   
		  case "SBI":
			  

               System.out.println("Rate of interest for personal loan is="+14.5);
			  
			   break;
			   
		  default:
			  
			  System.out.println("enter the wrong bank name");
			  
		  }
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bankinfo();
	}

}
