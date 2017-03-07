class Person
{
	String name;
	Person(String nm)
	{
		name=nm;
	}
	void print()
	{
		System.out.println("Name is :"+name);
	}
}
class Employee extends Person
{
	int salary;
	Employee(String n,int s)
	{
		super(n);
		salary=s;
	}
	void print()
	{
		super.print();
		System.out.println("Salary is :"+salary);
	}
}
class A
{
	public static void main(String[] ar)
	{
		Person p=new Employee("Amit Kumar",15000);
		p.print();
		System.out.println();
		//System.out.println(p.name);
		//System.out.println(p.salary);
	}
}
