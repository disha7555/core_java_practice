class abc
{

 synchronized void s()
{
	try
	{
		System.out.println("hi");
		Thread.sleep(500);
		System.out.println("bye");
	}
	catch(Exception e)
	{
	}
	
}
}
class xyz implements Runnable
{
	Thread t1=new Thread(this);
	abc a1;
	xyz(abc a)
	{ 
		t1.start();
		a1=a;
	}
	public void run()
	{
		
		
		a1.s();
		
	}
}
public class threadlearn16
{
	public static void main(String args[]) throws Exception
	{
		
		abc a=new abc();
		xyz x=new xyz(a);
		xyz x1=new xyz(a);
		xyz x2=new xyz(a);
		xyz x3=new xyz(a);
	}
}

