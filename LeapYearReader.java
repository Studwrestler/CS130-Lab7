package lab7;

import java.util.Scanner;

public class LeapYearReader {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year");
		int y = scan.nextInt();
		if((y%4==0 && y%100!=0 ) || y%400==0)
			System.out.println("The year is a leap year");
		else
			System.out.println("The year is a common year");

	}

}
