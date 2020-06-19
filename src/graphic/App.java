package graphic;

import java.awt.Color;

import javax.swing.*;

public class App extends JFrame{
	private NodeGraphic ng;
	
	public App() {
		ng = new NodeGraphic();
		add(ng);
		
		
		setTitle("Manual-Truth-Tree");
		setLayout(null);
		setVisible(true);
		setSize(500, 500);
		setBackground(Color.WHITE);
		
	}

}
