package abstractclass;

public class Abstractdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Iphone5 obj=new Iphone7();
		 obj.calling();
		 obj.sms();
		 obj.music();
		 obj.camera();
	}

}

abstract class Iphone5 {
	
	public void calling() {
		
		System.out.println("i can make the calls from iphone5");
	}
	
	public abstract void sms();
	
	public abstract void music();
	
	public abstract void camera();
}


abstract class Iphone6 extends Iphone5 {
	
	public void sms() {
		
		System.out.println("i can send sms from iphone6");
	}
	
    public abstract void music();
	
	public abstract void camera();
	
}


class Iphone7 extends Iphone6 {  // concrete class
	
	public void music() {
		
		System.out.println("i can play music from iphone7");
	}
	
	public void camera() {
		
		System.out.println("i can take pics from iphone7");
	}
}




