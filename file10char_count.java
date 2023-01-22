import java.io.*;
public class file10char_count
{
public static void main(String args[]) throws IOException
{
FileReader fr =new FileReader("file5_isr_text.txt");
BufferedReader b=new BufferedReader(fr);
String i;

int c=0;

while((i=b.readLine())!=null)
{ 
  c=c+i.length();
}
System.out.println(c);
b.close();
fr.close();
}
}
