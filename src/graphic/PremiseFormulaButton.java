package graphic;

import javax.swing.JButton;

import listener.PremiseFormulaButtonListener;

/**
 * This button allows users to add a premise in the Premise Node.
 * @author nguyet15
 */
public class PremiseFormulaButton extends JButton{
	private PremiseNodeGraphic node;
	private PremiseFormulaButtonListener listener;
	
	/**
	 * Create a PremiseFormulaButton given the node it belongs to
	 * @param node: The NodeGraphic that the button belongs to
	 * @effect: Create an Add Formula Button that when pushed add another line for entering formulas. 
	 */
	public PremiseFormulaButton(PremiseNodeGraphic node) {
			this.setText("Add Premise");
			this.node = node;
			this.listener = new PremiseFormulaButtonListener(this.node);
			
			this.addMouseListener(this.listener);
		}


}
