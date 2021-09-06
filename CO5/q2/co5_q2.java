import java.awt.*;
import java.applet.*;
import java.io.*;

/*
<applet code="co5_q2" width=500 height=500>
<param name="a" value="20">
<param name="b" value="40">
<param name="c" value="90">
</applet>
*/

public class co5_q2 extends Applet
{
	int a;
	int b;
	int c;
        int d;
	String str;

	public void start()
	{
		String s1;

		s1 = getParameter("a");
		a = Integer.parseInt(s1);

		s1 = getParameter("b");
		b = Integer.parseInt(s1);
                
                s1 = getParameter("c");
		c = Integer.parseInt(s1);
	}

	public void paint(Graphics g)
	{
		if( a >= b && a >= c)
			d = a;
		else if (b >= a && b >= c)
                        d=b;
                else
                       d=c;

                Font myFont = new Font("Courier", Font.BOLD,20); 
                g.setFont(myFont);
		g.drawString("1st Number = " + a, 100, 100);
		g.drawString("2nd Number =   " + b, 100, 150);
                g.drawString("3rd Number =   " + c, 100, 200);
		g.drawString("Maximum = " + d, 100, 250);
	}
}