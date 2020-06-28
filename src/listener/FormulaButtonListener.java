package listener;

import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputAdapter;

import graphic.NodeGraphic;

/**
 * A listener for the Formula Button. Adds a
 * @author nguyet15
 */
public class FormulaButtonListener extends MouseInputAdapter{
	private NodeGraphic node;
	
	/**
	 * Create the FormulaButtonListener class.
	 * @param node: The node the button belongs to.
	 */
	public FormulaButtonListener(NodeGraphic node) {
		this.node = node;
	}
	
	/**
	 * When clicked add a formula text bar to the node.
	 * @effect: Add a non-premise formula text bar to the node the button belongs to.
	 */
	public void mouseClicked(MouseEvent me) {
		this.node.addFormulaBar();
	}
}
