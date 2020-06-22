package graphic;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;


public class NodeGraphic extends JPanel{
	private List<FormulaTextBox> formulas = new ArrayList<FormulaTextBox>();
	//private JButton addFormula;
	private AddFormulaButton addFormula;
	private JButton branch;
	private MouseMotionAdapter me;
	
	private int componentHeight;
	private int componentWidth;
	private int borderSize;
	
	
	public NodeGraphic(){
		this.componentHeight = 25;
		this.borderSize = 10;
		this.componentWidth = 120;
		
		setLayout(new GridLayout(3, 1));
		formulas.add(new FormulaTextBox());
		add(formulas.get(0));
		
		addFormula = new AddFormulaButton(this);
		add(addFormula);
		
		branch = new JButton("Branch");
		add(branch);
		
		
		setVisible(true);
		setBackground(Color.BLACK);
		setBorder(BorderFactory.createEmptyBorder(borderSize, borderSize, borderSize, borderSize));
		this.resize();
		
		DragListener drag = new DragListener();
		addMouseListener(drag);
		addMouseMotionListener(drag);

	}
	
	private void resize() {
		setLayout(new GridLayout(this.formulas.size() + 2, 1));
		setSize(this.componentWidth + 2 * this.borderSize, this.componentHeight * (this.formulas.size() + 2) + 2 * this.borderSize);
	}
	
	public void addFormulaBar() {
		this.remove(addFormula);
		this.remove(branch);
		this.formulas.add(new FormulaTextBox());
		this.add(formulas.get(this.formulas.size() - 1));
		
		this.add(addFormula);
		this.add(branch);
		
		this.resize();
		this.revalidate();
		this.repaint();
		
	}
	
	

}
