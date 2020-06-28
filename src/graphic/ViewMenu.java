package graphic;

import javax.swing.*;

/**
 * Add the options related to view to the menu bar.
 * @author nguyet15
 */
public class ViewMenu extends JMenu{
	private JMenuItem zoomIn;
	private JMenuItem zoomOut;
	private JMenuItem reset;
	
	/**
	 * Constructor for the class
	 * @effect: Create the ViewMenu class to be added to the menu bar
	 */
	public ViewMenu() {
		setText("View");
		
		zoomIn = new JMenuItem("Zoom In");
		add(zoomIn);
		
		zoomOut = new JMenuItem("Zoom Out");
		add(zoomOut);
		
		reset = new JMenuItem("Reset");
		add(reset);
	}

}
