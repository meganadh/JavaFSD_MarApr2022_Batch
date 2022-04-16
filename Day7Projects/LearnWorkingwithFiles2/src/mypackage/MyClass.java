package mypackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MyClass 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner obj = new Scanner(System.in);
		String subject;
		System.out.println("Enter subject name:");
		subject=obj.nextLine();
		boolean isFound=false;
		
		//Step-1 : Create file object
		File f = new File("F:\\MyFiles\\Scores.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br =new BufferedReader(fr);
		
		//read first line
		String line = br.readLine();
		
		while(line!=null)
		{
			var data=line.split(",");
			if(data[0].equals(subject))
			{
				System.out.println(data[1]);
				isFound=true;
				break;
			}			
			line=br.readLine();
		}
		br.close();

		if(isFound==false)
			System.out.println("Subject not found");
	}

}
