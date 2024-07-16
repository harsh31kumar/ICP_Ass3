//  Write a java program that plays the popular scissor-rock-paper game. (A scissor can cut 
//  a paper, a rock can knock a scissor, and a paper can wrap a rock.) The program 
//  randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. The 
//  program prompts the user to enter a number 0, 1, or 2 and displays a message indicating 
//  whether the user or the computer wins, loses, or draws.


import java.util.Scanner;
public class QH1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int r1 = (int)(3 * Math.random()) ;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Scissor (0) , Rock (1) , paper (2) :");
	        int a = sc.nextInt();
	        if (r1 == 0){
	            if (a == 0)
	            System.out.println("The Computer is Scissor . You are Scissor too . It is a draw");
	            else if (a == 1)
	            System.out.println("The Computer is Scissor . You are rock . You won");
	            else if (a == 2)
	            System.out.println("The Computer is Scissor . You are paper . You lose");
	            else 
	            System.out.println("Please input instructed values only");
	        }
	        else if (r1 == 1){
	            if (a == 0)
	            System.out.println("The Computer is rock . You are scissor . You lose");
	            else if (a == 1)
	            System.out.println("The Computer is rock . You are rock too . It is a draw");
	            else if (a == 2)
	            System.out.println("The Computer is rock . You are paper . You won");
	            else 
	            System.out.println("Please input instructed values only");
	        }
	        else if (r1 == 2){
	            if (a == 0)
	            System.out.println("The Computer is paper . You are scissor . You won");
	            else if (a == 1)
	            System.out.println("The Computer is paper . You are rock  . You lose");
	            else if (a == 2)
	            System.out.println("The Computer is paper . You are paper . It is a draw");
	            else 
	            System.out.println("Please input instructed values only");
	        }

	}

}
