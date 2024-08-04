package exceptionhandling;

public class SampleProg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		    String s=null;
		    int y=s.length();
	        System.out.println(y);
		     
	}
		catch(NullPointerException e) {
			
			e.printStackTrace();
		}

		finally {
			
			System.out.println("Hello world");
			
		}
		
}
}