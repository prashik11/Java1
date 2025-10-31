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
/*		System.out.println("Enter a number = ");
		int num1 = sc.nextInt();
		System.out.println("Enter a second number");
		int num2 = sc.nextInt();
		
		System.out.println("Which operation do you want to perform +, -, *, / ");
		char op= sc.next().charAt(0);
		
		if(op=='+') {
			int sum = num1+num2;
			System.out.println(num1 + "+" + num2 +"="+ sum);	
		}
		else if(op=='-'){
			int sub = num1 - num2;
			System.out.println(num1 + "-" + num2 + "=" + sub);
		}
		else if(op=='*') {
			int multiply = num1 * num2;
			System.out.println(num1 + "*" + num2 + "=" + multiply);
		}
		else if(op=='/') {
			int div = num1 / num2;
			System.out.println(num1 + "/" + num2 + "=" + div );
	}*/	
		
		//Check weather given number is positive or negative.
		//Call Scanner object
	/*	System.out.println("Enter a number = ");
		int a=sc.nextInt();
		if( a>0) {
			System.out.println("Given number is positive");
		}
		else if(a<0) {
			System.out.println("Given number is negative");
		}
		else {
			System.out.println("Given number is zero");
		}    */
		
		//Check weather given number is even or odd.
	/*	System.out.println("Enter a number");
		int b = sc.nextInt();
		if(b%2==0) {
			System.out.println("Given number is even");
		}
		else {
			System.out.println("Given number is odd");
		}    */
		
		
		//Takes marks and shows the grade
//		System.out.println("Enter marks");
//		//Call sc object 
//		System.out.println("Enter English Marks = ");
//		int Eng = sc.nextInt();
//		System.out.println("Enter Computer Marks = ");
//		int Com = sc.nextInt();
//		int Total = Eng+Com;
//		if(Total>=90 && Total>=90 ) {
//			System.out.println("Your Grade is A");
//		}
//		else if(Total>=80 && Total<=90) {
//			System.out.println("Your Grade is B");
//		}
//		else if(Total>=70 && Total<=80) {
//			System.out.println("Your Grade is C");
//		}
//		else if(Total>=60 && Total<=70) {
//			System.out.println("Your Grade is D");
//		}
//		else {
//			System.out.println("Your are fail");
//		}
		
		
		//Switch Case
		//When have many conditions that time we are use Switch Case statement because its readiable
		
		//Check the enter characters is vowels are not?
		//System.out.println("Enter the alphabet");
		//Call scanner object
		
//		char value = sc.next().charAt(0);
//	    
//		switch(value) {
//		case 'a' : System.out.println("you enter A vowel");
//		break;
//		case 'e' : System.out.println("you enter e vowel");
//		break;
//		case 'i' : System.out.println("you enter i vowel");
//		break;
//		case 'o' : System.out.println("you enter o vowel");
//		break;
//		case 'u' : System.out.println("you enter u vowel");
//		break;
//	
//		default :
//		System.out.println("This is not vowels");
//		}
		
//		System.out.println("Enter marks");
//		//call scanner class 
//		System.out.println("Enter English marks");
//		int eng = sc.nextInt();
//		System.out.println("Enter Hindi marks");
//		int hindi = sc.nextInt();
//		System.out.println("Enter Marathi marks");
//		int mar = sc.nextInt();
//		
//		int total = eng+hindi+mar;
//		
//		switch(total/10) {
//		case 10:
//	    case 9:
//	        System.out.println("Your grade is A");
//	        break;
//	    case 8:
//	        System.out.println("Your grade is B");
//	        break;
//	    case 7:
//	        System.out.println("Your grade is C");
//	        break;  
//	    default:
//	        System.out.println("You are fail");
//		}
		
		
		//Parking fee for vehicle types.
		System.out.println("Enter vehicle type");
		//call scanner class.
		String vehicle = sc.nextLine();
		int fees = 0;
		switch (vehicle) {
		case "Car" : 
			fees = 50;
			break;
		case "Truck" : 
			fees = 100;
			break;
		case "Bike" :
			fees = 20;
			break;
		case "Auto" :
			fees = 30;
			break;
		default :
			System.out.println("Unknown parking type");
		}
		
		System.out.println("parking fees for " + vehicle +" "+ fees );
		
	}
	
	
	
	
  }	

	   



