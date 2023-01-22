interface abc
{
	void s();
	void s1();
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
class pqr implements abc
{
	public void s()
{
	System.out.println("bad");
	}
	public void s1()
	{
	System.out.println("very bad");
	}
}
public class interface1{	
	public static void main(String args[])
		{
			
		xyz x=new xyz();
		pqr p=new pqr();
		x.s();
		x.s1();
		p.s();
		p.s1();
		}
}
	
