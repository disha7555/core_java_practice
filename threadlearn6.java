class abc implements Runnable
{
		
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
	class threadlearn6
	{
	public static void main(String args[]) throws Exception
	{
		abc a1=new abc();
		Thread t=new Thread(a1);
		t.start();
		//a1.start();
		
	}
}
