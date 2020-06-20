package graphic;

import java.awt.Color;

import javax.swing.*;

public class App extends JFrame{
	private NodeGraphic ng;
	private OptionMenu menu;
	private FileMenu fileMenu;
	
	public App() {
	    menu = new OptionMenu();
	    setJMenuBar(menu);
	    
	    
		ng = new NodeGraphic();
		add(ng);
		
		
		
		
		setTitle("Manual-Truth-Tree");
		setLayout(null);
		setVisible(true);
		setSize(500, 500);
		setBackground(Color.WHITE);
		
	}

}
