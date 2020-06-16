package parser;

import java.lang.String;

/**
 * Parser that help read and interpret a first order logic string.
 * @author Terry Nguyen
 */
public class LogicParser {
	private static String[] CONNECTORS = {"and", "if", "or", "iff"};
	/**
	 * This function takes a string representation of first order logic and tries to parse it 
	 * @param formula
	 * @return: Returns an array of up to three string.
	 * 			The first string is the part of the string before the connector. 
	 * 			The second string is the "connector". 
	 * 			The third string is the part after the connector.
	 * 
	 * Some Example:
	 * "A and B" would return a string array of "A", "and", "B".
	 * "a" would return an array of "a"
	 * "B if A (if A, then B)" would return an array of "A", "if", "B"
	 */
	public static String[] parse(String formula) throws InvalidInputException{
		String[] result = new String[3];
		int firstEndIndex = 0;
		int secondStartIndex = 0;
		
		while (findUnenclosedChar(formula) == -1) {
			if (formula.length() < 2) {
				throw new InvalidInputException("Invalid Parenthesis");
			}
			formula = formula.substring(1, formula.length() - 1);
		}
		
		int offset = findUnenclosedChar(formula);
		String searchFormula = formula.substring(offset);
		
		
		int[] index = findFirstConnectorIndex(searchFormula, CONNECTORS, offset);
		
		if (index[0] == Integer.MAX_VALUE) {
			result[1] = "None";
			result[0] = formula;
			return result;
		}
		
		result[0] = formula.substring(0, index[0]);
		result[1] = CONNECTORS[index[2]];
		result[2] = formula.substring(index[1], formula.length());
		
		if (result[1].equals("if")) {
			String tmp = result[0];
			result[0] = result[2];
			result[2] = tmp;
		}
		return result;
	}
	
	/**
	 * A small helper function for the parser. This function will find the index of
	 * the first character in a string not enclosed within a parenthesis.
	 * @param formula: The string to be processed
	 * @return: Return an index of the first character not enclosed by a parenthesis. Return -1
	 * 			if no such character is found.
	 */
	private static int findUnenclosedChar(String formula) {
		int openCount = 0;
		for (int i = 0; i < formula.length(); i++) {
			if (formula.charAt(i) == '(') {
				openCount++;
			}
			else if (formula.charAt(i) == ')') {
				openCount--;
			}
			else if (openCount == 0) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * A small helper function to find the first instance of a connector in a string
	 * @param formula: The string to be processed
	 * @param connectors: An array of possible connectors
	 * @param offset: An offset added 
	 * @returns : The first int corresponds to the index of the space before the connector.
	 * 			  The second int corresponds to the index of the character after the connector.
	 * 			  The third int corresponds to the index of the connector.
	 *            If no connector is found, returns the max integer.
	 */
	private static int[] findFirstConnectorIndex(String formula, String[] connectors, int offset) {
		int[] result = new int[3];
		result[0] = Integer.MAX_VALUE;
		for (int counter = 0; counter < connectors.length; counter++) {
			String connector = " " + connectors[counter] + " ";
			int connectorIndex = formula.indexOf(connector);
			if (connectorIndex != -1 && connectorIndex < result[0]) {
				result[0] = formula.indexOf(connector) + offset;
				result[1] = result[0] + connector.length();
				result[2] = counter;
			}
		}
		return result;
	}
}
