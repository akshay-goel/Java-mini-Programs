import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.net.*;
//<applet code="A2" height='400' width=450></applet>
public class A2 extends Applet
{
	public void init()
	{
		this.setBounds(100,50,700,400);
		this.setLayout(null);
		this.addKeyListener(new KeyAdapter(){public void keyPressed(KeyEvent e){key_press(e);}});
	}
	void key_press(KeyEvent e)
	{
		int a=e.getKeyCode();
		if(a==39)
		{
			if(s.equals("mariostandingright.gif"))
			{
				s="mariowalkingright.gif";
			}
			else
			{
				s="mariostandingright.gif";
			}
			x=x+5;
		}
		if(a==37)
		{
			if(s.equals("mariostandingleft.gif"))
			{
				s="mariowalkingleft.gif";
			}
			else
			{
				s="mariostandingleft.gif";
			}
			x=x-5;
		}
		repaint();
	}
	String s="mariostandingright.gif";
	int x=20;
	public void paint(Graphics g)
	{
		try{
			g.fillRect(0,250,11000,5);
			URL u=new URL(getCodeBase()+s);
			Image img=getImage(u);
			g.drawImage(img,x,195,32,56,this);
		}catch(Exception ee){}
	}
}

