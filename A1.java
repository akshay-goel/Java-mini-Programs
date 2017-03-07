import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.net.*;
public class A1 extends Applet
{
	Label l1=new Label();
	Label l2=new Label();
	Button b1=new Button("Code Base");
	Button b2=new Button("Document Base");
	Button b3=new Button("Image");
	Button b4=new Button("Audio Clip");
	Button b5=new Button("Play");
	Button b6=new Button("Status");
	Button b7=new Button("Parameter");
	public void init()
	{
		this.setLayout(null);
		l1.setFont(new Font("Arial",0,20));
		l2.setFont(new Font("Arial",0,20));
		l1.setBounds(10,10,400,25);this.add(l1);
		l2.setBounds(10,50,400,25);this.add(l2);
		b1.setBounds(10,90,100,25);this.add(b1);
		b2.setBounds(10,120,100,25);this.add(b2);
		b3.setBounds(10,150,100,25);this.add(b3);
		b4.setBounds(10,190,100,25);this.add(b4);
		b5.setBounds(10,230,100,25);this.add(b5);
		b6.setBounds(10,270,100,25);this.add(b6);
		b7.setBounds(10,310,100,25);this.add(b7);
		b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){b1_Click();}});
		b2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){b2_Click();}});
		b3.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){b3_Click();}});
		b4.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){b4_Click();}});
		b5.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){b5_Click();}});
		b6.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){b6_Click();}});
		b7.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){b7_Click();}});
	}
	void b1_Click()
	{
		URL u=this.getCodeBase();
		l1.setText(u);
	}
	void b2_Click()
	{
		URL u=this.getDocumentBase();
		l2.setText(u+"");
	}
	void b3_Click()
	{
		try{
			URL u1=this.getCodeBase();
			URL u=new URL(u1+"car.gif");
			img=getImage(u);
			repaint();
		}catch(Exception ee){}
	}
	Image img;//so that it is accesable everywhere
	public void paint(Graphics g)
	{
		if(img!=null)
		{
			g.drawImage(img,200,200,200,200,this);
		}
	}
	void b4_Click()
	{
		try{
			URL u1=this.getCodeBase();
			URL u=new URL(u1+"yahoo1.au");
			AudioClip a=getAudioClip(u);
			a.play();
		}catch(Exception ee){}
	}
	void b5_Click()
	{
		try{
			URL u1=this.getCodeBase();
			URL u=new URL(u1+"yahoo1.au");
			play(u);
		}catch(Exception ee){}
	}
	void b6_Click()
	{
		showStatus("adfsgdfgdfgdfG");
	}
	void b7_Click()
	{
		String s1=getParameter("x");
		String s2=getParameter("y");
		l1.setText(s1);
		l2.setText(s2);
	}
}
/*
<applet code="A1" height='400' width=450>
			<param name="x" value="sdfdfgdfdsfgdsgD">
			<param name="y" value="Parameters">
		</applet>
		*/

