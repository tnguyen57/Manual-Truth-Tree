package graphic;

import java.awt.Color;

import javax.swing.*;

public class App extends JFrame{
	private NodeGraphic testNode;
	private OptionMenu menu;
	
	public App() {
	    menu = new OptionMenu();
	    setJMenuBar(menu);
	    
	    
		testNode = new NodeGraphic();
		add(testNode);
		
		
		setTitle("Manual-Truth-Tree");
		setLayout(null);
		setVisible(true);
		setSize(500, 500);
		setBackground(Color.WHITE);
		
	}

}
