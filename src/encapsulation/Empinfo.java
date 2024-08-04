package encapsulation;

public class Empinfo {
	
	  private int empid;
	  
	  private String empname;
	  
	  // setter method is used to set the values to the private variable
	  
	     public void setempid(int lempid) {
	    	 
	    	  this.empid=lempid; // this keyword is used to convert a instance var to local var
	     }
	     
	     public void setempname(String lempname) {
	    	  
	    	  this.empname=lempname;
	     }
	     
	     // getter method is used to get the values from private variable
	     
	       public int getempid() {
	    	   
	    	   return empid;
	       }

	       public String getempname() {
	    	   
	    	   return empname;
	       }
}
