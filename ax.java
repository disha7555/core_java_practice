class abc
{
int a=10;
abc()
{
	
System.out.println(a);
}
}
class xyz extends abc
{
xyz()
{
System.out.println(a);
}
}
class ax
{
public static void main(String args[])
{
xyz x=new xyz();
//System.out.println(x.a);
}
}