package stringclass;

import java.util.StringTokenizer;

public class Stringtokeneizerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String x="my name is john@iam learning java@core concept";
		  
		  StringTokenizer obj=new StringTokenizer(x,"@");
		  
		     while(obj.hasMoreTokens()) {
		    	 
		    	 String value= obj.nextToken();
		     
		    	 System.out.println(value);
		     }
	}

}
