/**
 * 
 */
package com.saif.intervew.questions.number;

/**
 * @author 49152
 *
 */
public class ThreeSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = new int[] {30, -40, 20, -10,40, 0, 10,5};
		
		System.out.println("Three sum equal zeor: "+ callculateThreeSum(array));

	}

	private static int callculateThreeSum(int[] array) {
		int length = array.length;
		int count = 0;
		for (int i = 0; i < length; i++) {
			for (int j = i+1; j < length; j++) {
				for (int k = j+1; k < length; k++) {
					if(array[i] + array[j] + array[k] == 0) {
						count++;
					}
				}
			}
		}
		return count;
		
	}

}
