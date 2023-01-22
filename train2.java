import java.io.*;
public class train2
{
public static void main(String args[]) throws IOException
{

	File f1=new File("file_train.txt");
	f1.createNewFile();
	FileReader fr =new FileReader("file_train.txt");
BufferedReader br=new BufferedReader(fr);

	String line;
			while((line=br.readLine())!=null)
			{ 
				String words[]=line.split(" ");    //[this,is,an,apple]
				
				for(String word : words)
				{
					if(word.equals("ahmedabad"))
					{ 
				      System.out.println(line);
					}
				}
			}
br.close();
fr.close();
}
}