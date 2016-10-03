package com.wipro.bubble;



import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String[] args) {
		BubbleSort b=new BubbleSort();
		b.add();
		

	}
	
	public void add()
	{	BubbleSort b=new BubbleSort();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements to add: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int i=0;
		int temp=0;
		for( i=0;i<n;i++)
		{
			System.out.println("Enter element "+(i+1)+":");
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements added successfully.");
		System.out.println("Unsorted array: ");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		boolean flag=false;
		for( i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i;j++)
			{
				if(arr[j-1]>arr[j])
				{
				 temp = arr[j-1];
				 arr[j-1]=arr[j];
				 arr[j]=temp;
				 flag=true;
				}
				
			}
			if(flag==false)
			{
				break;
			}
			else
				flag=false;
			
		}
		System.out.println("Sorted array: ");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		
		
	}

}
