class abc extends Thread
{	int a;
	abc(int x) 
{
	
start();
a=x;
}
public void run()
{
	try
	{
		for(int i=0;i<=10;i++)
		{
		System.out.println("abc="+getName()+i);
		Thread.sleep(a);
		}
	}
	catch(Exception e)
	{
		System.out.println("error:"+e);
	}
}
}
class threadlearn3
{
	public static void main(String args[]) throws Exception
	{
		try{
		abc a1= new abc(1000);
		//a1.abc(500);
		//a1.start();
		//a1.run();
		abc a2=new abc(500);
		//a2.abc(1000);
		//a2.start();
		//a2.run();
		abc a3=new abc(0);
		//a3.abc(1500);
		//a3.start();
		//a3.run();
		a1.setName("x");    
        a2.setName("y");  
		a3.setName("z");  
		}
		catch(Exception e)
		{
			System.out.println("e");
		}
	}
}

