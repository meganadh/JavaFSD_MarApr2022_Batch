package mypackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class MyClass 
{
	public static void main(String[] args) 
	{
		TreeMap<String,Integer> marks = new TreeMap<String,Integer>();
		
		marks.put("Maths", 99);
		marks.put("English", 92);
		marks.put("Science", 91);
		marks.put("Social", 87);
		marks.put("Social", 80);
		
		System.out.println(marks.get("Social"));
		System.out.println(marks.size());
		
		var Subjects = marks.keySet();
		for(var s:Subjects)
			System.out.println(s);
		
	}
}
