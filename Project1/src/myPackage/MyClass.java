package myPackage;

import java.util.Scanner;

public class MyClass 
{
	public static void main(String[] args) 
	{		
		String name;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		name=obj.nextLine();
		
		System.out.println("Your name is "+name);

	}
}
