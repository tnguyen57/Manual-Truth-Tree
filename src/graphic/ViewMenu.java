package graphic;

import javax.swing.*;

public class ViewMenu extends JMenu{
	private JMenuItem zoomIn;
	private JMenuItem zoomOut;
	private JMenuItem reset;
	
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
