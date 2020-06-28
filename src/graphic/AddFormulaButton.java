package graphic;


import javax.swing.*;

import listener.FormulaButtonListener;

/**
 * This class creates the "Add Formula" button in a node. 
 * This button will add another text box to enter a formula in when clicked.
 * @author nguyet15
 */
public class AddFormulaButton extends JButton{
	private NodeGraphic node;
	private FormulaButtonListener listener;
	
	/**
	 * Create a AddFormulaButton given the node it belongs to
	 * @param node: The NodeGraphic that the button belongs to
	 * @effect: Create an Add Formula Button that when pushed add another line for entering formulas. 
	 */
	public AddFormulaButton(NodeGraphic node) {
		this.setText("Add Formula");
		this.node = node;
		this.listener = new FormulaButtonListener(this.node);
		
		this.addMouseListener(this.listener);
	}

}
