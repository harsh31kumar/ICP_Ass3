//  Write a Java program that takes a year from user and print true if that year is a leap year 
//  otherwise print false.


import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the year: ");
		int a = sc.nextInt();
		
		if (a % 4 == 0) {
			if (a%100 == 0 ) {
				if (a % 400 ==0 ) {
					System.out.println(a + " is a Leap Year");
				}
				else {
					System.out.println(a + " is not a Leap Year");
				}		
			}
			else {
				System.out.println(a + " is not a Leap Year");
			}		
		}	
		else {
			 System.out.println(a  + " is not  a Leap year ");
		}
	}

}
