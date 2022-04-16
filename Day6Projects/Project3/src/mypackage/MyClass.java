package mypackage;

interface IShape
{
	int getArea();
	int getPerimeter();
}

class Circle implements IShape
{

	int r;
	
	public int getRadius()
	{
		return 20;
	}
	@Override
	public int getArea() {
		return 22*r*r/7;
	}

	@Override
	public int getPerimeter() {
		return 2*r*22/7;
	}
	
}

class Square implements IShape
{

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class MyClass 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}
}
