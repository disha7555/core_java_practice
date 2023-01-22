import java.io.*;
public class file7_readfile_by_br
{
public static void main(String args[]) throws IOException
{
FileReader fr =new FileReader("file5_isr_text.txt");
BufferedReader b=new BufferedReader(fr);
System.out.println("input.....");
String str;
int i;
while((str=b.readLine())!=null)
{
	
System.out.println(str);//reads filecharacters one by one

}
}
}
