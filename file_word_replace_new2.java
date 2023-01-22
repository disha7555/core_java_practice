import java.io.*;
public class file_word_replace_new2
{
public static void modify(String filePath,String newfilePath,String oldString,String newString)throws IOException
{
File fileToBeModified=new File(filePath);
FileReader fr=new FileReader(fileToBeModified);
BufferedReader reader=null;
FileWriter writer=null;
String oldContent="";
//String new="";
//oldString="disha";
//newString="good";
reader = new BufferedReader(new FileReader(fileToBeModified));
String line=reader.readLine();

while(line != null)
{
	oldContent=oldContent+line;
	line=reader.readLine();
}
String newContent=oldContent.replaceAll(oldString,newString);
File modified=new File(newfilePath);
writer=new FileWriter(modified);
writer.write(newContent);
reader.close();
writer.close();

}
public static void main(String args[])throws Exception
{
	modify("C://Users//Welcome//Desktop//java files//file5_isr_text.txt","C://Users//Welcome//Desktop//java files//file10.txt","good","go");
	System.out.println("done");
}
}
	