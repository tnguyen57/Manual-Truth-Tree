package graphic;


import javax.swing.*;

public class AddFormulaButton extends JButton{
	private NodeGraphic node;
	private FormulaClickListener listener;
	
	public AddFormulaButton(NodeGraphic node) {
		this.setText("Add Formula");
		this.node = node;
		this.listener = new FormulaClickListener(this.node);
		
		this.addMouseListener(this.listener);
	}

}
