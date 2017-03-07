import java.io.Console;
class p19
{
	public static void main(String[] ar)
	{
		Console con=System.console();
		System.out.print("Number:");
		String s=con.readLine();
		int x=Integer.parseInt(s);
		int y=f(x);
		System.out.println(y);
	}
	static int f(int m)
	{
		if(m==1)
			return 1;
		else
			return m*f(m-1);
	}
}