package stringclass;

public class StringBuilderclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  StringBuilder obj=new StringBuilder("Hello");
		  System.out.println(obj.append("world"));
		  System.out.println(obj.insert(5,"Java"));
		  System.out.println(obj.delete(5,9));
		  System.out.println(obj.replace(5,10,"Java1"));
		  System.out.println(obj.substring(5,10));
		  System.out.println(obj.reverse());
	}

}
