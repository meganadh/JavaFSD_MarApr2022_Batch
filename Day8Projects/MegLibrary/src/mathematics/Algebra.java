package mathematics;

public class Algebra 
{
	public int add(int a, int b)
	{
		return a+b;
	}
	public int mul(int a, int b)
	{
		return a*b;
	}
	public int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
			fact*=i;
		return fact;
	}
}
