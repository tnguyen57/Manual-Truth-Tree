package graphic;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import listener.DragListener;

/**
 * The graphical implementation of single node in the truth tree that is draggable.
 * @author nguyet15
 */
public class NodeGraphic extends JPanel{
	protected List<FormulaTextBox> formulas = new ArrayList<FormulaTextBox>();
	protected List<JButton> buttons =  new ArrayList<JButton>();
	
	protected AddFormulaButton addFormula;
	protected JButton branch;
	protected MouseMotionAdapter me;
	
	protected int componentHeight;
	protected int componentWidth;
	protected int borderSize;
	
	/**
	 * Constructor for the NodeGraphic class.
	 * @effect: Create an instance of the NodeGraphic class.
	 */
	public NodeGraphic(){
		this.componentHeight = 25;
		this.borderSize = 10;
		this.componentWidth = 120;
		
		formulas.add(new FormulaTextBox());
		add(formulas.get(0));
		
		addFormula = new AddFormulaButton(this);
		buttons.add(addFormula);
		add(addFormula);
		
		
		branch = new JButton("Branch");
		buttons.add(branch);
		add(branch);
		
		
		setVisible(true);
		setBackground(Color.BLACK);
		setBorder(BorderFactory.createEmptyBorder(borderSize, borderSize, borderSize, borderSize));
		this.resize();
		
		DragListener drag = new DragListener();
		addMouseListener(drag);
		addMouseMotionListener(drag);

	}
	
	/**
	 * Resize the Node to fit the graphics and buttons of the node
	 * @effect: Set the layout and size of the node to fit the buttons and formulas.
	 */
	protected void resize() {
		setLayout(new GridLayout(this.formulas.size() + this.buttons.size(), 1));
		setSize(this.componentWidth + 2 * this.borderSize, this.componentHeight * (this.formulas.size() + this.buttons.size()) + 2 * this.borderSize);
	}
	
	/**
	 * Add a formula bar to the node.
	 * @effects: Add another formula bar to the node above the buttons.
	 */
	public void addFormulaBar() {
		for (int i = 0; i < buttons.size(); i++) {
			this.remove(buttons.get(i));
		}
			
		this.formulas.add(new FormulaTextBox());
		this.add(formulas.get(this.formulas.size() - 1));
		
		for (int i = 0; i < buttons.size(); i++) {
			this.add(buttons.get(i));
		}
		
		this.resize();
		this.revalidate();
		this.repaint();
	}
	
	

}
