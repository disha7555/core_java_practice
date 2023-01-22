import java.io.*;
public class file2
{
public static void main(String args[]) throws IOException
{
File f=new File("t.txt");
//f.createNewFile();
System.out.println(f.length());
System.out.println(f.getName());
System.out.println(f.getPath());
System.out.println(f.getAbsolutePath());
System.out.println(f.isHidden());
System.out.println(f.canWrite());
System.out.println(f.canRead());
System.out.println(f.canExecute());
System.out.println(f.canExecute());
System.out.println(f.isAbsolute());
System.out.println(f.isDirectory());
System.out.println(f.isFile());
System.out.println(f.getParent());
System.out.println(f.toURI());
System.out.println(f.getFreeSpace());
File mkdirectory=new File("yy\\zz\\mm");
boolean x=mkdirectory.mkdirs();
System.out.println(x);
System.out.println(f.mkdir());

System.out.println(f.lastModified());
File rename=new File("lj.txt"); //absolute path  can also be given

System.out.println(f.renameTo(rename));
}
} 