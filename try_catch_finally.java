import java.io.*;
public class try_catch_finally
{
	public static void main(String args[])
	{
		try
		{

			FileWriter fw=new FileWriter("c1.txt");
			BufferWriter br=new BufferWriter(fw);
			br.write("Files in java are nice");
			System.out.println("successfully written");
		}

		catch(Exception e)
		{
			System.out.println("Exception occurrred"+e);
		}
		finally
		{
			if(fw!=null)
			{
				fw.close();
			}
			System.out.println("file closed");
		}
	}
}


