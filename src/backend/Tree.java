package backend;

import java.util.ArrayList;
import java.util.List;

import logic.LogicFormula;

/**
 * The tree class used to store the formulas and act as the backend of the application.
 * @author nguyet15
 */
public class Tree {
	private List<LogicFormula> premises = new ArrayList<LogicFormula>();
	private List<TreeNode> nodes = new ArrayList<TreeNode>();
	private List<LogicFormula> formulas = new ArrayList<LogicFormula>();
	
	/**
	 * Basic constructor for the Tree class with a root node.
	 * @effect: Create a Tree class object with a root node with id 0
	 */
	public Tree() {
		this.addNode();
		this.addPremise();
	}
	
	/**
	 * Create a new node and make it the child of the node of the provided id.
	 * @param nodeID: The id of the node to branch from
	 * @effect: Create a new node with a new ID that is the child of node to branch from.
	 * 			If id given was a deleted node, no new node is made.
	 * 			The new node will contain one blank formula.
	 * @raise: Throws IndexOutOfRangeException if the id is less then zero or greater then the number
	 * of nodes
	 * 
	 */
	public void branch(int nodeID) {
		TreeNode branchFrom = nodes.get(nodeID);
		if (branchFrom != null) {
			TreeNode node = this.addNode();
			branchFrom.addChild(node);		
		}
	}
	
	/**
	 * Helper function that adds a node to the tree with a blank formula.
	 * @return: Returns the tree node added
	 */
	private TreeNode addNode() {
		TreeNode node = new TreeNode(this.nodes.size());
		nodes.add(node);
		this.addBlankFormula(this.nodes.size() - 1);
		return node;
	}
	
	
	/**
	 * Add a blank formula to the given node.
	 * @param id: The id of the node to add a blank formula for.
	 * @effect: Create a blank formula and add it to the given node
	 * @raise: Throws IndexOutOfRangeException if the id is less then zero or greater then the number
	 * of nodes
	 */
	public void addBlankFormula(int nodeID) {
		TreeNode node = nodes.get(nodeID);
		LogicFormula f = new LogicFormula(this.formulas.size());
		node.addFormula(f);
		formulas.add(f);
	}
	
	/**
	 * Add a blank premise formula.
	 * @effect: Add a blank premise formula to the tree
	 */
	public void addPremise() {
		premises.add(new LogicFormula(this.premises.size(), true));
	}
	
	/**
	 * Edit a formula with the given id
	 * @param formulaId: The id of the formula to be edited
	 * @param isPremise: Whether the formula is a premise
	 * @param formula: The new formula to be changed to.
	 */
	public void edit(int formulaId, boolean isPremise, String formula) {
		if (isPremise) {
			LogicFormula premise = premises.get(formulaId);
			premise.edit(formula);
		}
		else {
			LogicFormula f = formulas.get(formulaId);
			f.edit(formula);			
		}
	}
	
	/**
	 * Retrieve the number of nodes in the tree
	 * @returns: Returns the number of nodes in the tree
	 */
	public int getNumberOfNode() {
		return this.nodes.size();
	}
	
	/**
	 * Retrieve the number of formulas in the tree
	 * @returns: Returns the number of formulas in the tree
	 */
	public int getNumberOfFormula() {
		return this.formulas.size();
	}
	
	/**
	 * Retrieve the number of premises in the tree
	 * @returns: Returns the number of premises in the tree
	 */
	public int getNumberOfPremise() {
		return this.premises.size();
	}
	
	/**
	 * Return number of children of a node
	 * @param nodeId: Id of the node to count children from
	 * @returns: Returns the number of children corresponding to the node.
	 */
	public int returnChildrenCount(int nodeId) {
		return this.nodes.get(nodeId).returnChildrenCount();
	}
}
