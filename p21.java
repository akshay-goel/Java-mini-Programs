import java.io.Console;
class p19
{
	public static void main(String[] ar)
	{
		Console con=System.console();
		System.out.print("Number:");
		String s=con.readLine();
		int x=Integer.parseInt(s);
		int i;
		for(i=2;i<x;i++)
		{
			if(x%i==0)
			{
				System.out.println("Not a Prime Number");
				break;
			}
		}
		if(i==x)
			System.out.println("Prime Number");
	}
}