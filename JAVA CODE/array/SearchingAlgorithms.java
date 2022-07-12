package array;

import java.util.Scanner;

public class SearchingAlgorithms {
	
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,60,50,90,80,70,100};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element to search: ");
		int n=sc.nextInt();
		linearSearch(arr, n);
		
	}

	public static void linearSearch(int arr[], int x)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				System.out.println("Element found at index "+i);
				return;
			}
		}
		System.out.println("Element not found");
		
	}
}
