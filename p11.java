class Student
{
	String name;
}
class A
{
	public static void main(String[] ar)
	{
		int x=f1();
		int[] y=f2();
		Student z=f3();
		System.out.println(x);
		System.out.println();
		for(int item:y)
		{
			System.out.println(item);
		}
		System.out.println();
		System.out.println(z.name);
	}
	static int f1()
	{
		int a=34;
		return a;
	}
	static int[] f2()
	{
		int[] b={12,34,456,678,89};
		return b;
	}
	static Student f3()
	{
		Student s=new Student();
		s.name="Amit";
		return s;
	}
}