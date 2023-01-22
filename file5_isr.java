import java.io.*;
public class file5_isr
{
public static void main(String args[]) throws IOException
{
InputStreamReader i =new InputStreamReader(System.in);
BufferedReader b=new BufferedReader(i);
System.out.println("input.....");

String s1=b.readLine();

System.out.println("your given input...");

System.out.println("second input:"+s1);
b.close();

//File f=new File("E:\\my java files\\file5_isr_text.txt");
FileWriter fw =new FileWriter("file5_isr_text.txt",true);
//f.createNewFile();
BufferedWriter bw=new BufferedWriter(fw);
bw.write(s1);
bw.close();
fw.close();
}
}
