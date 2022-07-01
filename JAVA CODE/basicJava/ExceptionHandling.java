package basicJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try {
			System.out.println("Enter two numbers: ");
			int a= sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Division: "+ (a/b));
//			throw new NumberFormatException("Manually thrown exception");
		}catch(ArithmeticException e)
		{
			System.out.println("Inside ArithmeticException catch block");
			System.out.println("Enter a non-zero divisor");
		}catch(InputMismatchException e)
		{
			System.out.println("Inside InputMismatchException catch block");
			System.out.println("Give a proper input");
		}catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Inside exception block");
		}finally {
			System.out.println("Inside finally");
		}
		System.out.println("End of program.");
	}
	
	public static int division(int a, int b) throws ArithmeticException
	{
		int div= a/b;
		return div;
	}

}
