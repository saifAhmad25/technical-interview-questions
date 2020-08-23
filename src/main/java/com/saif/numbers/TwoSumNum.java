/**
 * 
 */
package com.saif.numbers;

/**
 * WAP to Two sum number
 * <p>
 * The sum of two number is equal target number note the indexes should not be the
 * same it must be different to each other
 * 
 * @author 49152
 *
 */
public class TwoSumNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = new int[] { 1, 3, 4, 2 };
		int target = 6;

		// Call below method to find the sum of number equal target
		// If found return the index of that sum numbers
		int[] sumIndexs = twoSum(array, target);
		for (int i = 0; i < sumIndexs.length; i++) {
			System.out.println("Sum indexs: " + sumIndexs[i]);
		}
	}

	/**
	 * This method is use to find the two sum of number 
	 * @param array
	 * @param target
	 * @return indexes of two sum
	 */
	private static int[] twoSum(int[] nums, int target) {
		int[] sumNumIndex = new int[2];
		int lastIndex = nums.length - 1;
		// sum first first and last number order
		for (int i = 0, j = lastIndex; i < nums.length; i++, j--) {
			if ((nums[i] + nums[j]) == target) {
				sumNumIndex[0] = i;
				sumNumIndex[1] = j;
				return sumNumIndex;
			}
		}
		// Step 2 Sum one number to rest of number and so on..
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length; j++) {
				if ((nums[i] + nums[j]) == target && i != j) {
					sumNumIndex[0] = i;
					sumNumIndex[1] = j;
					return sumNumIndex;
				}

			}
		}
		return sumNumIndex;
	}

}
