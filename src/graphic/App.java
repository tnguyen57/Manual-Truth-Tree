package graphic;

import java.awt.Color;

import javax.swing.*;

/**
 * This class is the main GUI for the truth tree program.
 * @author nguyet15
 */
public class App extends JFrame{
	private NodeGraphic testNode;
	private MenuBar menu;
	
	/**
	 * Create the GUI class for the truth tree program.
	 * @effect: Create the class that will run the GUI.
	 */
	public App() {
	    menu = new MenuBar();
	    setJMenuBar(menu);
	    
	    
		testNode = new PremiseNodeGraphic();
		add(testNode);
		testNode.setLocation(150, 100);
		
		
		setTitle("Manual-Truth-Tree");
		setLayout(null);
		setVisible(true);
		setSize(500, 500);
		setBackground(Color.WHITE);
		
	}

}
