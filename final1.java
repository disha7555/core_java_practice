class final1
{
final int a=10;

public static void main(String args[])
{
final1 t=new final1();
t.a=15;
System.out.println(t.a);
}
}
//gives error because final variable's value can't be changed 