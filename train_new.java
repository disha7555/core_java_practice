import java.io.*;
import java.util.*;
class train_new
{
public static void main(String args[]) throws Exception
{
FileWriter fr=new FileWriter("demo.txt");
BufferedWriter br=new BufferedWriter(fr);

InputStreamReader is=new InputStreamReader(System.in);
BufferedReader b=new BufferedReader(is);

System.out.println("enter no of trains");
int count=Integer.parseInt(b.readLine());

for(int i=0;i<count;i++)
{
System.out.println("train no: ");
String number=b.readLine();

System.out.println("train name: ");
String name=b.readLine();

System.out.println("train source: ");
String source=b.readLine();

System.out.println("train destination: ");
String destination=b.readLine();

System.out.println("train fare: ");
String fare=b.readLine();

br.write(number+" "+name+" "+source+" "+destination+" "+fare);
br.newLine();
}

b.close();
is.close();
br.close();
fr.close();
}
}
