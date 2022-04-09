
class EnglishMessage
{
	public void sayHi()
	{
		System.out.println("Hi");
	}
	public void sayHello()
	{
		System.out.println("Hello");
	}
	public void sayGM()
	{
		System.out.println("Good morning");
	}
}

class HindiMessage extends EnglishMessage
{
	@Override
	public void sayGM()
	{
		System.out.println("Shubodhay");
	}
}

public class MyClass 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}
}
