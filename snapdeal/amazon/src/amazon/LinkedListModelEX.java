package amazon;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Comparator;
public class LinkedListModelEX {
public static void main(String[] args)
	{
		LinkedList<Empl> list=new LinkedList<Empl>();
		class MySalarycomp implements
		Comparator<Empl>
		{
			public int compare(Empl e1,Empl e2)
			{
				if(e1.getsalary()<e2.getSalary())
{
			}
		}
		
		class Emp1
{
	private String name;
	private int salary;
	public Emp1(String n,int s)
	{
		this.name=n;
		this.salary=s;
	}
public String getName() 
{
	return name;
}

public void setName(String name)
{
	this.name = name;
}

public int getSalary()
{
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}
public String toString()
{
	return "Name:"+this.name+"Salary:"+this.salary; 
}
}
		}

