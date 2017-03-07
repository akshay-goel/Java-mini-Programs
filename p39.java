import java.io.Console;
class InvalidSalaryException extends RuntimeException
{
	public String toString()
	{
		return "Invalid Salary, salary should be b/w 5000 and 20000";
	}
}
class A
{
	public static void main(String[] ar)
	{
		Console con=System.console();
		System.out.print("Salary:");
		String s1=con.readLine();
		int s=Integer.parseInt(s1);
		if(s<5000 || s>20000)
		{
			InvalidSalaryException e=new InvalidSalaryException();
			throw e;
		}
		double ns=s+(s/2.0)+200;
		System.out.println("Net Salary is :"+ns);
	}
}