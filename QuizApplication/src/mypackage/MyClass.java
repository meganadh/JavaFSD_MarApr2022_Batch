package mypackage;

import java.util.Scanner;

public class MyClass 
{
	public static void main(String[] args) 
	{
		//Variable Declaration
		String name;
		int score=0,ans;
		Scanner obj = new Scanner(System.in);

		//Read name from user
		System.out.println("Enter your name : ");
		name=obj.nextLine();
		
		System.out.println("**************************************");
		System.out.println("Hi "+name+",Welcome to quiz");
		System.out.println("**************************************");
		System.out.println("Q1. Capital of Australia:");
		System.out.println("1. England   2. Canberra   3. Moscow");
		System.out.println("Enter your choice:");
		ans=obj.nextInt();
		if(ans==2)
			score=score+20;
		
		System.out.println("Q2. Capital of Russia:");
		System.out.println("1. England   2. Canberra   3. Moscow");
		System.out.println("Enter your choice:");
		ans=obj.nextInt();
		if(ans==3)
			score=score+20;
		
		System.out.println("Q3. Capital of Ukraine:");
		System.out.println("1. England   2. Canberra   3. Kyiv");
		System.out.println("Enter your choice:");
		ans=obj.nextInt();
		if(ans==3)
			score=score+20;
		
		System.out.println("Q4. Capital of Srilanka:");
		System.out.println("1. Colombo   2. Canberra   3. Moscow");
		System.out.println("Enter your choice:");
		ans=obj.nextInt();
		if(ans==1)
			score=score+20;
		
		System.out.println("Q5. Capital of Bangladesh:");
		System.out.println("1. Colombo   2. Dhaka   3. Moscow");
		System.out.println("Enter your choice:");
		ans=obj.nextInt();
		if(ans==2)
			score=score+20;
		
		if(score>=60)
			System.out.println("Hi "+name+",you are pass with "+score);
		else
			System.out.println("Sorry "+name+",you got only "+score);
		
		obj.next();
	}
}
