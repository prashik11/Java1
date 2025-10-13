package Day1;
import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		
		
		
		//Type Casting = convert data type into another datatype
		//Implicit Casting = Convert lower datatype into higher datatype
		//Explicit casting = Convert higher datatype into smaller one.
		
		//Implicit
		//Int to double
		int a = 10;
		double b = a;
		System.out.println(b);
		
		//Char to float
		char a1 = '2';
		float a2 = a1;
		System.out.println(a2);
		
		//int to float
		int b1 = 10;
		float b2 = b1;
		System.out.println(b2);
		
		//Explicit
		double c = 10.5;
		int d =(int) c;
		System.out.println(d);
		
		//We cannot convert char datatype into boolean
//		char e = '10';
//		boolean f = e;
		
		//We cannot convert boolean datatype into char
//		boolean g = false;
//		char h = g;
		
		
		//Get input from user
		//Using Scanner -------  Class
		//Scanner class helps users to get the input values from users.
		//import java.util.Scanner; ----- Package(complete bundle)
		
		//Scanner sc = new Scanner(System.in) ------  Object
		Scanner sc = new Scanner(System.in);
		
		//For Integer
//		System.out.print("Enter a Number = ");
//		int num1 = sc.nextInt();
//		
//		System.out.print("Enter another Number = ");
//		int num2 = sc.nextInt();
//		
//		int sum = num1 + num2;
//		System.out.println("Sum of two numbers = " + sum);
		
		//For String ---- Single name use next()
		System.out.println("Enter your name = "); 
		String name = sc.next();
		System.out.println("Hello " + name);
		
		
		sc.nextLine();  //------ Consume leftover newline
		
		
		//For String ----- Full name, use nextLine()
		
		System.out.println("Enter Full name = ");
		String fullName = sc.nextLine();
		System.out.println("Hello " + fullName);
		
		
		
		
		
	
		
		


}
}
