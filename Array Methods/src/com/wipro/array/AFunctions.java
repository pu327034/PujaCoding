package com.wipro.array;

import java.util.Arrays;

public class AFunctions {

	public static void main(String[] args) {
		int[] a={1,2,3,4,5};
		//use of fill function
		for(int i:a)
		{
		System.out.print(i);
		}
		System.out.println();
		Arrays.fill(a, 2);
		for(int i:a)
		{
		System.out.print(i);
		}
		System.out.println();
		Arrays.fill(a, 0, 2, 3);
		Arrays.fill(a, 3, 4, 4);
		for(int i:a)
		{
		System.out.print(i);
		}
		System.out.println();
		//use of ArrayCopy
		int b[]={6,7,8,9,10};
		System.arraycopy(a, 0, b, 0, 4);
		for(int i:b)
		{
		System.out.print(i);
		}
		//use of CopyOf
		int c[]=Arrays.copyOf(a, 4);
		System.out.println();
		for(int i:c)
		{
		System.out.print(i);
		}
		//use of Arrays.equals
		System.out.println();
		System.out.println(Arrays.equals(a, c));
		//use of CopyOfRange
		int d[]=Arrays.copyOfRange(b, 0, 5);
		for(int i:d)
		{
		System.out.print(i);
		}

	}

}
