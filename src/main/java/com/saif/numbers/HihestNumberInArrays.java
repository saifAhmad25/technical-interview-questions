/**
 * 
 */
package com.saif.numbers;

import java.util.Arrays;

/**
 * WAP to find the First highest, second highest and third highest 
 * 
 * @author 49152
 *
 */
public class HihestNumberInArrays {
	private static int count = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Call method to find the highest Number
		// 1, 2, 3, 9, 4, 8, 6, 5, 10
		int[] intArray = new int[] { -2, 1, 0, -6 };
		Arrays.sort(intArray);
		findHighestNumber(intArray);

	}

	/**
	 * @param intArray
	 */
	private static void findHighestNumber(int[] numbersArray) {
		int highestNum = 0;
		int lastIndex = numbersArray.length - 1;
		int index = 0;
		int[] val = new int[3];
		for (int counter = 1; counter < numbersArray.length; counter++, lastIndex--) {
			if (numbersArray[lastIndex - 1] < numbersArray[lastIndex] && count < 3) {
				highestNum = numbersArray[lastIndex];
				val[index++] = highestNum;
				count++;
			}
		}
		if (val.length == 3) {
			System.out.println("The highest number " + val[0]);
			System.out.println("The second highest number " + val[1]);
			System.out.println("The third highest number " + val[2]);

		}

	}

}
