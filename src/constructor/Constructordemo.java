package constructor;

public class Constructordemo {
	
	    int length;
	    int breadth;
	    int height;
	    
	    public Constructordemo() {  // default constructor
	    	
	    	 length=30;
	    	 breadth=40;
	    	 height=50;
	    	
	    }
	    
	    public Constructordemo(int l,int b,int h) { // constructor overload
	    	
	    	  this.length=l;
	    	  this.breadth=b;
	    	  this.height=h;
	    }
	    
	    public int getcubevolume() {
	    	
	    	return(length*breadth*height);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructordemo obj1=new Constructordemo();
		
		System.out.println(obj1.getcubevolume());
	
       Constructordemo obj2=new Constructordemo(90,90,90);
		
		System.out.println(obj2.getcubevolume());
	
	}

}
