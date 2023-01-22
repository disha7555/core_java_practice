abstract class abs1
{
	public int a=15;
	public abstract void st();
}
class abs2 extends abs1
{
	public void st()
	{
		System.out.println("hello");
	}
	
}
public class abstract2
{
	public static void main(String args[])
	{
		abs2 obj =new abs2();
		obj.st();
	}
}	
		
