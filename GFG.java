import java.io.*;
class Geek
{
String name;
int id;
Geek(String name,int id)
{
//this.name=name;
//this.id=id;
}
}
class GFG
{
public static void main(String[] args)
{
Geek geek1=new Geek("adam",1);
System.out.println("GeekName :" + geek1.name + " and GeekId :" + geek1.id);
}
}