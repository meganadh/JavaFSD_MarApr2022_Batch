package mypackage;

import java.util.Scanner;

public class MyClass 
{

	public static void main(String[] args) 
	{
		//Variable declaration
		int input;
		Scanner obj = new Scanner(System.in);
		String result;

		//Read value from user
		System.out.println("Enter any number:");
		input=obj.nextInt();
		
		//Logic
		/*
		if(input%2==0)
			result="Even number";
		else
			result="Odd number";
		*/
		
		result = (input%2==0)?"Even number":"Odd Number";
		
		System.out.println(result);
		
		

		
	}

}
