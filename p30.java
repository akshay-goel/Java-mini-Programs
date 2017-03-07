class Person
{
	Person()
	{
		System.out.println("Person");
	}
}
class Employee extends Person
{
	Employee()
	{
		System.out.println("Employee");
	}
}
class Manager extends Employee
{
	Manager()
	{
		System.out.println("Manager");
	}
}
class A
{
	public static void main(String[] ar)
	{
		Manager m=new Manager();
	}
}
