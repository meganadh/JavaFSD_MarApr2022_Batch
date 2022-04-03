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
		int i;
		
		//Read value from user
		System.out.println("Enter any number:");
		input=obj.nextInt();

		//Actual Logic
		for(i=2;i<input;i++)
		{
			if(input%i==0)
				break;				
		}
		
		if(i==input)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");

	}

}
