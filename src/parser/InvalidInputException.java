package parser;

import java.io.*;

/**
 * An exception that is related to the input the user provided. 
 * @author Terry Nguyen
 */

public class InvalidInputException extends Exception{
	private String errorMessage;
	
	/**
	 * Create the exception given an error message.
	 * @param errorMessage: String that explains the error encountered.
	 */
	public InvalidInputException(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	/**
	 * Get the error message
	 * @return: Returns the error message related to the Invalid Input.
	 */
	public String getErrorMessage(){
		return this.errorMessage;
	}
}
