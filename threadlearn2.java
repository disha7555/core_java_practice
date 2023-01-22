class abc extends Thread
{
	public void abc() 
{
start();
}
public void run()
{
int count=0;

	try
	{
		for(int i=0;i<=20;i++)
		{
		System.out.println("abc="+getName()+i);
		Thread.sleep(500);
	}}
	catch(Exception e)
	{
	}
}
}
class threadlearn2
{
	public static void main(String args[]) throws Exception
	{
		abc a1=new abc();
		a1.start();
		abc a2=new abc();
		a2.start();
		abc a3=new abc();
		a3.start();
		a1.setName("x");    
        a2.setName("y");  
		a3.setName("z");  
		
	}
}
