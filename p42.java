import java.awt.*;
class Frame1 extends Frame
{
	Frame1()
	{
		setLayout(null);
		setSize(400,500);
		setLocation(100,50);
		setBackground(new Color(255,200,200));
		Button b1=new Button("OK");
		b1.setBounds(100,50,150,30);
		add(b1);
		TextField t1=new TextField();
		t1.setBounds(100,100,150,30);
		add(t1);
		Label l1=new Label("Name");
		l1.setBounds(100,200,100,30);
		add(l1);

	}
}
class A
{
	public static void main(String[] ar)
	{
		Frame1 f=new Frame1();
		f.setVisible(true);
	}
}