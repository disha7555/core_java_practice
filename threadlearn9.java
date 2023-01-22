import java.lang.*;
import java.io.*;
class abc implements Runnable
{	int a;
	Thread t1=new Thread(this);
	abc(int x)
	{
		t1.start();
		a=x;
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("abc="+t1.getName()+i);
				Thread.sleep(a);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class threadlearn9
{
	public static void main(String args[]) throws Exception
	{
		try
		{
		abc a1=new abc(1000);
		
		abc a2=new abc(500);
		a1.t1.setName("m");
		a2.t1.setName("n");
		}
		catch(Exception f)
		{
			System.out.println(f);
		}
	}
}
		