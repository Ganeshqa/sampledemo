package stringclass;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Date obj=new Date();
		        DateFormat obj1= DateFormat.getDateInstance(DateFormat.FULL,Locale.US);
		        String x= obj1.format(obj);
		        System.out.println(x);
		        
	}

}
