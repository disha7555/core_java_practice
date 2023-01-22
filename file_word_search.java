import java.io.*;
public class file_word_search
	{
		public static void main(String args[]) throws IOException,ArrayIndexOutOfBoundsException
		{
			FileReader fr =new FileReader("file5_isr_text.txt");
            BufferedReader b=new BufferedReader(fr);
			//int i;
			int count=0;
			String line;
			
			while((line=b.readLine())!=null)
			{ 
				String words[]=line.split(" ");    //[this,is,an,apple]
				
				for(String word : words)
				{
					if(word.equals("tc"))
					{ 
				      count++;
				
						
						
					}
				}
			}
			if(count!=0)
			{
				System.out.println("searched");
			}
			else
			{
				System.out.println("not searched");
			}
		}
	}