package javacollections;

import java.util.LinkedList;

public class Linkedlistclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Linked list class is used to store the list of elements.
		 * Linked list class contains duplicate elements and null values
		 * 
		 * linked list method
		 * 
		 * addFirst
		 * addlast
		 * removefirst
		 * removelast
		 * getfirst
		 * getlast
		 * 
		 */
		  
		  LinkedList<String>obj=new LinkedList<String>();
		  obj.add("hello");
		  obj.add("world");
		  obj.add("java");
		  obj.add("core");
		  obj.add("java");
		  obj.add(null);
		  obj.add("     ");
		  
		  System.out.println(obj);
		  
		  obj.addFirst("advance java");
		  
		  obj.addLast("core java");
		  
		  System.out.println(obj);
		  
		  // get method
		  
		  System.out.println(obj.get(3));
		  
		  System.out.println(obj.getFirst());
		  
		  
		  System.out.println(obj.getLast());
		  
		  //set method
		  
		  obj.set(1,"selenium");
		  
		  System.out.println(obj);
		  
		  obj.removeFirst();
		  
		  obj.removeLast();
		  
		  System.out.println(obj);
		  
		  
		  
		
	}

}
