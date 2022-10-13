package lab7;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the employee's number");
		int e = scan.nextInt();
		if(e>=100&&e<200)
			System.out.println("Thier a general manager");
		else if(e>=200&&e<300)
			System.out.println("Their a supervisor");
		else if(e>=300&&e<400)
			System.out.println("Their a staff member");
		else if(e>=400&&e<500)
			System.out.println("Their a contractor");
		else
			System.out.println("Invalid employee number");

	}

}
