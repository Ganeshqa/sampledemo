package corejava;

public class Empinfo {
	
	  public int empid=102; // primitive
	 
	  public String empname;
	  
	  public void empdata() {
		  
		  System.out.println("the id of the employee is="+empid);
		  
		  System.out.println("the name of the employee is="+empname);
	  }
	  
	  public int add(int num1,int num2) {
		  
		   int sum=num1+num2;
		   
		     return sum;
	  }
	  
	  public static void smallerno(int num1,int num2) {
		  
		       int res= (num1<num2)?num1:num2;
	  
		       System.out.println("the smaller no is="+res);
	  }
	  


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Empinfo obj=new Empinfo();
		  obj.empid=101;
		  obj.empname="John";
		  obj.empdata();
		  
		  System.out.println(obj.add(200,400));
		  
		  smallerno(100,200);
	}

}
