class a{
	
	int y=20;
	void s()
	{
	System.out.println("hello");
	}
	void s1()
	{int x=10;
	System.out.println(x);
	System.out.println("s1 from class a");
	}
}
class b
{   int x=10;
	void s2()
	{
	System.out.println(x);
	}
			void s1()
	{ int x=10;
	System.out.println("s1 from B");
	System.out.println(x);
	}
}
class c extends a,b//not possible so gives error
{
	void s3()
	{
		System.out.println("1234");
	}

}
class abtoc
{   public static void main(String args[])
	{
		c obj=new c();
		obj.s1();
		
		
		
	}
}