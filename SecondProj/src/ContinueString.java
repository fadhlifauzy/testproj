/**
 * 
 */

/**
 * @author User
 *
 */
public class ContinueString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "This is my text";
		String oldtext = args[0];
		String replace = args [1];
		
		System.out.println("Original Text:" + text);
		System.out.println("New Replace Text:" + text.trim().replace(oldtext, replace).toUpperCase());
		
		
	}

}
