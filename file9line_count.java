import java.io.*;
public class file9line_count
{
public static void main(String args[]) throws IOException
{
FileReader fr =new FileReader("file5_isr_text.txt");
BufferedReader b=new BufferedReader(fr);
String str;
int c=0;
while((str=b.readLine())!=null)
{
System.out.println(str);
c++;
}
System.out.println(c);
b.close();
fr.close();
}
}
