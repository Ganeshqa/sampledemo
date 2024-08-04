package corejava;

public class Returnvalue {
	
	  protected static int add(int num1,int num2) {

		    int sum=num1+num2;
		    
		    return sum;
	  }
	  
	  protected static double sub(double num1,double num2) {
		  
		   double diff=num1=num2;
		   
		   return diff;
	  }
	  
	  protected static String Test(String num1,String num2) {
		  
		  String val=num1+num2;
		  
		  return val;
	  }
		  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  System.out.println(add(100,200));
		  System.out.println(sub(344848.44,34423.34));
		  System.out.println(Test("Hello","world"));
	}

}
