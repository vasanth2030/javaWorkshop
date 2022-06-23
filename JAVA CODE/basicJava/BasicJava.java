package basicJava;

import java.util.Scanner;

public class BasicJava {
	public static void main(String[] args) {
//		this is my first java program  /* ... */
		String name;
		int age;
		float height; 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name: ");
		name=sc.nextLine();
		
		System.out.println("Enter your name again: ");
		String name2= sc.next();
		sc.nextLine();
			
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		
		System.out.println("Enter your height: ");
		height= sc.nextFloat();
		
		System.out.println("Hello world");
		System.out.println("Name: "+name);
		System.out.println("Name2: "+name2);
		System.out.println("Age: "+age);
		System.out.println("Height: "+height+"cm");
	}
}
