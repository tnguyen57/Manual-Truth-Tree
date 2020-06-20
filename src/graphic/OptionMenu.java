package graphic;

import java.awt.Font;

import javax.swing.*;

public class OptionMenu extends JMenuBar{
	private FileMenu file;
	private EditMenu edit;
	private ViewMenu view;
	
	public OptionMenu() {
		file = new FileMenu();
		add(file);
		
		edit = new EditMenu();
		add(edit);
		
		view = new ViewMenu();
		add(view);
	}
	
	
	

}
