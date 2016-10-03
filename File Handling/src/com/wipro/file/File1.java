package com.wipro.file;

import java.io.File;
import java.io.IOException;




public class File1 {

	public static void main(String[] args) throws IOException  
	{
		
		File fis=null;
		fis=new File("d:\\Puja");
		fis.mkdir();
		if(fis.exists())
		{
			String f3[]=fis.list();
			System.out.println("Inside if");
			for(int i=0;i<f3.length;i++)
			{
				System.out.println(f3[i]);
				File f1=new File("f3[i]");
				if(f1.isFile())
				{
					System.out.println(":is a file");
				}
				if(f1.isDirectory())
				{
					System.out.println(" :is a directory.");
					//namelist(f1);
				}
			}
		
		}
		else
			System.out.println("File not found");
}
}

