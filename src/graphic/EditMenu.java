package graphic;

import javax.swing.*;

public class EditMenu extends JMenu{
	private JMenuItem undo;
	private JMenuItem redo;
	private JMenuItem reset;
	
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
