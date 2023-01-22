class abc
{
int a=30;
abc(int a)
{
//System.out.println(a);
}
}
class xyz extends abc
{
xyz()
{super(20);
System.out.println(a);
}
}
class ax1
{
public static void main(String args[])
{
xyz x1=new xyz();
//System.out.println(x1.a);
}
}
