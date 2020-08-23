/**
 * 
 */
package com.saif.intervew.questions.number;

/**
 * WAP to find the Prime Number
 * 
 * @author 49152
 *
 */
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 7;
		boolean isPrime = checkNumberIsPrime(num);
		if (isPrime)
			System.out.println("The given number " + num + " is a Prime Number");
		else
			System.out.println("The given number " + num + " is not a Prime Number");

	}

	/**
	 * @param num
	 */
	private static boolean checkNumberIsPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;

	}

}
