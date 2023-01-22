import java.io.*;
public class file8_readfile_new
{
public static void main(String args[]) throws IOException
{
FileReader fr =new FileReader("file5_isr_text.txt");
BufferedReader b=new BufferedReader(fr);
String str;
while((str=b.readLine())!=null)
{
System.out.println(str);

}
b.close();
fr.close();
}
}
