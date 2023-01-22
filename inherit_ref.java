class a{
	public void s()
	{
	System.out.println("hello");
	}
	public void s2()
	{
	System.out.println("s1 from class A");
	}
}
class b extends a
{
	public void s1()
	{
	System.out.println("x");
	}
	public void s()
	{
	System.out.println("s1 from B");
	}
	

}
class inherit_ref
{
	public static void main(String args[])
	{
	//b obj = new b();
	//obj.s();
	//obj.s1();
	//a obj1 = new a();
	//obj1.s2();
	//obj1.s();
	//obj1.s1();
	//b obj2 = new a();
	//obj2.s();               //gives error because class b extends a so create ref. of b for object of a
	a obj3 = new b();
	obj3.s();
	obj3.s1();              // gives error because every method called with giving ref. of a should be present in a
	                        //but s1 is not in a so it cant be called
	}

}
