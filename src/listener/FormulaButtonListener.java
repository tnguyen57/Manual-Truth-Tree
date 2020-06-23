package listener;

import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputAdapter;

import graphic.NodeGraphic;

public class FormulaButtonListener extends MouseInputAdapter{
	private NodeGraphic node;
	public FormulaButtonListener(NodeGraphic node) {
		this.node = node;
	}
	public void mouseClicked(MouseEvent me) {
		this.node.addFormulaBar();
	}
}
