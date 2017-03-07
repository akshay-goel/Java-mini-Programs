import java.awt.*;
class A
{
	public static void main(String[] ar)
	{
		Frame f=new Frame();
		f.setLayout(null);
		Dimension d1=new Dimension(500,400);
		f.setSize(d1);
		Point p1=new Point(200,100);
		f.setLocation(p1);
		Color c1=new Color(255,180,200);
		f.setBackground(c1);
		f.setTitle("Window Example");
		Button b=new Button();
		b.setBounds(100,100,150,30);
		f.add(b);
		f.setVisible(true);
	}
}