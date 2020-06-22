package graphic;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputAdapter;

/**
 * Using code found on https://tips4java.wordpress.com/2009/06/14/moving-windows/
 * that implement a way to drag components.
 */
public class DragListener extends MouseInputAdapter{
	Point location;
    MouseEvent pressed;
 
    public void mousePressed(MouseEvent me)
    {
        pressed = me;
    }
 
    public void mouseDragged(MouseEvent me)
    {
        Component component = me.getComponent();
        location = component.getLocation(location);
        int x = location.x - pressed.getX() + me.getX();
        int y = location.y - pressed.getY() + me.getY();
        component.setLocation(x, y);
     }

}