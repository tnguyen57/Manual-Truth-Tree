package graphic;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import listener.DragListener;

/**
 * A graphic class that extends node graphic and allows for adding premises.
 * @author nguyet15
 */
public class PremiseNodeGraphic extends NodeGraphic{
	private int numberPremise;
	private PremiseFormulaButton addPremise;
	private JPanel separator;
	
	/**
	 * Constructor for the Premise Node.
	 * 
	 * @effect: Create a PremiseNodeGraphic object that is used in the GUI.
	 */
	PremiseNodeGraphic(){
		numberPremise = 0;
		addPremise = new PremiseFormulaButton(this);
		
		for (int i = 0; i < buttons.size(); i++) {
			this.remove(buttons.get(i));
		}
		buttons.add(0, addPremise);
		add(addPremise);
		for (int i = 0; i < buttons.size(); i++) {
			this.add(buttons.get(i));
		}
				
		separator = new JPanel();
		separator.setBackground(Color.RED);
		separator.setBorder(BorderFactory.createMatteBorder(
                12, 0, 12, 0, Color.black));

		this.add(separator);
		this.addPremise();
	}
	
	/**
	 * Changed the resize to also include the separator.
	 * 
	 * @effect: Resize the node to fit all of the buttons, formula, and seperator.
	 */
	@Override
	protected void resize() {
		setLayout(new GridLayout(this.formulas.size() + this.buttons.size() + 1, 1));
		setSize(this.componentWidth + 2 * this.borderSize, this.componentHeight * (this.formulas.size() + this.buttons.size() + 1) + 2 * this.borderSize);
	}
	
	/**
	 * Function to add a FormulaTextBox that will be used for entering premises.
	 * 
	 * @effect: Add a FormulaTextBox to the node to enter Premises.
	 */
	public void addPremise() {
		for (int i = 0; i < buttons.size(); i++) {
			this.remove(buttons.get(i));
		}
		
		for (int i = 0; i < formulas.size(); i++) {
			this.remove(formulas.get(i));
		}
		
		this.remove(separator);
	
		this.formulas.add(this.numberPremise ,new FormulaTextBox(true));
		this.numberPremise++;
		
		for (int i = 0; i < formulas.size(); i++) {
			if (i == numberPremise) {
				this.add(separator);
			}
			this.add(formulas.get(i));
			
		}
		
		for (int i = 0; i < buttons.size(); i++) {
			this.add(buttons.get(i));
		}
		
		this.resize();
		this.revalidate();
		this.repaint();
	}

}
