import java.io.Console;
class p19
{
	public static void main(String[] ar)
	{
		int[][] arr=new int[3][5];
		Console con=System.console();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				String s1=con.readLine();
				arr[i][j]=Integer.parseInt(s1);
			}
		}
		System.out.println("Matrix is:");
		for(int i=0;i<3;i++)
		{
			System.out.println();
			for(int j=0;j<5;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
		}
		System.out.println("Transpose of the Matrix is:");
		for(int i=0;i<5;i++)
		{
			System.out.println();
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[j][i]+"  ");
			}
		}
	}
}