
//Swaping numbers

package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Five {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter first number");
		int firstNO =Integer.parseInt(br.readLine());
		System.out.println("Enter second number");
		int secondNO =Integer.parseInt(br.readLine());
		
		System.out.println("Before swaping");
		System.out.println("First NO "+ firstNO);
		System.out.println("Second NO "+ secondNO);
		System.out.println();
		
		firstNO = firstNO + secondNO;
		secondNO = firstNO - secondNO;
		firstNO = firstNO - secondNO;
		
		System.out.println("After swaping");
		System.out.println("First NO "+ firstNO);
		System.out.println("Second NO "+ secondNO);
	}

}
