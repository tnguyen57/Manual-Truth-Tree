package graphic;

import javax.swing.JTextField;

/**
 * A class that extends JTextField that will allow users to input logical formulas
 * @author nguyet15
 */
public class FormulaTextBox extends JTextField{
	private boolean premise;
	/**
	 * Constructor a non-premise FormulaTextBox. 
	 * 
	 * @effect: Create a JTextField that centers the text typed into it.
	 */
	public FormulaTextBox() {
		premise = false;
		setHorizontalAlignment(JTextField.CENTER);
		setVisible(true);
	}

	/**
	 * Constructor that adds a FormulaTextBox given a boolean
	 * 
	 * @param premise: Corresponds to whether the FormulaTextBox will contain a premise
	 */
	public FormulaTextBox(boolean premise) {
		this.premise = premise;
		setHorizontalAlignment(JTextField.CENTER);
		setVisible(true);
	}
	
	/**
	 * Check to see if the FormulaTextBox contains a premise
	 * 
	 * @returns: Returns true is the FormulaTextBox is a premise.
	 * 			 Returns false otherwise.
	 */
	public boolean isPremise() {
		return this.premise;
	}
}

