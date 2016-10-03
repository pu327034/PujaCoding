package com.wipro.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
				FileReader fr;
				try {
					fr = new FileReader("d:\\puj.txt");
					FileWriter fw=new FileWriter("har.txt");
					int ch;
					System.out.println("start");
					while((ch=fr.read())!=-1)
					{
						fw.write(ch);
					}
					System.out.println("done");
					fr.close();
					fw.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				

	}

}
