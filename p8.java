class Student
{
	String name;
	static String course;
	void f1()
	{
		System.out.println(name);
		System.out.println(course);
	}	
	static void f2()
	{
		//System.out.println(name);
		System.out.println(course);
	}	
}
class A
{
	public static void main(String ar[])
	{
		//Student.name="Amit";
		Student.course="Java";
		Student s1=new Student();
		Student s2=new Student();
		s1.name="Amit";
		s2.name="Atul";
		System.out.println(s1.name);	
		System.out.println(s1.course);
		System.out.println(s2.name);
		System.out.println(s2.course);
		s1.name="Ravi";
		s1.course="C Lang";
		System.out.println();
		System.out.println(s1.name);	
		System.out.println(s1.course);
		System.out.println(s2.name);
		System.out.println(s2.course);
		

	}
}

