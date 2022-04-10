package myOtherPackage;

import mypackage.MyBaseClass;

class OtherPackageDerivedClass extends MyBaseClass
{
	public void otherPackageDerivedClassMethod()
	{
		a=5;
		b=10;
		c=15;
		d=20;
	}
}

class OtherPackageOtherClass
{
	public void otherPackageOtherClassMethod()
	{
		MyBaseClass mb = new MyBaseClass();
		mb.a=5;
		mb.b=5;
		mb.c=5;
		mb.d=5;
	}
}


public class MyClass 
{

}
