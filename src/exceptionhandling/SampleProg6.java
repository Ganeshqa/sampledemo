package exceptionhandling;

import java.io.IOException;

public class SampleProg6 {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		try {
			
			try {
				 
				int a=10/0;
				
				
			}catch(ArithmeticException e) {
				
				System.out.println(e);
			}
			
			try {
				
				int a[]=new int[5];
				
				a[6]=4;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				
				System.out.println(e);
				
				System.out.println("hello world");
				
			}
		}
			
			catch(Exception e) {
				
				System.out.println(e.getMessage());
		}
			  
			   System.out.println("i am learning core java concept");
			  
		}

		}


