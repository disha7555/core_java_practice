class try_catch_flow
{
	public static void s()
	{
		try
		{
			System.out.println("s");
			s1();
			System.out.println("as");
		}
		catch(Exception e)
		{
			System.out.println("e");
			throw e;
		}
	}
	public static void s1()
	{
		try
		{
			System.out.println("s1");
			s2();
			System.out.println("as1");
		}
		catch(Exception e1)
		{
			System.out.println(e1);
			throw e1;
		}
	}
	public static void s2()
	{
		try
		{
			int c=1/0;
			System.out.println(c);
		}
		catch(Exception e2)
		{
			System.out.println(e2);
			throw e2;
		}
	}
	public static void main(String args[])
	{
	  try{
		s();
	     }
	catch(Exception e4)
	{
		throw e4;
	}
	}
}
			
//if you use throw in s2 then it will propogate to s1 ,due to it is called in s1
//if you use throw in s1 also it will propogate to s,due to it is called in s1
//