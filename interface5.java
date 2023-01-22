interface abc
{
	int a=10;
	int b=20;
	void s();
	void s1();
}
interface xyz extends abc
{
	void s2();
	void s3();
	}
class pqr implements xyz
{
	public void x()
	{
	System.out.println(a);
	}
	public void s2()
	{
	System.out.println(a+b);
	}
	public void s3()
	{
	System.out.println(a-b);
	}
	public void s()
	{
	System.out.println(a+b);
	}
	public void s1()
	{
	System.out.println(a-b);
	}
}


public class interface5
{
	public static void main(String args[])
	{
	abc a1=new pqr();
	a1.s();
	a1.s1();
	xyz a2=new pqr();
	a2.s();
	a2.s1();
	a2.s2();
	a2.s3();
	}
}
	
	