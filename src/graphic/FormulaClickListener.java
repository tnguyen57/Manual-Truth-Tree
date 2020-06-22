package graphic;

import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputAdapter;

public class FormulaClickListener extends MouseInputAdapter{
	private NodeGraphic node;
	public FormulaClickListener(NodeGraphic node) {
		this.node = node;
	}
	public void mouseClicked(MouseEvent me) {
		this.node.addFormulaBar();
	}
}
