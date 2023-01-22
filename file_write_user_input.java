import java.io.*;
public class file_write_user_input
{
public static void main(String args[]) throws IOException
{
InputStreamReader i =new InputStreamReader(System.in);
BufferedReader b=new BufferedReader(i);
File f=new File("E:\\my java files\\file5_isr_text.txt");
FileWriter fw =new FileWriter("file15.txt.txt");
//f.createNewFile();
BufferedWriter bw=new BufferedWriter(fw);
int i1=0;
while(i1<=4)
{

System.out.println("input.....");

String s1=b.readLine();

//System.out.println("your given input...");

//System.out.println("second input:"+s1);
//b.close();


bw.write(s1);
i1++;
}
bw.close();
fw.close();
}
}
