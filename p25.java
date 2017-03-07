import java.io.Console;
class p19
{
	public static void main(String[] ar)
	{
		Console con=System.console();
		System.out.print("Value:");
		String s=con.readLine();
		double x=Double.parseDouble(s);
		//double y=Math.sqrt(x);
		//double y=Math.cbrt(x);
		//double y=Math.pow(x,5.5);
		//double y=Math.log(x);
		//x=Math.toRadians(x);
		//double y=Math.sin(x);
		double y=Math.round(x);
		System.out.println(y);
	}

}