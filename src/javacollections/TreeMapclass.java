package javacollections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 TreeMap<Integer,String>obj=new TreeMap<Integer,String>();
		 
		  obj.put(1,"Lion");
		  obj.put(2,"snake");
		  obj.put(3,null);
		  obj.put(4,"dog");
		  obj.put(5,"tiger");
		  
		  System.out.println(obj.size());
		  
		  for(Map.Entry x:obj.entrySet()) {
			  
			  System.out.println(x.getKey()+"    "+x.getValue());
			  
		  }
		  
		  System.out.println(obj.descendingMap());
		  
		  System.out.println(obj.headMap(3,false));

		  System.out.println(obj.tailMap(3,false));
}
}