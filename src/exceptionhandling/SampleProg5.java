package exceptionhandling;

import java.io.IOException;

public class SampleProg5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try {
          int a[]=new int[7];
		  
		  a[6]=10/0;
		  
		  System.out.println(a[9]);
		  
		  String s=null;
		  int y=s.length();
		  System.out.println(y);
	}
		
		catch(ArithmeticException e) {
			
			e.printStackTrace();
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			
			   e.printStackTrace();
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}

		finally {
			
			System.out.println("hello world");
		}
}
}
