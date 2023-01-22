class abc
{ 
	int a=20;
	
		void s()
		{
			System.out.println(a);
		}	
		
}
class xyz extends abc
{ int a=10;
	void s1()
	{
	System.out.println(a);
	}
}

class inherit_value
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

	