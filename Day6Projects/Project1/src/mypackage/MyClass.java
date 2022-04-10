package mypackage;

abstract class Salary
{
	public int getHRA(int basic)
	{
		return 40*basic/100;
	}
	public int getPF(int basic)
	{
		return 12*basic/100;
	}
	public abstract int getCA();
	public abstract int getSA();
}


class Microsoft extends Salary
{

	@Override
	public int getCA() {
		return 12000;
	}

	@Override
	public int getSA() {
		return 18000;
	}
	
	public int getCovidAssistance()
	{
		return 6000;
	}
	
}

class Google extends Salary
{

	@Override
	public int getCA() {		
		return 25000;
	}

	@Override
	public int getSA() {
		return 30000;
	}
	
}

public class MyClass 
{
	public static void main(String[] args) 
	{
		Salary s = new Microsoft();
		
		System.out.println(s.getCA());
		
		System.out.println(s.getSA());
		
		System.out.println(s.getCovidAssistance());

	}
}





