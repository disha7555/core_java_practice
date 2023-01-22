class abc
{
int a=10;
abc(int a)
{
System.out.println(a);
}
}
class xyz extends abc
{
xyz(int a)
{super(100);
System.out.println(a);
}
}
class ax3
{
public static void main(String args[])
{
xyz x3=new xyz(4);
System.out.println(x3.a);
}
}