/**
 * 
 */
package com.saif.intervew.questions.number;

/**
 * WAP to determine whether an integer is a palindrome. An integer is a
 * palindrome when it reads the same backward as forward.
 * 
 * @author 49152
 *
 */
public class PalindromNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int palindromNum = -121;
		boolean isPalindrom = checkPalindrome(palindromNum);
		if (isPalindrom) {
			System.out.println("The number " + palindromNum + " is Palindrom ");
		} else {
			System.out.println("The number " + palindromNum + "is not Palindrom ");
		}

	}

	/**
	 * This method is use to check a integer is Palindrome or not
	 * @param palindromNum
	 * @return
	 */
	private static boolean checkPalindrome(int palindromNum) {
		int actualInteger= palindromNum;
		long reverse = 0;
		while (palindromNum != 0) {
			reverse = reverse * 10 + palindromNum % 10;
			palindromNum = palindromNum / 10;
		}
		if (reverse == actualInteger) {
			return true;
		}
		return false;

	}

}
