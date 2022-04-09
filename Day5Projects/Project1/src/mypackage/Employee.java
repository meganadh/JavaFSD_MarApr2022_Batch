package mypackage;

import java.util.Scanner;

public class Employee 
{
	public int id;
	public String name;
	public int salary;
		
	public Employee(int id, String name, int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public void readData()
	{		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter id:");
		id=Integer.parseInt(obj.nextLine());
		System.out.println("Enter name:");
		name=obj.nextLine();
		System.out.println("Enter salary:");
		salary=Integer.parseInt(obj.nextLine());
		//obj.close();
	}
	
	public void printData()
	{
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);			
	}
}
