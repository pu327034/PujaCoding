package com.wipro.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestObjectives {
	
	
		public static void main(String[] args) throws IOException {
			
			File file=new File("d:\\Puja");
			TestObjectives to=new TestObjectives();
			to.fileList(file);


	}
		public void fileList(File file1)
		{
			
			   // File[] rootDirectories = file.listRoots();
				File[] root=file1.listFiles();
			    System.out.println("Available root directories:");
			    for (int i = 0; i < root.length; i++) {
			      System.out.println(root[i]);
			      if(root[i].isDirectory())
			      {
			    	 fileList(root[i]);
			      }
			    }
		}
}
