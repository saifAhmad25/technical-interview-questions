/**
 * 
 */
package com.saif.string.questions;

/**
 * WAP to Reverse String without using java library
 * 
 * @author 49152
 *
 */
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = "esreveRoTdeeNgnirtS";
		// Call the reverse method
		String reverseStr = reverseString(str);
		System.out.println("The reverse String is: " + reverseStr);

	}

	/**
	 * This method is use to reverse the string 
	 * @param str
	 * @return
	 */
	private static String reverseString(String str) {
		String reverseString = "";
		if (str.length() < 1)
			return "";
		for (int i = str.length() - 1; i >= 0; --i) {
			reverseString += str.charAt(i);

		}
		return reverseString;
	}

}
