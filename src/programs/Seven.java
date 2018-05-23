package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Seven {
	
	static String str;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter String");
		str = br.readLine();
		
		System.out.println( "Length of String is " + strlen(str) );
		
	}
	
	 static  int strlen( String str ){
	       int len=0;
	       try{
	           while(true){
	               //traversing and counting
	               str.charAt( len );
	               len++;
	           }
	       } catch(Exception e){
	           //Out of bounds
	       }
	        return len;
	    }

}
