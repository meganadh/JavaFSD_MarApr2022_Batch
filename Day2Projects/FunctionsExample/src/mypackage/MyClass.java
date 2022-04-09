package mypackage;

public class MyClass 
{
	public static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
			fact=fact*i;
		return fact;
	}
	
	public static void main(String[] args) 
	{
		int n1=7,n2=5,n3=4;
		System.out.println("Factorial of "+n1+" = "+factorial(n1));
		System.out.println("Factorial of "+n2+" = "+factorial(n2));
		System.out.println("Factorial of "+n3+" = "+factorial(n3));

	}
}
