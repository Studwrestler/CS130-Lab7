package lab7;

import java.util.Scanner;

public class GasAmount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount of gas");
		double a = scan.nextDouble();
		System.out.println("Enter the capacity of your tank");
		double c = scan.nextDouble();
		double l = a/c;
		if(l<.25)
			System.out.println("The level is "+l+" which is less than a quarter tank");
		else if(l<.50 && l>.25)
			System.out.println("The level is "+l+" which is between a quarter and half tank");
		else if(l>.50 && l<.75)
			System.out.println("The level is "+l+" which is between a half tank and a three quarters tank");
		else if(l>.75)
			System.out.println("The level is "+l+" which is almost a full tank");
		else
			System.out.println("Invalid");
		
	

	}

}
