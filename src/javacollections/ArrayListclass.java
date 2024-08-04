package javacollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    ArrayList obj=new ArrayList();  // non generic values in an array
		    obj.add(10);
		    obj.add(20);
		    obj.add("hello");
		    obj.add(10.2);
		    
		    System.out.println(obj.size());
		    
		    System.out.println(obj);
		    
		    System.out.println(obj.get(2));
		    
		    for(int i=0;i<obj.size();i++) {
		    	
		    	 System.out.println(obj.get(i));
		    }
		    
		    
		    // adding generic values in an array list
		    
		    ArrayList<Integer>obj1=new ArrayList<Integer>();
		    
		    obj1.add(100);
		    obj1.add(200);
		    obj1.add(300);
		    
		    System.out.println(obj1);
		    
		    
	    ArrayList<String>obj2=new ArrayList<String>();
		    
		    obj2.add("hello");
		    obj2.add("world");
		    obj2.add("java");
		    
		    System.out.println(obj2);
		    
		Empclass e1=new Empclass("Samuel",32,"PM");
		Empclass e2=new Empclass("John",22,"TM");
		Empclass e3=new Empclass("kiran",40,"TL");
		
		ArrayList<Empclass>obj3=new ArrayList<Empclass>();
		
		  obj3.add(e1);
		  obj3.add(e2);
		  obj3.add(e3);
		  
		    Iterator<Empclass> a=obj3.iterator();
		    
		       while(a.hasNext()) {
		    	   
		    	    Empclass e=  a.next();
		       
		    	    System.out.println(e.name);
		    	    System.out.println(e.age);
		    	    System.out.println(e.designation);
		       }
	}

}
