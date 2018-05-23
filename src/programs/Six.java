package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Six {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Number");
		int no = Integer.parseInt(br.readLine());
		
		int reverse = 0;
		while(no != 0 ){
			reverse = reverse * 10;
			reverse = reverse + no%10;
			no = no/10;
		}
		
	System.out.println("Reverse number is : "+reverse);	
	}
}
