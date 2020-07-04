package logic;

import backend.TreeNode;

/**
 * Represents a logic formula in first order logic
 * @author nguyet15
 */
public class LogicFormula {
	boolean isPremise= false;
	TreeNode node = null;
	
	/**
	 * Constructor for a blank logic formula class.
	 * @effect: Create a non-premise empty LogicFormula class 
	 */
	LogicFormula() {
		//TO DO
		;
	}
	
	/**
	 * Constructor for the logic formula class. 
	 * Takes in a string the represents a formula and process it.
	 * @param formula: A string representing a formula in first order logic.
	 * 
	 */
	LogicFormula(String formula){
		// TO DO
		;
	}
	
	/**
	 * Mark what node the formula belongs to.
	 * @param node: The TreeNode that the formula belongs to.
	 * @effect: Changes/Add what node the formula belongs to.
	 */
	public void addNode(TreeNode node) {
		this.node = node;
	}

}
