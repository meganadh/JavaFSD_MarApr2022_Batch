package mypackage;

import java.util.Scanner;

public class Product 
{
	public int id;
	public String name;
	public int price;
	public static String company="Microsoft";
	
	public static void printCompany()
	{
		System.out.println(company);	
		
		
	}
	
	public Product()
	{
		id=0;
		name=null;
		price=0;
	}
	
	public Product(int pid, String pname,int pprice)
	{
		id=pid;
		name=pname;
		price=pprice;
	}
	
	public void readData()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter product id:");
		id=Integer.parseInt(obj.nextLine());
		System.out.println("Enter product name:");
		name=obj.nextLine();
		System.out.println("Enter price:");
		price=Integer.parseInt(obj.nextLine());
	}
	
	public void printData()
	{
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Price : "+price);
		System.out.println("Company : "+company);
	}
}
