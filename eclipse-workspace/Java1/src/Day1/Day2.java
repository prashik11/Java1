package Day1;

import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {

		//Conditional Statements
//		if 
//		if else
//		if else if
//		nested if 	
		
		//if
		
		int originalpassword = 1234;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your password");
		int yourpassword = sc.nextInt();
		if(yourpassword==originalpassword) {
			System.out.println("Password is right");
		}else {
			System.out.println("Password is wrong");
		}
		
		
		
	}

}
