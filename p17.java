import java.io.Console;
class p17
{
	public static void main(String[] ar)
	{
		Console con=System.console();
		System.out.print("Enter Number:");
		String s1=con.readLine();
		int n=Integer.parseInt(s1);
		int m=n;
		int sum=0;
		while(n>0)
		{
			int d=n%10;
			sum=sum+(d*d*d);
			n=n/10;
		}
		if(m==sum)
			System.out.println(m+" is an Armstrong Number");
	}
}