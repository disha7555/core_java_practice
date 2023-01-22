import java.io.*;
public class file_word_replace
	{
		public static void main(String args[]) throws IOException,ArrayIndexOutOfBoundsException
		{
			FileReader fr =new FileReader("file5_isr_text.txt");
            BufferedReader b=new BufferedReader(fr);
			//int i;
			int count=0;
			String line;
			String h="hi";
			
			while((line=b.readLine())!=null)
			{ 
				String words[]=line.split(" ");//[this,is,an,apple]
				
				for(String word : words)
				{
					if(word.equals("disha"))
					{ 
						String g="disha";
						String p="hi";
						//System.out.println(word);
					    System.out.println(word.replaceAll(g,p));//prints only replaced words
						
					 
					}
				}
				
			}
	
       


	}
}
	