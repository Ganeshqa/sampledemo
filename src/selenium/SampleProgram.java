package selenium;

import corejava.*;

public class SampleProgram extends Returnvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* if variables and methods are static then we can access from one class to another classes of
 * different package with the class name. so here no need to create instance objects of a
 * class
 * 
 
		  Arthimatic_operations.num1=300;
		  Arthimatic_operations.num2=500;
		  Arthimatic_operations.Add();
		  Arthimatic_operations.Sub();
		  Arthimatic_operations.Div();
		  Arthimatic_operations.mul();*/
		  
		 /* Arthimatic_operations obj1=new Arthimatic_operations(); // constructor
		  obj1.Add();
		  obj1.Sub();  its not mandatory*/

/* if variables and methods are non static then we can access from one class to another classes of
 * different package with the class name by creating instance objects of a
  class	*/
		  
        Empinfo obj=new Empinfo();
        
        obj.empid=101; // reference variable
        obj.empname="John";
        obj.empdata();
        
        Returnvalue obj1=new Returnvalue();
        System.out.println(obj1.add(1000,2000));
        System.out.println(obj1.sub(1000,2033.3));
	}

}
