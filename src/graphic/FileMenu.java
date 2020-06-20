package graphic;

import javax.swing.*;

public class FileMenu extends JMenu{
	private JMenuItem newWindow;
	private JMenuItem save;
	private JMenuItem load;
	private JMenuItem exit;
	
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
