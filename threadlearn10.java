import java.lang.*;
import java.io.*;
class thread implements Runnable
{
	Thread t1=new Thread(this);
	thread()
	{
		t1.start();
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("print this="+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class threadlearn10
{
	public static void main(String args[]) throws Exception
	{
		thread a1=new thread();
		try
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println("abcnew="+i);
				Thread.sleep(500);
				
			}
			System.out.println("finish");
		}
		catch(Exception f)
		{
			System.out.println(f);
		}
	}
}
		