import java.io.*;
public class try_without_catch
{
public static void main(String args[])
{
try
{
	File f=new File("E:\\my java files\\c.txt");
	f.createNewFile();

}


}


}
//gives error b'coz try can't be there without catch 
//error:'try' without 'catch', 'finally' or resource declaration