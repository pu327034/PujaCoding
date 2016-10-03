package com.wipro.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the filename: ");
		String s=sc.next();
		File file=new File(s);
		Scanner fileop1;
		try {
			fileop1 = new Scanner(file);

			int line=0;
			while(fileop1.hasNext())
			{
				System.out.println(+line+fileop1.next());
			}
			fileop1.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
			
		
		
		
		

	}

}
