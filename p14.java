import java.io.Console;
class A
{
	public static void main(String[] ar)
	{
		Console c=System.console();
		System.out.print("Enter Name:");
		String s1=c.readLine();
		System.out.print("Enter Address:");
		String s2=c.readLine();
		System.out.print("Enter Course:");
		String s3=c.readLine();
	}
}