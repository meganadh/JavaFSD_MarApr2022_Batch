package mypackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MyClass 
{
	public static void main(String[] args) throws IOException 
	{
		//Step-1 : Create file object
		File f = new File("F:\\MyFiles\\Scores.txt");
		FileReader fr = new FileReader(f);
		
		//read the first character in ascii number
		int i=fr.read();
		
		while(i!=-1)
		{
			System.out.print((char)i);
			i=fr.read();
		}
		fr.close();

	}
}







