import java.io.*;
public class file_char_search
{
public static void main(String args[]) throws IOException
{
FileReader fr =new FileReader("file5_isr_text.txt");
BufferedReader b=new BufferedReader(fr);
String i;

int c=0;

while((i=b.readLine())!=null)
{ 
//System.out.println(i);
String a[]=i.split(" ");
//System.out.println(a);

 // c=c+i.length();
 for(String b:a)
 { 
    //String c1[]=b.split();
	for(i=0;i<=b.length;i++)
		{
			if(b[i].equals("d"))
					{ 
				      c++;
					}		
		}
 
}
}
System.out.println(c);
b.close();
fr.close();
}
}

			