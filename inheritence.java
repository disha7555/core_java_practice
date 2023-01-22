class a{
	int x=10;
	int y=20;
	void s()
	{
	System.out.println("hello");
	}
	void s1()
	{
	System.out.println("s1 from class A");
	}
}
class b extends a
{
	void s2()
	{
	System.out.println(x);
	}
			void s1()
	{super.s1();//if s1 is called then it will take s1 from super class a,not from b(done to do overriding)
	System.out.println("s1 from B");
	}
	

}
class inheritence
{
	public static void main(String args[])
	{
	b obj = new b();
	obj.s2();
	obj.s1();
	}

}
