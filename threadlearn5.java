class abc extends Thread
{
public void abc() 
{
start();
}
public void run()
{
for(int i=0;i<=20;i++)
{
	try
	{
System.out.println("abc="+i);
Thread.sleep(1000);
	}
	catch(Exception e)
	{
	}
}
}
}
class threadlearn5
{
	public static void main(String args[]) throws Exception
	{
		abc a1=new abc();
		a1.start();
		for(int i=0;i<=20;i++)
		{
		System.out.println("abcnew="+i);
		Thread.sleep(500);
		}
		a1.join();
		System.out.println("finish");
		
	}
}
