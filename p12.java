import java.io.Console;
class A
{
	public static void main(String[] ar)
	{
		Console c=System.console();
		String s1=c.readLine();
		String s2,s3,s4;
		s2=c.readLine();
		s3=c.readLine();
		s4=c.readLine();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}