package mypackage;

import java.util.Scanner;

public class MyClass 
{

	public static void main(String[] args) 
	{
		//Variable declaration
		int input;
		Scanner obj = new Scanner(System.in);
		int sum=0;
		

		//Read value from user
		System.out.println("Enter any number:");
		input=obj.nextInt();
			
		//Find sum of n natural number
		for(int i=1;i<=input;i++)
			sum+=i;
		
		System.out.println(sum);
			

	}

}
