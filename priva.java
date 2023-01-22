class priva
{
private int data=10;
private void msg()
{
System.out.println("hello");
}
}
public class avv
{
public static void main(String args[])
{

priva h=new priva();
System.out.println(h.data);
h.msg;
}
}
//gives error because private method and variable can't be accessed by other class