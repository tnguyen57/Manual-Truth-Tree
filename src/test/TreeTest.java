package test;

import static org.junit.Assert.*;

import org.junit.Test;

import backend.Tree;

public class TreeTest {

	@Test
	public void constructorTest() {
		Tree t1 = new Tree();
		assertTrue("The number of nodes in the tree should be 1", t1.getNumberOfNode() == 1);
		assertTrue("The number of formulas in the tree should be 1", t1.getNumberOfFormula() == 1);
		assertTrue("The number of premises in the tree should be 1", t1.getNumberOfPremise() == 1);
	}
	
	@Test
	public void branchTest() {
		Tree t1 = new Tree();
		t1.branch(0);
		assertTrue("The number of nodes in the tree should be 2", t1.getNumberOfNode() == 2);
		assertTrue("The number of formulas in the tree should be 2", t1.getNumberOfFormula() == 2);
		assertTrue("The number of premises in the tree should be 1", t1.getNumberOfPremise() == 1);
		assertTrue("Node 0 should have one child", t1.returnChildrenCount(0) == 1);
	}
	
	@Test
	public void branchTwiceTest() {
		Tree t1 = new Tree();
		t1.branch(0);
		t1.branch(0);
		assertTrue("The number of nodes in the tree should be 3", t1.getNumberOfNode() == 3);
		assertTrue("The number of formulas in the tree should be 3", t1.getNumberOfFormula() == 3);
		assertTrue("The number of premises in the tree should be 1", t1.getNumberOfPremise() == 1);
		assertTrue("Node 0 should have two children", t1.returnChildrenCount(0) == 2);
	}
	
	@Test
	public void moreBranchTest() {
		Tree t1 = new Tree();
		t1.branch(0);
		t1.branch(1);
		assertTrue("The number of nodes in the tree should be 3", t1.getNumberOfNode() == 3);
		assertTrue("The number of formulas in the tree should be 3", t1.getNumberOfFormula() == 3);
		assertTrue("The number of premises in the tree should be 1", t1.getNumberOfPremise() == 1);
		assertTrue("Node 0 should have one child", t1.returnChildrenCount(0) == 1);
		assertTrue("Node 1 should have one child", t1.returnChildrenCount(1) == 1);
	}
	
	@Test
	public void addPremiseTest() {
		Tree t1 = new Tree();
		t1.addPremise();
		assertTrue("The number of premises in the tree should be 2", t1.getNumberOfPremise() == 2);
	}

}
