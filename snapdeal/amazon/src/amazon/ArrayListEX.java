package amazon;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEX {

	public static void main(String[] args)
	{
		ArrayList<String>a1=new ArrayList<String>();
		a1.add("java");
		a1.add("php");
		a1.add("perl");
		a1.add("c++");
		a1.add("cobal");
		System.out.println(a1);
		System.out.println("does this list contains java"+a1.contains("java"));
		a1.add(2,"python");
		System.out.println(a1);
		System.out.println(a1.isEmpty());
		System.out.println(a1.size());
		Iterator<String>itr=a1.iterator();
		while(itr.hasNext());
		{
			System.out.println(itr.next());
		}
	}
}
	


		
	


