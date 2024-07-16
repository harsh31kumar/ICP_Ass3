//  Write a program that reads three integers from the user and prints "Increasing" if the 
//  numbers are in increasing order, "Decreasing" if the numbers are in decreasing order, 
//  and "Neither increasing nor decreasing order" otherwise.


import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Integers : ");
		int a = sc.nextInt();
		System.out.println("Enter Second Integers : ");
		int b = sc.nextInt();
		System.out.println("Enter Third Integers : ");
		int c = sc.nextInt();
		
		if (a < b && b < c ) {
			
			System.out.println("Increasing");
		}
		else if (a > b && b > c) {
			
			System.out.println("Decreasing");
		}
		else {
			System.out.println("Neither Decreasing nor Increasing order");
		}

	}

}
