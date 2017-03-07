class B
{
	void f1()
	{
		System.out.println("Zero Parameter");
	}
	void f1(int x)
	{
		System.out.println("1 Integer Parameter");
	}
	void f1(double x)
	{
		System.out.println("1 Double Parameter");
	}
	void f1(float x)
	{
		System.out.println("1 Float Parameter");
	}
	void f1(int x,double y)
	{
	}
	void f1(double x,int x)
	{
	}
}
class A
{
	public static void main(String[] ar)
	{
		B b=new B();
		byte x1=23;
		short x2=34;
		int x3=23;
		long x4=23;
		float x5=23.56F;
		double x6=23.123;
		boolean x7=true;
		String x8="SDf";
		char x9='A';
		b.f1();
		b.f1(x1);
		b.f1(x2);
		b.f1(x3);
		b.f1(x4);
		b.f1(x5);
		b.f1(x6);
		//b.f1(x7);
		//b.f1(x8);
		b.f1(x9);
		//b.f1(23.45,67.23);
	}
}
