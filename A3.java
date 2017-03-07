import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code=A3 height=400 width=700></applet>
public class A3 extends Applet
{
	public void init()
	{
		this.setLayout(null);
		Thread1 t1=new Thread1();
		t1.start();
	}
	int x=50,y=50;
	boolean right=true,down=true;
	public void paint(Graphics g)
	{
		g.drawRect(50,50,600,300);
		g.setColor(Color.red);
		g.fillOval(x,y,100,100);
	}
	class Thread1 extends Thread
	{
		public void run()
		{
			while(true)
			{
				if(right) x=x+5;
				if(down) y=y+5;
				if(!right) x=x-5;
				if(!down) y=y-5;
				if(x>=550) right=false;
				if(x<=50) right=true;
				if(y>=250) down=false;
				if(y<=50) down=true;
				repaint();
				try{
					Thread.sleep(100);
				}catch(Exception ee){}
			}
		}
	}
}



