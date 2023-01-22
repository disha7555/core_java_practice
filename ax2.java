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
xyz(int a)
{
System.out.println(a);
}
}
class ax2
{
public static void main(String args[])
{
xyz x2=new xyz(10);
//System.out.println(x2.a);
}
}
