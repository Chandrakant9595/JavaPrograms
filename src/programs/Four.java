package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

public class Four {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter sting in Uppercase latters");
		String s = br.readLine();
		
		String up = s.toUpperCase();
		System.out.println("Uppercase "+up);
		
		String ls = s.toLowerCase();
		System.out.println("Lowercase "+ls);
		int len = ls.length();
		System.out.println(len);
		System.out.println();
		
		String[] ary = ls.split("");
		  for(int i=0; i < ary.length; i++){
              //System.out.println(ary[i]);
			 
      }
		  
		  System.out.println("first indes "+ary[0]);
		  System.out.println("last indes "+ary[len-1]);
		  System.out.println();
		  
		  String s1 = ary[0].toUpperCase();
		  System.out.println(s1);
		  
		  String s2= ary[len-1].toUpperCase();
		  System.out.println(s2);
		 
		  System.out.println(ary[0].replace(ary[0], s1)); 
		  System.out.println(ary[len-1].replace(ary[len-1], s2));
		
	}
}
