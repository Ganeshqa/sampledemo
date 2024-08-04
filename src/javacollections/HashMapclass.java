package javacollections;

import java.util.HashMap;
import java.util.Map;

public class HashMapclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  HashMap<Integer,String>obj=new HashMap<Integer,String>();
		  
		  obj.put(1,"Lion");
		  obj.put(2,"snake");
		  obj.put(3,null);
		  obj.put(4,null);
		  obj.put(5,"tiger");
		  
		  System.out.println(obj.size());
		  
		  for(Map.Entry x:obj.entrySet()) {
			  
			  System.out.println(x.getKey()+"    "+x.getValue());
			  
		  }
		  
		  obj.putIfAbsent(6,"Horse");
		  
  for(Map.Entry x:obj.entrySet()) {
			  
			  System.out.println(x.getKey()+"    "+x.getValue());
			  
		  }
		  
        obj.remove(6,"Horse");
        
        System.out.println(obj);
	}

}
