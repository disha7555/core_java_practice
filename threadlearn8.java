import java.lang.*;
import java.io.*;
class thread implements Runnable
{
	Thread t1=new Thread(this);
	public void thread()
	{
		t1.start();
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("abc="+t1.getName()+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class threadlearn8
{
	public static void main(String args[]) throws Exception
	{
		thread a1=new thread();
		a1.t1.start();
		thread a2=new thread();
		a2.t1.start();
			a1.t1.setName("m");
			a2.t1.setName("n");
		try
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println("abcnew="+i);
				Thread.sleep(500);
			}
		}
		catch(Exception f)
		{
			System.out.println(f);
		}
	}
}
		