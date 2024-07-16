//  Write a java program that prompts the user to enter an integer and determines whether 
//  it is divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible 
//  by 5 or 6, but not both.


import java.util.Scanner;
public class Qh4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter an Integer : ");
	        int a = sc.nextInt();

	        System.out.println("Is " +a+" divisible by 5 and 6 ? " +((a%5==0) && (a%6==0)));
	        System.out.println("Is " +a+" divisible by 5 or 6 ? " +((a%5==0) || (a%6==0)));
	        System.out.println("Is " +a+" divisible by 5 or 6, but not both? " +((a%5==0) ^ (a%6==0)));

	}

}
