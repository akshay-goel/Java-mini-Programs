class Person
{
	String name;
}
class Employee extends Person
{
	int salary;
}
class Student extends Person
{
	String course;
}
class A
{
	public static void main(String[] ar)
	{
		Employee e=new Employee();
		e.name="AA";
		e.salary=15000;
		System.out.println(e.name);
		System.out.println(e.salary);
		Person p=e;
		System.out.println(p.name);
		//System.out.println(p.salary); Error
		//Student s=(Student)p;
		if(p instanceof Student)
		{
			System.out.println("Student");
		}
		if(p instanceof Employee)
		{
			System.out.println("Employee");
			Employee e1=(Employee)p;
		}
	}
}
