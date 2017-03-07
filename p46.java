import java.awt.*;
import java.awt.event.*;
class Frame1 extends Frame
{
	Button b1=new Button("OK");
	Button b2=new Button("Cancel");
	Frame1()
	{
		setSize(400,400);
		setLayout(null);
		b1.setBounds(20,50,150,30);add(b1);
		b2.setBounds(20,100,150,30);add(b2);
		b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){f1();}});
		b2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){f2();}});
	}
	void f1()
	{
		System.out.println("Button 1");
	}
	void f2()
	{
		System.out.println("Button 2");
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



