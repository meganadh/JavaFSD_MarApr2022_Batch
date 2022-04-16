package mypackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyClass 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("F:\\MyFiles\\Names.txt");
		
		FileWriter fw=new FileWriter(f,true);
		
		fw.write("Meganadh\n");
		
		fw.close();
		
		System.out.println("Writing Success");

	}
}
