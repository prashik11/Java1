package Day1;

import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		
		// for loop is use for multiple conditions and if the no of iteration is fixed, it is recommended to use for loop.
		// print a number 1 to 10
		
//		for(int a = 1 ; a<=10 ; a++) {
//			System.out.println(a);
//		}
//		
//		//Print 9 table
//		for(int b = 9 ; b<=90 ; b=b+9) {
//		    System.out.println(b);	
//		}
		
		//Nested Loop
		for(int c = 1 ; c<=3 ; c++) {
			for(int d =1 ; d<=3 ; d++) {
				System.out.println(c+" "+d);
			}
		}
		
		// Sum of odd numbers
		int sum = 0;
        int a = 2;
        
        while(a<=10) {
        	sum = sum+a;
            a =a +2;
        	
        }
        
        System.out.println(sum);
        
        //sum of first n natural number
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum1 = 0;
        for(int b = 1 ; b<=number; b++) {
        	sum1 = sum1 + b;
        }
   
        System.out.println(sum1);
	}

}
