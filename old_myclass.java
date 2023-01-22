package image_processing;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class myclass
{
	public void f1()
	{
		BufferedImage img=null;
		File f=null;
		try
		{
			f=new File("C:/Users/Welcome/Desktop/image processing in java/gfg-logo.png");
			img=ImageIO.read(f);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		int width=img.getWidth();
		int height=img.getHeight();
		for(int y=0;y<height;y++)
		{
			for(int x=0;x<width;x++)
			{
				int p=img.getRGB(x, y);
				int a=(p>>24) & 0xff;
				int r=(p>>16) & 0xff;
				int g=(p>>8) & 0xff;
				int b=p & 0xff;
				int avg=(r+g+b)/3;
				p=(a<<24)|(avg<<16)|(avg<<8)|avg;
				img.setRGB(x, y, p);
			}
		}
		try
		{
			f=new File("C:/Users/Welcome/Desktop/image processing in java/GFG.png");
			ImageIO.write(img,"png",f);
			System.out.println("Successfully converted colored image into grayscale image");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		}
}
