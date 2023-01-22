import java.util.*;
class A extends Exception
{
A()
{
System.out.println("A here..even");
}
}
class B extends Exception
{
B()
{
System.out.println("B here...odd");
}
}
class D 
{
void s()throws A,B
{
 Random random1 = new Random();
 int a = random1.nextInt();
 System.out.println(a);
 
if(a%2==0)
{
throw new A();
}
else
{
throw new B();
}
}
}
public class random_no_custom_Exception
{
public static void main(String args[])
{
D obj=new D();

try
{
obj.s();
}
catch(A e)
{
//System.out.println(e);
}
catch(B e1)
{
//	System.out.println(e1);
}
}
}