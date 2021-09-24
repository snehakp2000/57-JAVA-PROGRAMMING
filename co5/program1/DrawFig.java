import java.awt.*;
import java.applet.*;
/*
<applet code="DrawFig" width="100" height="200">
</applet>
*/
public class DrawFig extends Applet{
public void paint(Graphics g){
g.fillOval(10,10,200,200);
g.fillRect(300,10,200,200);
g.drawLine(800,10,700,300);
}
}