class abc implements Runnable
{
Thread t1=new Thread(this);
boolean b=false;
abc()
{
t1.start();
}
public void run()
{
	try{
		
for(int i=1;i<=10;i++)
			{
				System.out.println(i);
				Thread.sleep(500);
				synchronized(this)
				{
					while(b)
					{
						wait();
					}
				}
			}
	}
	catch(Exception e)
	{
	}
	
}
void sus()
{
	b=true;
}
void res()
{
	b=false;
	notifyAll();
}}
public class pattern_thread 
{
	public static void main(String args[]) throws Exception
	{
		abc a1=new abc();
		abc a2=new abc();
		Thread.sleep(2000);
		a1.sus();
		Thread.sleep(3000);
		a1.res();
		a2.sus();
		Thread.sleep(2000);
		a2.res();
		Thread.sleep(3000);
	}
}