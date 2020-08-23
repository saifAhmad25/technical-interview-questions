/**
 * 
 */
package com.saif.intervew.questions.number;

/**
 * WAP to find the number is Armstrong number
 * 
 * @author 49152
 *
 */
public class ArmstongNumber {

	private static int totalPowerSum = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 371, 153, 1634, 54748
		int num = 1634;
		// Call method to find the Armstrong number
		boolean isArmstrong = checkArmstrongNumber(num);
		if (isArmstrong)
			System.out.println("Number is Armstrong "+ num);
		else {
			System.out.println("Number is not Armstrong "+ num);
			}
		}

	/**
	 * @param nodeData
	 * @return
	 */
	private static boolean checkArmstrongNumber(int number) {
		int num = number;
		int length = String.valueOf(num).length();
		int[] digitOfNum = new int[length];
		if (num < 0) {
			return false;
		} else {
			for (int i = 0; i < length; i++) {
				digitOfNum[i] = num % 10;
				num = num / 10;
			}
		}
		for (int i = 0; i < digitOfNum.length; i++) {
			totalPowerSum = totalPowerSum + calculatePowerBase(digitOfNum[i], length);
		}
		if (totalPowerSum == number) {
			return true;
		}

		return false;
	}

	/**
	 * @param digit
	 * @param length
	 * @return
	 */
	private static int calculatePowerBase(int base, int nPower) {
		int sumOfPower = 1;
		for (int j = 0; j < nPower; j++) {
			sumOfPower = sumOfPower * base;
		}
		return sumOfPower;

	}

}
