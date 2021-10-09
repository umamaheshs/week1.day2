package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		/*
		 * a) Declare A String value as"madam" b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order d) Add the char into rev e)
		 * Compare the original String with the reversed String, if it is same then
		 * print palinDrome f) Use .equalsIgnoreCase to compare a String
		 */

		String str = "madam";
		String rev = "";

		char[] charArray = str.toCharArray();
		int length = charArray.length;
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + charArray[i];
		}
		if (str.equalsIgnoreCase(rev)) {
			System.out.println("String:" + str + " is a palindrome");
		}
		else {
			System.out.println("String:" + str + " is not a palindrome");
		}
	}

}