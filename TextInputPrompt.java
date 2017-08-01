package version_01;

/* Add the package entry here
 * If you click on the red X in the left column
 * Eclipse will offer to do this for you.
 */

import java.io.*;

/**
 * This class provides static methods that enable data entry in a variety of
 * formats. For example the <i>getInt</i> method displays a message in the Console 
 * that prompts the user to type in an integer. The prompt will be repeated 
 * until a valid integer is entered. The entered integer is returned
 * to the calling program. Similar methods are available for other data types.
 * 
 * @author Kevan Buckley & Gordon Branson
 * @version 1.3, March 2003, updated June 2009 
 */

public class TextInputPrompt {

	/**
	 *  This class need not (cannot!) be constructed. All its functionality is
	 *  provided through static methods.
	 */

	private TextInputPrompt() {
	}

	/**
	 * Displays the specified prompt and waits for user to type in an integer
	 * and press the Enter key. If the text typed cannot be converted to an 
	 * integer the prompt is redisplayed and the user must enter text again.
	 * 
	 * @param prompt Text to be displayed while waiting for input.
	 * @return The integer the user typed.
	 */

	public static int getInt(String prompt) {
		while(true) {
			System.out.print(prompt);
			try {
				return Integer.parseInt(readLine());
			} catch(Exception e) {      
			}
		}
	}

	/**
	 * Displays the specified prompt and waits for user to type in a double
	 * and press the Enter key. If the text typed cannot be converted to a 
	 * double the prompt is redisplayed and the user must enter text again.
	 * 
	 * @param prompt Text to be displayed while waiting for input.
	 * @return The double the user typed.
	 */

	public static double getDouble(String prompt) {
		while(true) {
			System.out.print(prompt);
			try {
				return Double.parseDouble(readLine());
			} catch(Exception e) {      
			}
		}
	}

	/**
	 * Displays the specified prompt and waits for user to type in a Boolean
	 * value (either <i>true, false, yes</i> or <i>no</i>)
	 * and press the Enter key. If the text typed cannot be recognised as any 
	 * of the above the prompt is redisplayed and the user must enter text again.
	 * 
	 * @param prompt Text to be displayed while waiting for input.
	 * @return The Boolean the user typed or <b>true</b> for yes etc.
	 */

	public static boolean getBoolean(String prompt) {
		boolean valid = false;
		boolean result = false;
		String bool;
		while(!valid) {
			System.out.print(prompt);
			try {
				bool = readLine();
				if((bool.equalsIgnoreCase("yes"))||(bool.equalsIgnoreCase("true"))){
					valid = true;
					result = true;
				}
				if((bool.equalsIgnoreCase("no"))||(bool.equalsIgnoreCase("false"))){
					valid = true;
					result = false;
				}
			} catch(Exception e) {				
			}
		}
		return result;
	}

	/**
	 * Displays the specified prompt and waits for user to type in some text and
	 * press the Enter key.
	 * 
	 * @param prompt Text to be displayed while waiting for input.
	 * @return Returns the text the user typed. 
	 */

	public static String getString(String prompt) {
		System.out.print(prompt);
		try {
			return readLine();
		} catch(Exception e) {      
			return "";
		}   
	}

	/**
	 * Displays a simple prompt and waits for the user to press the Enter key.  
	 */
	public static void pause() {
		System.out.print("Press return to continue");
		try {
			readLine();
		} catch(Exception e) {      
		}   
	}

	private static String readLine() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String result = in.readLine();
		return result;
	}
}
