class Student
{
	String name;
}
class A
{
	public static void main(String[] ar)
	{
		int x=50;
		f1(x);
		System.out.println(x);
		System.out.println();
		int[] y={1,2,3,4,5};
		f2(y);
		for(int item:y)
		{
			System.out.println(item);
		}
		System.out.println();
		Student s=new Student();
		s.name="Amit";
		f3(s);	
		System.out.println(s.name);
	}
	static void f1(int a)
	{
		System.out.println(a);
		a=400;
		System.out.println(a);
	}
	static void f2(int[] b)
	{
		b[0]=100;
		b[1]=200;
		b[2]=300;
		b[3]=400;
	}
	static void f3(Student c)
	{
		System.out.println(c.name);
		c.name="Ravi";
	}
}