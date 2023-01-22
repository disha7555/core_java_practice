import java.io.*;
public class try_catch_AE
{
public static void main(String args[])
{
try
{
	int i=1/0;
	System.out.println(i);

}

catch(ArithmeticException e)
{
System.out.println("Exception="+e);
}

}


}