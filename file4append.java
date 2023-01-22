import java.io.*;
public class file4append
{
public static void main(String args[]) throws IOException
{
File f=new File("E:\\my java files\\tc.txt");
FileWriter fw =new FileWriter("tc.txt",true);//if false it will overwrite file otherwise appends(default:false)
BufferedWriter bw=new BufferedWriter(fw);
bw.write("helloworld");
//bw.newLine();
bw.write("hello");
//bw.append("life");
bw.close();
}
}
