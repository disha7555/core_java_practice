import java.util.*;
class random_no
{
	public static void main(String args[])
	{
        Random random1 = new Random();
        int a = random1.nextInt();
		System.out.println(a);
		if(a%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}
}