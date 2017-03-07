import java.io.Console;
class A
{
	public static void main(String[] ar)
	{
		int[] arr={45,5678,879,345,213};
		Console con=System.console();
		System.out.print("Index:");
		String s1=con.readLine();
		System.out.print("Value:");
		String s2=con.readLine();
		int z=0;
		try{
			int i=Integer.parseInt(s1);
			int x=Integer.parseInt(s2);
			z=arr[i]/x;
		}catch(Exception ee)
		{
			System.out.println("Some Problem Occurred");
		}
		System.out.println("REsult is :"+z);
	}
}