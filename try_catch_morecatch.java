import java.io.*;
public class try_catch_morecatch
{
public static void main(String args[])
{
try
{
	int i=1/0;
	System.out.println(i);
	int a[]=new int[2];
	a[0]=1;
	a[1]=3;
	a[3]=5;
	System.out.println(a[3]);

}
catch(ArithmeticException e1)
{
System.out.println("Exception="+e1);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Exception="+e);
}

}


}
