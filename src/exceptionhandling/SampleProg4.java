package exceptionhandling;

public class SampleProg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			
			  int a[]=new int[5];
			  
			  a[10]=50;
			  
		}
			catch(ArrayIndexOutOfBoundsException e) {
				
				System.out.println(e.getMessage());
			}
			
			System.out.println("hello world");
			
			System.out.println("hello java");
	}
	}

