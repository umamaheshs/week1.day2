package week1.day2;

import java.util.Arrays;

public class Anagram {
	/*
	 * Pseudo Code
	  
	 *Declare a String 
		String text1 = "stops";
	 *Declare another String
		String text2 = "potss"; 
	 * a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "posts"; 
	
		if(text1.length()==text2.length()) {
			char[] charArray = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray);
			Arrays.sort(charArray2);
		
					if(Arrays.equals(charArray, charArray2))
			{
				System.out.println("Both are Equal");
			}
					else
					{
						System.out.println("Both are not Equal");
					}
		}
		else
		{
			System.out.println("Length does not match");
		}
}
}