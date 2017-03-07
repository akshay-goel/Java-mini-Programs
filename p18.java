import java.io.Console;
class p18
{
	public static void main(String[] ar)
	{
		int[] arr1={3,234,56,678,8790};
		int[] arr2=new int[10];
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		System.out.println();
		int[][] arr3;
		arr3=new int[3][];
		arr3[0]=new int[5];
		arr3[1]=new int[15];
		arr3[2]=new int[10];
		System.out.println(arr3.length);
		System.out.println(arr3[0].length);
		System.out.println(arr3[1].length);
		System.out.println(arr3[2].length);
		System.out.println();
		int[][] arr4={{1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8,9,10,11,12,13},{1,2,3,4,5}};
		for(int i=0;i<arr4.length;i++)
		{
			System.out.println();
			for(int j=0;j<arr4[i].length;j++)
			{
				System.out.print(arr4[i][j]+"   ");
			}
		}
		System.out.println();
		for(int[] y:arr4)
		{
			System.out.println();
			for(int item:y)
			{
				System.out.print(item+"  ");
			}
		}
	}
}