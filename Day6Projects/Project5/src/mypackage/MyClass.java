package mypackage;

import java.util.ArrayList;

public class MyClass 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> data = new ArrayList<Integer>();
		
		data.add(10);
		data.add(20);
		data.add(30);
		data.add(40);
		data.add(50);
		data.add(60);
		data.add(70);
		
		data.add(2,35);
		
		System.out.println(data.get(2));
		

	}

}
