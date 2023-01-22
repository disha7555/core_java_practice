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
	{super.s1();
	System.out.println("s1 from B");
	}
class c extends a//not possible so gives error
{
	void s3()
	{
		System.out.println("1234");
	}

}

}
class hybrid_inheritence
{
	public static void main(String args[])
	{
	b obj = new b();
	obj.s2();
	obj.s1();
	}

}
