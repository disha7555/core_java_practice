public class try_finally
{

public static void main(String args[])
{
try
{

int i=1/0;
System.out.println(i);
}
finally
{
System.out.println("no catch block to execute");
}

}
}
