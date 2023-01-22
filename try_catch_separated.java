import java.io.*;
public class try_catch_separated
{
public static void main(String args[])
{
try
{
	File f=new File("E:\\my java files\\c.txt");
	f.createNewFile();

}
int a=80;
catch(Exception e)
{
System.out.println("Exception="+e);
}

}


}
//gives error b'coz,between try and catch block can't write anything
//error: 'catch' without 'try'