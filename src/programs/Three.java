package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Three {

	public static void main(String[] args) throws IOException{
		
		//Palindrome
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string");
		String ori = br.readLine();
		
		String rev = "";
		
		int len = ori.length();
		
		for(int i=len-1; i>=0; i--){
			rev = rev + ori.charAt(i);
		}
		
		if(ori.equals(rev)){
			System.out.println("Palindrome");
		}else{
			System.out.println("NotPalindrome");
		}
		
		System.out.println();
		
		//factorial
		System.out.println("enter no");
		int no = Integer.parseInt(br.readLine());
		
		int fact = 1;
		for(int j=1; j<=no; j++){
			fact = fact*j;
		}
		System.out.println(fact);
	}
}
