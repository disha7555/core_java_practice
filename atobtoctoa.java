class a extends c{ //gives error due to having cyclic inheritence is not allowed
	
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
class b extends a
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
class c extends b//not possible so gives error
{
	void s3()
	{
		System.out.println("1234");
	}

}
class atobtoctoa
{   public static void main(String args[])
	{
		c obj=new c();
		obj.s1();
		
		
		
	}
}