import java.io.*;
public class try_catch_file
{
public static void main(String args[])
{
try
{
	File f=new File("E:\\my java files\\c.txt");
	f.createNewFile();

}

catch(Exception e)
{
System.out.println("Exception="+e);
}

}


}