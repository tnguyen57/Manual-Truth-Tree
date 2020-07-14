package backend;

import java.util.ArrayList;
import java.util.List;

import logic.LogicFormula;

/**
 * A node for the tree class, used to store Logic Formulas, children of the node, and the parent of the node.
 * @author nguyet15
 */
public class TreeNode {
	private int id;
	private List<LogicFormula> formulas = new ArrayList<LogicFormula>();
	private List<TreeNode> children = new ArrayList<TreeNode>();
	private TreeNode parent = null;
	
	/**
	 * Create a tree node object with an id of the given id
	 * @param id: The id of the node
	 * @effect: Create a tree node object with the id given
	 */
	public TreeNode(int id) {
		this.id = id;
	}
	
	/**
	 * Create a tree node object with the given id and parent
	 * @param id: The id of the node
	 * @param parent: The parent of the node
	 */
	public TreeNode(int id, TreeNode parent) {
		this.id = id;
		this.addParent(parent);
	}
	
	/**
	 * Add a formula to the node.
	 * @param formula: The formula to be added
	 * @effect: Add the formula to the node
	 * @effect: Mark what node the formula belongs to
	 * @return: Returns true if the formula was added successfully.
	 */
	public boolean addFormula(LogicFormula formula) {
		boolean result = formulas.add(formula);
		if (result) {
			formula.addNode(this);
		}
		return result;
	}
	
	/**
	 * Remove a formula from a node.
	 * @param formula: The formula to be removed
	 * @effect: Remove the formula from the node
	 * @return: Return true if the formula was removed.
	 * 			Return false if the formula was not in the node.
	 */
	public boolean removeFormula(LogicFormula formula) {
		return formulas.remove(formula);
	}
	
	/**
	 * Add a child to the node.
	 * @param: Child is the child node to be added
	 * @effect: If the child node does not have a parent, the current node
	 * 			becomes the parent and the child node is added as a children.
	 * 			No effect if child node has a parent.
	 * @returns: Returns true if the child was added successful,
	 * 			 Returns false if the child already has a parent, or the add failed.
	 */
	public boolean addChild(TreeNode child) {
		if (child.getParent() != null) {
			return false;
		}
		child.parent = this;
		return this.children.add(child);
	}
	
	/**
	 * Add a parent to the node if the node doesn't have a parent.
	 * @param parent: The new parent node
	 * @effect: Change the parent of the node to the new parent if the node has no parent
	 *          Node is added to children of parent.
	 *          No change if the node already has a parent.
	 * @return: Returns true if the node adds the parent successfully.
	 * 			Returns false if the node already has a parent, or the add failed.
	 */
	public boolean addParent(TreeNode parent) {
		if (this.parent == null) {
			return parent.addChild(this);
		}
		return false;
	}
	
	/**
	 * Remove a child node from the current node
	 * @param child: The child to remove
	 * @effect: Remove the child from the node if it exists.
	 * @effect: Child node's parent is removed from it.
	 * @return: Returns true if the child was removed
	 * 			Returns false if the child was not in the node
	 */
	public boolean removeChild(TreeNode child) {
		boolean result = this.children.remove(child);
		if (result) {
			child.parent = null;
		}
		return result;
	}
	
	/**
	 * Remove the child from the parent node
	 * @effect: Parent set to null if parent is removed
	 * @return: Returns true if the remove was successful.
	 * 			Returns false if node does not have a parent/
	 * 		    the remove failed.
	 */
	public boolean removeFromParent() {
		if (this.parent != null) {
			return this.parent.removeChild(this);
		}
		return false;
	}
	
	/**
	 * Returns the id of the node
	 * @return: Return the id of the node
	 */
	public int getId(){
		return this.id;
	}
	
	/**
	 * Set the id of the node
	 * @param id: The new id of the node
	 * @effect: The id of the node is changed to the new one
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Return the parent of the node
	 * @return: Returns the parent of the node
	 */
	public TreeNode getParent() {
		return this.parent;
	}
	
	/**
	 * Returns the children of the node
	 * @return: Returns an unchangeable array of children for the node.
	 */
	public final List<TreeNode> getChildren() {
		return this.children;
	}
	
	/**
	 * Check to see if the child is a children of the node
	 * @param node: The node to be checked.
	 * @return: Returns true if the node is a children of the current node.
	 * 			 Returns false if it is not.
	 */
	public boolean checkIfChild(TreeNode node) {
		for (int i = 0; i < this.children.size(); i++) {
			if (this.children.get(i) == node) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Check to see if a node is the parent of the current node
	 * @param: node: The node to be checked
	 * @return: Returns true if the node is the parent of the current node.
	 */
	public boolean checkIfParent(TreeNode node) {
		return this.parent == node;
	}
	
	/**
	 * Return the number of children for the node
	 * @return: Returns the number of children that the node has
	 */
	public int returnChildrenCount() {
		return this.children.size();
	}
}

