class xyw
	{
		void s()
		{
		int a=10,b=40,c;
		c=a+b;
		System.out.println(c);
		}
		void s(int x)
		{
		System.out.println(x);
		}
		void s(int x,int y)
		{
		int z=x+y;
		System.out.println(z);
		}
		void s(float m)
		{
		System.out.println(m);
		}
	}
class overloading
{
	public static void main(String args[])
	{
	
	xyw n=new xyw();
	n.s();
	n.s(10);
	n.s(10,40);
	n.s(10.4f);
	}
}