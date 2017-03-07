import java.io.Console;
class p16
{
	public static void main(String[] ar)
	{
		Console con=System.console();
		System.out.print("Total Elements:");
		String s1=con.readLine();
		int n=Integer.parseInt(s1);
		int x=0,y=1,z=x+y;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		for(int i=1;i<=n-3;i++)
		{
				x=y;
				y=z;
				z=x+y;
				System.out.println(z);
		}
	}
}