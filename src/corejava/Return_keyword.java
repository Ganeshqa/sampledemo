package corejava;

public class Return_keyword {

	 static int i=1;
	   
	   public static void printmessage() {
		   
		   while(i<100) {
			   
			   System.out.println("the value of i is="+i);
			   System.out.println("Hello world");
			   i++; //2,3,4,5,6,7,8,9,10
			   
			   if(i==10) {
				   
				   return; // it will stop the method execution process
			   }
		   }
		   
		   System.out.println("i am learning java concept");
		   
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printmessage();
	}

}
