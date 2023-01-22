import java.io.*;
public class file11word_count
{
public static void main(String args[]) throws IOException
{
FileReader fr =new FileReader("file5_isr_text.txt");
BufferedReader b=new BufferedReader(fr);
String line;

int wordCount=0;

while((line=b.readLine())!=null)
{ 
String words[]=line.split(" ");

  wordCount=wordCount+words.length;
}
System.out.println(wordCount);
b.close();
fr.close();
}
}
