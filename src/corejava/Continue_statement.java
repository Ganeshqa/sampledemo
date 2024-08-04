package corejava;

public class Continue_statement {
	
	  public static void printmessage() {
		  
		  for(int i=0;i<10;i++) {
			  
			    if(i==5) {
			    	
			    	continue; // it will skip the particular iteration of the loop
			    }
			    
			    System.out.println("the value of i is="+i);
			    
			    System.out.println("Hello world");
		  }
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printmessage();
	}

}
