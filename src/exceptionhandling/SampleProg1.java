package exceptionhandling;

public class SampleProg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
		     int val=50/0;
			  System.out.println(val);
		}
		
		catch(ArithmeticException e) {
			
			e.getMessage();
		}
		
		finally {
        
		  System.out.println("Hello world");
		  System.out.println("I am learning java concept");
	}

	}
}
