package graphic;

import javax.swing.JTextField;

/**
 * A class that extends JTextField that will allow users to input logical formulas
 * @author nguyet15
 *
 */
public class FormulaTextBox extends JTextField{
	/**
	 * Constructor for the FormulaTextBox test
	 * 
	 * @effect: Create a JTextField that centers the text typed into it.
	 */
	public FormulaTextBox() {
		setHorizontalAlignment(JTextField.CENTER);
		setVisible(true);
	}

}
