package arrayconcept;

public class Arraydemo {
	
	  static int[] numbers; // declaring the array
	  
	  public static void storenumbers() {
		  
		  numbers=new int[101]; // intialize the size of array
		  
		  for(int i=0;i<=100;i++) {
			  
			 numbers[i]=i; // add the elements into an array
		  }
		  
	  }
	  
	  public static void printevennumbers() {
		  
		  for(int i=0;i<numbers.length;i++) {
			  
			  if((numbers[i]%2)==0) {
				  
				  System.out.println(numbers[i]);
			  }
		  }
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		storenumbers();
		
		printevennumbers();
	}

}
