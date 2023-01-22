class opd
{
	void opd()
	{
		int a=10;
		int b=20;
	}
	void opd(int x,int y)
	{
		int z=x*y;
		System.out.println(z);
	}
	void opd(float p)
	{
		System.out.println(p);
	}
}
class constructor_overloading
{
	public static void main(String args[])
	{
		opd o=new opd();
		o.opd();
		o.opd(10);
		o.opd(10,20);
		o.opd(10.5f);
	}
}