import java.awt.*;
import java.applet.*;
/*
<applet code="MaxNumber" width="100" height="200">
<param name="num1" value=50>
<param name="num2" value=100>
<param name="num3" value=65>
</applet>
*/
public class MaxNumber extends Applet{
String param;
int max;
public void init()
{
setBackground(Color.blue);
setForeground(Color.yellow);
}
public void start()
{
param=getParameter("num1");
int val1=Integer.parseInt(param);
param=getParameter("num2");
int val2=Integer.parseInt(param);
param=getParameter("num3");
int val3=Integer.parseInt(param);
if(val1>val2)
{
if(val1>val3)
{
max=val3;
}
}
else
{
max=val3;
}
if(val2>val3)
{
max=val2;
}
}
public void paint(Graphics g)
{
g.drawString("Larger number is :"+String.valueOf(max),100,150);
}
}