package array;

import java.util.Scanner;

public class SearchingAlgorithms {
	
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,60,70,80,90,100};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element to search: ");
		int n=sc.nextInt();
		linearSearch(arr, n);
		binarySearch(arr, n);
		
	}

	public static void linearSearch(int arr[], int x)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				System.out.println("Linear Search: Element found at index "+i);
				return;
			}
		}
		System.out.println("Linear Search: Element not found");
		
	}
	
	public static void binarySearch(int arr[],int x)
	{
		int l=0;
		int r=arr.length-1;
		while(l<=r)
		{
			int mid = (l+r)/2;
			if(arr[mid]==x)
			{
				System.out.println("Binary Search: Element found at index "+mid);
				return;
			}
			else if(arr[mid]>x)
			{
				r=mid-1;
			}
			else
			{
				l=mid+1;
			}
		}
		System.out.println("Binary Search: Element not found");
	}
}
