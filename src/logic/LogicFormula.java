package logic;

import backend.TreeNode;

/**
 * Represents a logic formula in first order logic
 * @author nguyet15
 */
public class LogicFormula {
	boolean isPremise= false;
	TreeNode node = null;
	
	private int id = 0;
	
	/**
	 * Constructor for a blank logic formula class.
	 * @param id: The id of the LogicFormula.
	 * @effect: Create a non-premise empty LogicFormula class 
	 */
	public LogicFormula(int id) {
		this.id = id;
		//TO DO
		;
	}
	
	/**
	 * Constructor for a blank logic formula class. Can specify whether premise or not.
	 * @param id: The id of the LogicFormula.
	 * @effect: Create a premise or non-premise empty LogicFormula class
	 */
	public LogicFormula(int id, boolean isPremise){
		//TO DO
		this.id = id;
		this.isPremise = isPremise;
		;
	}
	
	/**
	 * Constructor for the logic formula class. 
	 * Takes in a string the represents a formula and process it.
	 * @param id: The id of the LogicFormula.
	 * @param formula: A string representing a formula in first order logic.
	 */
	public LogicFormula(int id, String formula){
		this.id = id;
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
	
	/**
	 * Edit the formula with the new string
	 * @param formula: The new formula to be created
	 * @effect: Change the formula to the new formula provided
	 */
	public void edit(String formula) {
		//TO DO
		;
	}
	
	/**
	 * Getter for the id of the LogicFormula
	 * @returns: Returns the id of the LogicFormula.
	 */
	public int getID() {
		return this.id;
	}
	
	/**
	 * Set the id for LogicFormula
	 * @param id: The new id of the formula
	 * @effect: Change the id of the formula with the provided id
	 */
	public void setId(int id) {
		this.id = id;
	}

}
