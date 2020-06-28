package graphic;

import java.awt.Font;

import javax.swing.*;

/**
 * The Menu Bar for the program.
 * @author nguyet15
 */
public class MenuBar extends JMenuBar{
	private FileMenu file;
	private EditMenu edit;
	private ViewMenu view;
	
	/**
	 * Constructor for the menu bar.
	 * 
	 * @effect: Create an instance of the menu bar.
	 */
	public MenuBar() {
		file = new FileMenu();
		add(file);
		
		edit = new EditMenu();
		add(edit);
		
		view = new ViewMenu();
		add(view);
	}
}
