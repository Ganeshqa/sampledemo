package polymorphism;

public class Executionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Bank obj=new Bank();
		  CITI obj1=new CITI();
		  HSBC obj2=new HSBC();
		  JPMC obj3=new JPMC();
		  
		  System.out.println(obj.ROI1());
		  System.out.println(obj1.ROI2());
		  System.out.println(obj2.ROI3());
		  System.out.println(obj3.ROI4());
	}

}
