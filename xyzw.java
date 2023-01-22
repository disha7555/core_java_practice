class abc{
	int a=10,b=10;
	void s(){
		int c=a+b;
		System.out.println(c);
		}
	void s1(){
		int c=a*b;
		System.out.println(c);
	}
}
class xyzw{
	public static void main(String[] args){
		abc a1=new abc();
		a1.a=10;
		a1.b=20;
		a1.s();
		a1.s1();
		
	}
}