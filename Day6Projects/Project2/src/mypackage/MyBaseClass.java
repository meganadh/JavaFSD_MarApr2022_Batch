package mypackage;

public class MyBaseClass
{
	public int a;
	private int b;
	protected int c;
	int d;
	
	public void myBaseClassMethod()
	{
		a=5;
		b=10;
		c=15;
		d=20;
	}
}

class MyDerivedClass extends MyBaseClass
{
	public void myDerivedClassMethod()
	{
		a=5;
		b=10;
		c=15;
		d=20;
	}
}

class MyOtherClass
{
	public void MyOtherClassMethod()
	{
		MyBaseClass mb = new MyBaseClass();
		mb.a=5;
		mb.b=5;
		mb.c=5;
		mb.d=5;
	}
}