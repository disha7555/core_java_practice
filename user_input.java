import java.util.Scanner;
 class user_input{
	public static void main(String[] args){
		System.out.println("taking input");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first no");
		int a=sc.nextInt();
		System.out.println("enter second no");
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println("sum of the numbers");
		System.out.println(sum);
	}
}
