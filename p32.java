class GS
{
	int x,y;
	void print()
	{
		System.out.println("X="+x+",Y="+y);
	}
	void area()
	{
	}
}
class Triangle extends GS
{
	void area()
	{
		System.out.println("Area of Triangle");
	}
}
class Ellipse extends GS
{
	void area()
	{
		System.out.println("Area of Ellipse");
	}
}
class Circle extends GS
{
	int r;
	void area()
	{
		System.out.println("Area of Circle");
	}
}
class A
{
	public static void main(String[] ar)
	{
		GS g1,g2,g3;
		g1=new Triangle();
		g2=new Circle();
		g3=new Ellipse();
		g1.area();
		g2.area();
		g3.area();
	}
}
