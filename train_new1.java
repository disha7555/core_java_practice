import java.io.*;
class train_new1
{
public static void main(String args[]) throws IOException
{
	FileReader fr=new FileReader("demo.txt");
	BufferedReader br=new BufferedReader(fr);

InputStreamReader is=new InputStreamReader(System.in);
BufferedReader b=new BufferedReader(is);

System.out.println("enter no of trains");
String no=b.readLine();
System.out.println(no);
String i;
while((i=br.readLine())!=null)
{
String trainarray[]=i.split(" ");
if(trainarray[0].equals(no))
	{
		System.out.println(i);
	/*System.out.println("train no: "+trainarray[0]);
	System.out.println("train name: "+trainarray[1]);
	System.out.println("train source: "+trainarray[2]);
	System.out.println("train destination: "+trainarray[3]);
	System.out.println("train fare: "+trainarray[4]);
	*/}
}
fr.close();
br.close();
is.close();
b.close();
}
}