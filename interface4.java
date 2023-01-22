interface abc
{
	int a=10;
	int b=20;
	void s();
	void s1();
}
class xyz implements abc
{
	public void s()
	{
		int c=a+b;
		System.out.println(c);
	}
	public void s1()
	{
	int c=a+b;
	System.out.println(c);
	}
}
interface bcd extends abc
{
	int a=10;
	int b=20;
	void s2();
	void s3();
}
class wxy implements bcd
{
	public void s2()
	{
		int c=a-b;
		System.out.println(c);
	}
	public void s3()
	{
		int c=a/b;
		System.out.println(c);
	}
	public void s()
	{
		System.out.println("hello");
	}
	public void s1()
	{
		System.out.println("hi");
	}
}
public class interface4
{
	public static void main(String args[])
	{
		xyz x1=new xyz();
		x1.s();	
		x1.s1();
	}
}
//	abc--->bcd
//	\        \
//	 \>xyz    \>wxy
//so,wxy should have all methods of abc and bcd