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
				System.out.println("thread2: "+i);
				Thread.sleep(500);
		
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class threadlearn14
{
	public static void main(String args[]) throws Exception
	{
		thread a1=new thread();
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("thread1: "+i);
				Thread.sleep(500);
				if(i==4)
				{
					a1.t1.suspend();
				}
			}
			a1.t1.join();
			System.out.println("finish");
		}
		catch(Exception f)
		{
			System.out.println(f);
		}
	}
}
		