package basicJava;

import java.util.Scanner;

public class ConditionalStatements {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		switch(n)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Enter a number between 1-7");			
		}
		
//		if(age>18 && age<30)
//			System.out.println("Young adult");
//		else if(age>30)
//		{
//			System.out.println("Adult");
//		}
//		else {
//			System.out.println("Child");
//		}
		
//		String result=age>18?"Adult":"Child";
//		
//		System.out.println(result);
	}
}
