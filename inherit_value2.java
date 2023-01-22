class abc
{ 
	int a=50;
	
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

class inherit_value2
{
	public static void main(String args[])
	{
		abc a1=new abc();
		a1.s();
		xyz x=new xyz();
		x.s();
		x.s1();
		//xyz x=new xyz();
		//x.s();
	//;	x.s1();
	}
}

	