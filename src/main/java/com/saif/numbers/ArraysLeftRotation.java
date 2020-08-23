/**
 * 
 */
package com.saif.numbers;

/**
 * WAP to implement arrays elements rotation
 * @author 49152
 *
 */
public class ArraysLeftRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Inputs 1, 2, 3, 4, 5, 6, 7  (shiftNum = 2)  Output : 3 4 5 6 7 1 2
		// Inputs 1, 2, 3, 4, 5, 6, 7 (shiftNum = 4) Output : 5 6 7 1 2 3 4 
		// 
		int[] intArrays = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int shiftNum = 4;
		
		// Call the method to shift arrays value with shiftNum
		if(shiftNum >=0 && shiftNum <intArrays.length ) {
			int[] rotatedArraysElm = rotateArrysIndexData(intArrays, shiftNum);
			for (int i = 0; i < rotatedArraysElm.length; i++) {
				System.out.print(rotatedArraysElm[i] + " ");
			}
		}
		else {
			System.out.println("Please provide the valid shift value!");
		}
		

	}


	/**
	 * This method is use to rotate or shift arrays elements
	 * @param intArrays
	 * @param shiftNum
	 * @return
	 */
	private static int[] rotateArrysIndexData(int[] intArrays, int shiftNum) {
		int[] tempArrays = new int[intArrays.length];
		int shiftNumIndex = shiftNum;
		int j = 0;
		for (int i = 0; i < intArrays.length; i++) {
			// Check the shift index is less than arrays length
			if (shiftNum < intArrays.length) {
				// Assigned the arrays elements in tempArrays from 0 to shift index  
				tempArrays[i] = intArrays[shiftNumIndex];
				shiftNum++;
				shiftNumIndex++;
			} else {
				// Assigned the arrays elements in tempArrays from shift index to N index 
				tempArrays[i] = intArrays[j];
				j++;

			}
		}

		return tempArrays;

	}

}
