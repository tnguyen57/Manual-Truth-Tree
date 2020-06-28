package listener;

import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputAdapter;

import graphic.PremiseNodeGraphic;

/**
 * A Listener for the PremsieFormulaButton class. When clicked add a premise
 * formula bar to the node.
 * @author nguyet15
 */
public class PremiseFormulaButtonListener extends MouseInputAdapter {
	private PremiseNodeGraphic node;
	/**
	 * Create the PremiseFormulaButtonListener class.
	 * @param node: The node that the button belongs to
	 */
	public PremiseFormulaButtonListener(PremiseNodeGraphic node) {
		this.node = node;
	}
	
	/**
	 * When clicked, add a premise formula bar to the Premise Node.
	 * @effect: Add a Premise FormulaTextBox to the Premise Node.
	 */
	public void mouseClicked(MouseEvent me) {
		this.node.addPremise();
	}

	
}
