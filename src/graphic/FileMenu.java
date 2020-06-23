package graphic;

import javax.swing.*;

/**
 * This class extends JMenua and contains the options for saving/loading/load/exit
 * @author nguyet15
 *
 */
public class FileMenu extends JMenu{
	private JMenuItem newWindow;
	private JMenuItem save;
	private JMenuItem load;
	private JMenuItem exit;
	
	/**
	 * Constructor for the FileMenu class
	 * @effect: Create the FileMenu class to be added to the menu bar.
	 */
	public FileMenu() {
		setText("File");
		
		newWindow = new JMenuItem("New");
		add(newWindow);
		
		addSeparator();
		
		save = new JMenuItem("Save");
		add(save);
		
		load = new JMenuItem("Load");
		add(load);
		
		addSeparator();
		
		exit = new JMenuItem("Exit");
		add(exit);
	}
}
