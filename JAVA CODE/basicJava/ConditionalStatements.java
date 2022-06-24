package basicJava;

import java.util.Scanner;

public class ConditionalStatements {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		
//		if(age>18 && age<30)
//			System.out.println("Young adult");
//		else if(age>30)
//		{
//			System.out.println("Adult");
//		}
//		else {
//			System.out.println("Child");
//		}
		
		String result=age>18?"Adult":"Child";
		
		System.out.println(result);
	}
}
