package mypackage;

import java.util.Scanner;

public class MyClass 
{
	public static void main(String[] args) 
	{
		//Variable declaration
		int n,i;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter any number:");
		n=obj.nextInt();
		
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.println(i);
		}

	}
}




