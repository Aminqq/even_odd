package even_odd;

import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the number");
		
		int y = input.nextInt();
		// Module (%rest)
		if (y%2==0) {
			
			System.out.println("You have inserted an even number");
		}
		else {
			
			System.out.println("You have inserted an odd number");

		}
		
		input.close();

	}

}
