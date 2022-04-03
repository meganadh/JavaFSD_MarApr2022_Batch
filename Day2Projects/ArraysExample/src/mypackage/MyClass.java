package mypackage;

public class MyClass 
{
	public static void main(String[] args) 
	{
		int[] data = new int[] {12,55,44,99,60,19};
	
		int big=data[0];
		
		for(var d:data)
		{
			if(d>big)
				big=d;
		}
		System.out.println("Big ="+big);

	}
}
