package mypackage;

import java.util.*;

public class MyClass 
{
	public static void main(String[] args) 
	{
		//Variable declaration
		Scanner obj = new Scanner(System.in);
		String name;
		float salary;
		int age;
		
		
		//Read Data from user
		System.out.println("Enter your name:");
		name=obj.nextLine();
		
		System.out.println("Enter your salary:");
		salary = obj.nextFloat();
		
		System.out.println("Enter your Age:");
		age = obj.nextInt();
		
		
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Salary = "+salary);
		

	}

}
