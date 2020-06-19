package graphic;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;


public class NodeGraphic extends JPanel{
	private List<FormulaTextBox> formulas = new ArrayList<FormulaTextBox>();
	private JButton addFormula;
	private JButton branch;
	
	public NodeGraphic(){
		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		setLayout(new GridLayout(3, 3));
		formulas.add(new FormulaTextBox());
		add(formulas.get(0));
		
		addFormula = new JButton("Add Formula");
		add(addFormula);
		
		branch = new JButton("Branch");
		add(branch);
		
		
		setVisible(true);
		setSize(140, 100);
		setBackground(Color.BLACK);
	}

}
