package p2;
import p1.*;
class protect2 extends protect
{
public static void main(String args[])
{
protect2 o=new protect2();
o.display();
}
}
//if proctect2 not extending protect,gives error 
//if ,instead of protect2 ,i make object of protect,gives error
