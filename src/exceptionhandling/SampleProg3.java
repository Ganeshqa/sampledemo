package exceptionhandling;

public class SampleProg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try  {
		   String s="abcd";
		  
		  int i=Integer.parseInt(s);
		  
		  System.out.println(i);
		
	}
		catch(NumberFormatException e) {
			
			e.printStackTrace();
		}
		
		finally 
		{
			
			System.out.println("Hello world");
		}

}
}
