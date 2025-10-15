package Day1;

import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {

		//Conditional Statements
//		if 
//		if else
//		if else if
//		nested if 	
		
		//if else
		
//		int originalpassword = 1234;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter your password");
//		int yourpassword = sc.nextInt();
//		if(yourpassword==originalpassword) {
//			System.out.println("Password is right");
//		}else {
//			System.out.println("Password is wrong");
//		}
		
		
		//Calculator Using Nested IF 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num1 = sc.nextInt();
		System.out.println("Enter a second number");
		int num2 = sc.nextInt();
		
		System.out.println("Which operation do you want to perform +, -, *, / ");
		char op= sc.next().charAt(0);
		
		if(op=='+') {
			int sum = num1+num2;
			System.out.println(num1 + "+" + num2 +"="+ sum);
			
		}
		
	}

}
