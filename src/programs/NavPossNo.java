package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NavPossNo {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Number");
		int no = Integer.parseInt(br.readLine());
		
		if(no > 0)
			System.out.println("No is positive");
		else
			System.out.println("No is negitive");
	}

}
