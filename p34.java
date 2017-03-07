class X
{
}
interface Y
{
}
class Z extends X implements Y
{
}
class A
{
	public static void main(String[] ar)
	{
		Z z=new Z();
		X x=z;
		Y y=z;
	}
}
