import java.io.Console;
class p19
{
	public static void main(String[] ar)
	{
		int x=50;
		int y;
		y=x;
		y=100;
		System.out.println(x);
		System.out.println(y);
		int[] a={1,2,3,4,5};
		int[] b;
		b=a;
		b[0]=100;
		b[1]=200;
		b[2]=300;
		for(int item:a)
		{
			System.out.println(item);
		}
	}
}