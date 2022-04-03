package mypackage;

import java.util.Scanner;

public class MyClass 
{
	public static void main(String[] args) 
	{
		//Variable declaration
		int input;
		Scanner obj = new Scanner(System.in);
		int counter=0;
		
		//Read value from user
		System.out.println("Enter any number:");
		input=obj.nextInt();

		//Actual Logic
		for(int i=1;i<=input;i++)
		{
			if(input%i==0)
				counter++;				
		}
		
		if(counter==2)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}

}
