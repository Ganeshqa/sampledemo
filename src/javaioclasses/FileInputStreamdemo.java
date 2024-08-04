package javaioclasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamdemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 StringBuffer content=null;
		 FileInputStream fis = null;
	
		 int ch;
		 
		 try {
			 
		     fis=new FileInputStream("‪C:\\Users\\Ganesh\\Desktop\\testdata1.txt");
             content=new StringBuffer();
             
             while((ch=fis.read())!= -1) {
            	 
            	 content.append((char) ch);
            	 
             }
             
		 }
		 
		 catch(FileNotFoundException e) {
			 
			 e.printStackTrace();
             
             
		 }
		 finally  {
			 
			 System.out.println(content);
			 
	
		 }

	}

}
