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
class threadlearn13
{
	public static void main(String args[]) throws Exception
	{
		try{
		abc a1= new abc(500);
		abc a2=new abc(500);
		//abc a3=new abc(0);
		a1.setName("x");    
        a2.setName("y");  
		//a3.setName("z");  
		}
		catch(Exception e)
		{
			System.out.println("e");
		}
	}
}

