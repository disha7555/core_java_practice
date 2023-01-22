public class try_catch
{

public static void main(String args[])
{
try
{

int i=1/0;
//System.out.println(i);
}
catch(Exception e)
{
System.out.println("Exception="+e);
}
}
}