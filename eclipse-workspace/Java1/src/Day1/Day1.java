package Day1;
import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		
		
		
		//Type Casting = convert data type into another datatype
		//Implicit Casting = Convert lower datatype into higher datatype
		//Explicit casting = Convert higher datatype into smaller one.
		
		//Implicit
		//Int to double
//		int a = 10;
//		double b = a;
//		System.out.println(b);
//		
//		//Char to float
//		char a1 = '2';
//		float a2 = a1;
//		System.out.println(a2);
//		
//		//int to float
//		int b1 = 10;
//		float b2 = b1;
//		System.out.println(b2);
//		
//		//Explicit
//		double c = 10.5;
//		int d =(int) c;
//		System.out.println(d);
		
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
//		System.out.println("Enter your name = "); 
//		String name = sc.next();
//		System.out.println("Hello " + name);
		
		
		//sc.nextLine();  //------ Consume leftover newline
		
		
		//For String ----- Full name, use nextLine()
		
//		System.out.println("Enter Full name = ");
//		String fullName = sc.nextLine();
//		System.out.println("Hello " + fullName);
		
		//10 methods present in Scanner class.
		
		//Int
//		System.out.println("Enter Number");
//		int a3 = sc.nextInt();
//		System.out.println("Enter another number");
//		int a4 = sc.nextInt();
//		
//		int substract = a3-a4;
//		System.out.println("Sub of two number = " + substract);
		
		//Float
//		System.out.println("Enter no");
//		float a5 = sc.nextFloat();
//		System.out.println("Enter no");
//		float a6 = sc.nextFloat();
//		
//		float sum = a5+a6;
//		System.out.println("Sum of 2 no = "+ sum);  ----- 10.22
		
		//double
//		System.out.println("Enter value");
//		double a7 = sc.nextDouble();
//		System.out.println("Enter value");
//		double a8 = sc.nextDouble();
//		
//		double sum1 = a7+a8;
//		System.out.println("Sum of 2 value = "+ sum1);  ----- 10.55544454
		
		//String
//		System.out.println("Enter first name");
//		String b1 = sc.nextLine();
//		System.out.println("Enter last name");
//		String b2 = sc.nextLine();
//		
//		System.out.println("Full name = "+ b1 +" "+ b2);  ---- Prashik Gawai
		
		
//		String s = "Gfg 9 + 6 = 12.0";
		
		
		//Byte
//		System.out.println("Enter value");
//		byte b3 = sc.nextByte();
//		System.out.println("Enter another value");
//		byte b4 = sc.nextByte();
//		
//		System.out.println(b3+b4);
		
//		byte age = 30; // Declares a byte variable 'age' and assigns it the value 30
//        byte temperature = -5; // Declares a byte variable 'temperature' and assigns it the value -5
//
//        System.out.println("Age: " + age);
//        System.out.println("Temperature: " + temperature);
		
		
//		Not found Byte value :Gfg
//		Found Byte value :9
//		Not found Byte value :+
//		Found Byte value :6
//		Not found Byte value :=
//		Not found Byte value :12.0
		
		//Boolean
		//sc.nextBoolean();
		
		//long
		sc.nextLong();
		
//		Not found Long value :Gfg
//		Found Long value :9
//		Not found Long value :+
//		Found Long value :6
//		Not found Long value :=
//		Not found Long value :12.0
		
		//Short
		sc.nextShort();
		
//		Not found short value :Gfg
//		Found Short value :9
//		Not found short value :+
//		Found Short value :6
//		Not found short value :=
//		Not found short value :12.0

		//BigInteger
		sc.nextBigInteger();
		
//		Not found BigInteger value :G fg
//		Found BigInteger value : 9
//		Not found BigInteger value : +
//		Found BigInteger value : 6
//		Not found BigInteger value : =
//		Not found BigInteger value : 12.0
		
		//BigDecimal
		sc.nextBigDecimal();
		
//		Not found BigDecimal() value :Gfg
//		Found BigDecimal value :9
//		Not found BigDecimal() value :+
//		Found BigDecimal value :6
//		Not found BigDecimal() value :=
//		Found BigDecimal value :12.0
		
	
		
		


}
}
