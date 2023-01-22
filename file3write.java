import java.io.*;
public class file3write
{
public static void main(String args[]) throws IOException
{
File f=new File("E:\\my java files\\tc.txt");
FileWriter fw =new FileWriter("tc.txt",false);
BufferedWriter bw=new BufferedWriter(fw);
bw.write("hello");
//bw.newLine();
bw.write("hello google");
//bw.append("life");
bw.close();
}
}
