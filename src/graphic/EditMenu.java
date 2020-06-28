package graphic;

import javax.swing.*;

/**
 * This class is the Edit drop down menu to the Menu Bar.
 * @author nguyet15
 */
public class EditMenu extends JMenu{
	private JMenuItem undo;
	private JMenuItem redo;
	private JMenuItem reset;
	
	/**
	 * Creates the Edit Menu for the Menu Bar
	 * @effect: Create an EditMenu drop down.
	 */
	public EditMenu() {
		setText("Edit"); 
		
		undo = new JMenuItem("Undo");
		add(undo);
		
		redo = new JMenuItem("Redo");
		add(redo);
		
		reset = new JMenuItem("Reset");
		add(reset);
	}

}
