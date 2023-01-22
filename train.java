//name,source,destination,fair
import java.io.*;
public class train
{
public static void main(String args[]) throws IOException
{
InputStreamReader i =new InputStreamReader(System.in);
BufferedReader b=new BufferedReader(i);
File f=new File("E:\\my java files\\file15.txt.txt");
FileWriter fw =new FileWriter("file15.txt.txt");

//f.createNewFile();
BufferedWriter bw=new BufferedWriter(fw);
int i1=0;
//Scanner sc=new Scanner();

while(i1<=2)
{

System.out.println("train"+i+"details");
System.out.println("name,source,destination,price");
String s1=b.readLine();

//b.close();


bw.write(s1);
bw.newLine();
//bw.write(s2);
//bw.newLine();
//bw.write(s3);
//bw.newLine();
//bw.write(s4);
//bw.newLine();
i1++;
}

bw.close();
fw.close();
}
}

	