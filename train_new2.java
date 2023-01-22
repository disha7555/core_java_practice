import java.io.*;
class train_new2
{
public static void main(String args[]) throws IOException
{
	FileReader fr=new FileReader("demo.txt");
	BufferedReader br=new BufferedReader(fr);

InputStreamReader is=new InputStreamReader(System.in);
BufferedReader b=new BufferedReader(is);
System.out.println("you can search by no/name/source/destination/fare 0,1,2,3,4");
System.out.println("search by detail you give:");
int detail=Integer.parseInt(b.readLine());
switch(detail)
{
	case 1:
System.out.println("your given choice:no ,give no:");
String no=b.readLine();
String i1;
while((i1=br.readLine())!=null)
{
String trainarray[]=i1.split(" ");
if((trainarray[0].equals(no)))
	{
	System.out.println("train no: "+trainarray[0]);
	System.out.println("train name: "+trainarray[1]);
	System.out.println("train source: "+trainarray[2]);
	System.out.println("train destination: "+trainarray[3]);
	System.out.println("train fare: "+trainarray[4]);
	}
}
break;
case 2:
System.out.println("your given choice:name,give name:");
String name=b.readLine();
String i2;
while((i2=br.readLine())!=null)
{
String trainarray[]=i2.split(" ");
if((trainarray[1].equals(name)))
	{
	System.out.println("train no: "+trainarray[0]);
	System.out.println("train name: "+trainarray[1]);
	System.out.println("train source: "+trainarray[2]);
	System.out.println("train destination: "+trainarray[3]);
	System.out.println("train fare: "+trainarray[4]);
	}
}
break;
case 3:
System.out.println("your given choice:source,give source");
String source=b.readLine();
String i3;
while((i3=br.readLine())!=null)
{
String trainarray[]=i3.split(" ");
if((trainarray[2].equals(source)))
	{
	System.out.println("train no: "+trainarray[0]);
	System.out.println("train name: "+trainarray[1]);
	System.out.println("train source: "+trainarray[2]);
	System.out.println("train destination: "+trainarray[3]);
	System.out.println("train fare: "+trainarray[4]);
	}
}
break;
case 4:
System.out.println("your given choice:destination,give destination");
String destination=b.readLine();
String i4;
while((i4=br.readLine())!=null)
{
String trainarray[]=i4.split(" ");
if((trainarray[3].equals(destination)))
	{
	System.out.println("train no: "+trainarray[0]);
	System.out.println("train name: "+trainarray[1]);
	System.out.println("train source: "+trainarray[2]);
	System.out.println("train destination: "+trainarray[3]);
	System.out.println("train fare: "+trainarray[4]);
	}
}
break;
case 5:
System.out.println("your given choice:fare,give fare");
String fare=b.readLine();
String i5;
while((i5=br.readLine())!=null)
{
String trainarray[]=i5.split(" ");
if((trainarray[4].equals(fare)))
	{
	System.out.println("train no: "+trainarray[0]);
	System.out.println("train name: "+trainarray[1]);
	System.out.println("train source: "+trainarray[2]);
	System.out.println("train destination: "+trainarray[3]);
	System.out.println("train fare: "+trainarray[4]);
	}
}
break;
default:
System.out.println("enter valid no");
}
fr.close();
br.close();
is.close();
b.close();
}
}