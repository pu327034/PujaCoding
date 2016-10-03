package com.wipro.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Assignment2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name: ");
		String s=sc.next();
		System.out.println("Enter the character to be counted: ");
		String c=sc.next();
		int count=0;
		FileReader file=null;
		try {
			file = new FileReader(s);
			int ch;
			
			while((ch=file.read())!=-1)
			{char d=(char) ch;
				if(d==c.charAt(0))
				{
					count++;
				}
				
			}
			System.out.println("File "+s+" has "+count+" instances of "+c);
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		

	}

}
