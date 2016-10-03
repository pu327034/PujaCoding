package com.wipro.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Assignment4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File f=new File("d:\\pu.txt");
		TreeMap<String,Integer> hash=new TreeMap<String,Integer>();
		try {
			Scanner sc=new Scanner(f);
			while(sc.hasNext())
			{String s=sc.next();
				if(hash.containsKey(s))
				{
					int i=hash.get(s);
					hash.put(s, i+1);
				}
				else
				{
					hash.put(s, 1);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			PrintStream ps=new PrintStream("d:\\p.txt");
			Set<String> d=hash.keySet();
			Iterator<String> it=d.iterator();
			while(it.hasNext())
			{
				String c=it.next();
				System.out.println(c+" : "+ hash.get(c));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
