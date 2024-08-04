package javacollections;

import java.util.HashSet;
import java.util.Set;

public class HashSetclass {
	
	public Set countryinfo(String s1,String s2,String s3,String s4,String s5) {
		

		  Set obj=new HashSet();
		  
		  obj.add(s1);
		  obj.add(s2);
		  obj.add(s3);
		  obj.add(s4);
		  obj.add(s5);
		
		  return obj;
		  
		  
	}
	
	public Set Storenumbers() {
		
		  Set obj1=new HashSet();
		  
		    for(int i=0;i<=10;i++) {
		    	
		    	 obj1.add(i);
		    }
		    
		    return obj1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSetclass a=new HashSetclass();
		System.out.println(a.countryinfo("India","USA","USA","SPAIN","CHINA"));
		System.out.println(a.Storenumbers());
		  
		  
	}

}
