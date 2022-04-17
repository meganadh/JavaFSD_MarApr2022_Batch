package mypackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	int id;
	String name;
	int salary;
	
	public Employee(int id, String name, int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}	
}

public class MyClass 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		/* PART-1 : Serialization code */
		/*
		Employee emp = new Employee(101,"Meg",2000);
		
		//Object => FileOutputStream (Serialization)
		FileOutputStream fout = new FileOutputStream("F:\\SL\\JavaFSProjectsMarchApr2022\\SerializationFiles\\Employees.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(emp);
		out.close();
		fout.close();
		
		System.out.println("Serialization is done");
		*/
		
		
		/* Part-2 : Deserialization code */
		FileInputStream fis = new FileInputStream("F:\\SL\\JavaFSProjectsMarchApr2022\\SerializationFiles\\Employees.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee emp = (Employee)ois.readObject();
		System.out.println("Id = "+emp.id);
		System.out.println("Name = "+emp.name);
		System.out.println("Salary = "+emp.salary);
		
		ois.close();
		fis.close();
		
	}
}
