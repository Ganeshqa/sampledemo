package javacollections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Hashtable<Integer,String>obj=new Hashtable<Integer,String>();
		  
		  obj.put(1,"Lion");
		  obj.put(2,"snake");
		  obj.put(3,"cow");
		  obj.put(4,"dog");
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


