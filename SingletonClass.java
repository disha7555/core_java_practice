//create static obj.
//define private cons.
//create static method which returns ins. of class
public class Singleton
{
	public static void main(String[] args)
	{
		Abc obj1=Abc.getInstance();
		Abc obj2=new Abc();
	}
}
class Abc
{
	static Abc obj=new Abc();
	private Abc()
	{
	
	}
	public static Abc getInstance()
	{
		return obj;
	}
}