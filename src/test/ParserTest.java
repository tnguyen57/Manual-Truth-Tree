package test;

import org.junit.Test;

import junit.framework.TestCase;
import parser.InvalidInputException;
import parser.LogicParser;

public class ParserTest extends TestCase {
	/**
	 * Small helper function that help compare the results returned by the parser. 
	 * @param results: 
	 * @param s1: The string to be compared to result[0]
	 * @param s2: The string to be compared to result[1]
	 * @param s3: The string to be compared to result[2]
	 * @effect: If a string if different then intended, 
	 *             an assertion fails and a message is printed to console.
	 */
	private void testResults(String[] result, String s1, String s2, String s3) {
		assertTrue("result[0] is \""+ result[0] + "\" instead of " + s1, result[0].equals(s1));
		assertTrue("result[1] is \""+ result[1] + "\" instead of " + s2, result[1].equals(s2));
		assertTrue("result[2] is \""+ result[2] + "\" instead of " + s3, result[2].equals(s3));
	}
	
	/**
	 * Helper function to help test the parser. 
	 * @param formula: The formula to be decomposed
	 * @param s1: The expected left value of the decomposition
	 * @param s2: The expected connector
	 * @param s3: The expected right value of the decomposition
	 * @effect: Causes an assertion error if the decomposition is incorrect.
	 */
	private void testParser(String formula, String s1, String s2, String s3) {
		try{
			String[] result = LogicParser.parse(formula);
			testResults(result, s1, s2, s3);
		}
		catch (InvalidInputException e){
			assertTrue("InvalidInputException: "+e.getErrorMessage(), false);	
		}
	}
	
	/** Test if the parser can correctly parse a atomic statement */
	@Test
	public void testAtomic() {
		try{
			String[] result = LogicParser.parse("A");
			assertTrue("The value of result[0] is "+ result[0], result[0].equals("A"));
		}
		catch (InvalidInputException e){
			assertTrue(e.getErrorMessage(), false);	
		}
	}
	
	/** Test if the parser can correctly parse a simple and statement */
	@Test
	public void testSimpleAnd() {
		testParser("Apple and bear", "Apple", "and", "bear");
	}
	
	/** Test if the parser can correctly parse a simple or statement*/
	@Test
	public void testSimpleOr() {
		testParser("cat or Dog", "cat", "or", "Dog");
	}
	
	/** Test if the parser can correctly parse a simple if statement */
	@Test
	public void testSimpleIf() {
		testParser("love if cake", "cake", "if", "love");
	}
	
	/** Test if the parser can correctly parse a simple iff statement */
	@Test
	public void testSimpleIff() {
		testParser("Goose iff Bread", "Goose", "iff", "Bread");
	}
	
	/** Test if the parser can correctly parse a double and statement */
	@Test
	public void testDoubleAnd() {
		testParser("Alien and bar and Cat", "Alien", "and", "bar and Cat");
	}
	
	/** Test if the parser can ignore outer parenthesis */
	@Test
	public void testSimpleOuterParenthesis() {
		testParser("(Cat if Dog)", "Dog", "if", "Cat");
	}
	
	/** Test with more outer parenthesis */
	@Test
	public void testMoreOuterParenthesis() {
		testParser("(((((Cat iff Dog)))))", "Cat", "iff", "Dog");
	}
	
	/** Test with parenthesis use group */
	@Test
	public void testGroupingParenthesis() {
		testParser("(A and B) or C", "(A and B)", "or", "C");
	}
	
	/** Test grouping parenthesis at the begining */
	@Test
	public void testGroupingParenthesis2() {
		testParser("A or (B and C)", "A", "or", "(B and C)");
	}
}
