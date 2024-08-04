package polymorphism;

public class Bank {
	
	public int ROI1() {
		
		return 0;
	}

}

class CITI extends Bank {
	
	public int ROI2() {
		
		return 9;
	}
}

class HSBC extends Bank {
	
	public int ROI3() {
		
		return 10;
	}
}

class JPMC extends Bank {
	
	public int ROI4() {
		
		return 11;
	}
}
