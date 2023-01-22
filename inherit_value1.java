class abc
{ 
	int a;
	
		void s()
		{
			System.out.println(a);
		}	
		
}
class xyz extends abc
{
	void s1()
	{
	System.out.println(a);
	}
}

class inherit_value1
{
	public static void main(String args[])
	{
		abc a1=new abc();
		a1.s();
		xyz x=new xyz();
		x.s();
		x.s1();
	}
}

	