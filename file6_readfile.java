import java.io.*;
public class file6_readfile
{
public static void main(String args[]) throws IOException
{
FileReader fr =new FileReader("file5_isr_text.txt");
BufferedReader b=new BufferedReader(fr);
System.out.println("input.....");
String str;
int i;
while((i=fr.read())!=-1)
{
	
System.out.println((char)i);//reads filecharacters one by one

}
}
}
