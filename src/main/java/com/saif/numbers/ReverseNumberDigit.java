/**
 * 
 */
package com.saif.numbers;

/**
 * WAP to reverse digits of a number
 * 
 * @author 49152
 *
 */
public class ReverseNumberDigit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 1534236469;

		// Call method to reverse the number digit
		System.out.println("Number before reverse: " + num);
		int reverseNumber = reverseNumberDigit(num);
		System.out.println("Number after reverse: " + reverseNumber);

		int rev = reverse(num);
		System.out.println("Number after reverse: " + rev);

	}

	/**
	 * This method is use to reverse digit of a number
	 * 
	 * @param num
	 * @return
	 */
	private static int reverseNumberDigit(int x) {
		long rev = 0;
		boolean isNegative = x < 0 ? true : false;
		if (isNegative) {
			x = x * -1;
		}
		while (x != 0) {
			rev = rev * 10 + x % 10;
			x = x / 10;
		}
		if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
			return 0;
		}
		return (int) (isNegative ? rev * -1 : rev);
	}

	/**
	 * This method is use to reverse the integer 
	 * @param x
	 * @return
	 */
	public static int reverse(int x) {
		long reverse = 0;
		while (x != 0) {
			reverse = reverse * 10 + x % 10;
			x = x / 10;
		}

		if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
			return 0;
		} else {
			return (int) reverse;
		}
	}

}
