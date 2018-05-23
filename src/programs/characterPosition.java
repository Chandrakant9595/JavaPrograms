package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class characterPosition {
	
	public static void main (String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int counter = 0;
		
		System.out.println("Enter String");
		String str = br.readLine(); 
		
		System.out.println("length of string is " +str.length());
		System.out.println();
		
		for(int i=0;i<str.length();i++){
			int p=i+1;
			if (Character.isLetter(str.charAt(i)))
				 System.out.println("Character at position " +p+ " is " +str.charAt(i));
			        counter++;
		}
		
		System.out.println("");
		
		 for (int i = 0; i < str.length(); i++){
			 int q=i+1;
			 if (Character.isDigit(str.charAt(i)))
				 System.out.println("Degit at position " +q+ " is " +str.charAt(i));
			        counter++;
		 }
	}

}
