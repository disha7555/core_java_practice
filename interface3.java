interface abc   //this prog. will give error due to having same variable a in both interface with different values
{	int a=10;
	void s();
	void s1();
}
interface mnp
{	int a=50;
	void m();
	void s();
}
class xyz implements abc
{
	public void x()
	{
		System.out.println("hello");
	}
	public void y()
	{
		System.out.println("good morning");
	}
	public void s()
	{
	System.out.println("good night");
	}
	public void s1()
	{
	System.out.println("good noon");
	}
}
class pqr implements abc,mnp
{
	public void s()
{
	System.out.println(a);
	}
	public void s1()
	{
	System.out.println("very bad");
	}
	public void m()
	{
	System.out.println("60");
	}
}
class interface3{	
	public static void main(String args[])
	{
			
			xyz x=new xyz();
			pqr p=new pqr();
			x.s();
			x.s1();
			p.s();
			p.s1();
			p.m();
	}
}
	
