package basicJava;

import java.util.Scanner;

public class JavaMethods {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num= sc.nextInt();
		
		multiplicationTable(num);
		
	}
	
	public static void multiplicationTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"x"+i+" = "+ (n*i));
		}
	}
}
