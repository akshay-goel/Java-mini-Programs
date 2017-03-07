import java.io.Console;
class A
{
	public static void main(String[] ar)
	{
		Console c=System.console();
		System.out.print("Enter 1st Value:");
		String s1=c.readLine();
		System.out.print("Enter 2nd Value:");
		String s2=c.readLine();
		int x,y,z;
		x=Integer.parseInt(s1);
		y=Integer.parseInt(s2);
		z=x+y;
		System.out.println("Sum is "+z);
	}
}