package test;

import static org.junit.Assert.*;

import org.junit.Test;
import backend.TreeNode;

public class TreeNodeTest {

	@Test
	public void constructorTest() {
	    TreeNode n1 = new TreeNode(0);
	    assertTrue("Id should be 0, but is " + n1.getId() + " instead", n1.getId() == 0);
	    TreeNode n2 = new TreeNode(1, n1);
	    assertTrue("Id should be 1, but is" + n2.getId() + " instead", n2.getId() == 1);
	    assertTrue("n1 should be a parent of n2", n2.checkIfParent(n1));
	    assertTrue("n2 should be a child of n1", n1.checkIfChild(n2));
	}
	
	@Test
	public void addChildTest() {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		assertTrue("n1 add child n2 should return true" ,n1.addChild(n2));
		assertTrue("n2 should be the child of n1", n1.checkIfChild(n2));
		assertTrue("n1 should be the parent of n2", n2.checkIfParent(n1));
		assertTrue("n1 should have 1 child", n1.returnChildrenCount() == 1);
		assertFalse("add child should return false since n2 has a parent already", n1.addChild(n2));
	}
	
	@Test
	public void addParentTest() {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		assertTrue("n2 add parent n1 should return true", n2.addParent(n1));
		assertTrue("n2 should be the child of n1", n1.checkIfChild(n2));
		assertFalse("n1 should not be the child of n2", n2.checkIfChild(n1));
		assertTrue("n1 should be the parent of n2", n2.checkIfParent(n1));
		assertFalse("n2 should not the parent of n1", n1.checkIfParent(n2));
		assertTrue("n1 should have 1 child", n1.returnChildrenCount() == 1);
		assertFalse("add parent should return false since n2 already has a parent", n2.addParent(n1));
		assertTrue("n1 should be the parent of n2", n2.checkIfParent(n1));
	}
	
	@Test
	public void removeChildTest() {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		assertFalse("n2 is not the child yet. Remove Child should return false", n1.removeChild(n2));
		n1.addChild(n2);
		assertTrue("Removing n2 as a child. Should return true.", n1.removeChild(n2));
		assertTrue("n1 should have 0 child", n1.returnChildrenCount() == 0);
		assertFalse("n1 should not be the parent of n2", n2.checkIfParent(n1));
		assertFalse("n2 should not be the child of n1", n1.checkIfChild(n2));
		assertTrue("n2 parent should be null", n2.getParent() == null);
		assertTrue("n2 has no parent. Should be able to be added as a child again",n1.addChild(n2));
	}
	
	@Test
	public void removeFromParentTest() {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		assertFalse("n2 does not have a parent yet. Remove parent should returns false.", n2.removeFromParent());
	    n2.addParent(n1);
	    assertTrue("Removing n1 as n2 parent. Should return true", n2.removeFromParent());
	    assertFalse("n2 should not be the child of n1", n1.checkIfChild(n2));
	    assertFalse("n1 should not be the parent of n2", n2.checkIfParent(n1));
	    assertTrue("n2 parent should be null", n2.getParent() == null);
	    assertTrue("n1 should have 0 child", n1.returnChildrenCount() == 0);   
	}
	
	@Test
	public void multipleChildrenTest() {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		n1.addChild(n2);
		assertTrue("Adding a second child should still return true", n1.addChild(n3));
		assertTrue("n3 should be the child of n1", n1.checkIfChild(n3));
		assertTrue("n3 parent should be n1", n3.checkIfParent(n1));
		assertTrue("n1 should have 2 children", n1.returnChildrenCount() == 2);
		n1.removeChild(n2);
		assertTrue("n3 should be the child of n1", n1.checkIfChild(n3));
		assertTrue("n3 parent should be n1", n3.checkIfParent(n1));
		assertTrue("n1 should have 1 children", n1.returnChildrenCount() == 1);
		n1.removeChild(n3);
		assertTrue("n1 should have 0 children", n1.returnChildrenCount() == 0);
		
	}
	
	

}
