package com.madhu.banglrdays;

public class DemoFinally 
{
	class A
	{
		int a=5,i;
		A(int X)
		{
			i=x;
		}
		void f()
		{
			System.out.println("hai");
			try
			{
				System.out.println(a/i);
			}
			finally
			{
				System.out.println("bye");
			}
		}
	}
	public class DemoFinally
	{
		public static void main(String[]args)
		{
			A ob=new A(1);
			ob.f();
			System.out.println("exit");
			
		}
	}
	
