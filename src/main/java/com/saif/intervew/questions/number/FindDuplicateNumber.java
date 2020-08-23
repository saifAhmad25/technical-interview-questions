/**
 * 
 */
package com.saif.intervew.questions.number;

/**
 * @author saif.ahmad
 *
 */
public class FindDuplicateNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Find the duplicate number in N size array
		int[] intArray = new int[] { 5, 1, 5, 2, 5, 3, 5, 4 };
		int countChcek = 0;
		for (int i = 0, j = intArray.length - 1; i < intArray.length; i++, --j) {
			int indexNum = intArray[i];
			int endIndex = intArray[j];
			if (indexNum == intArray[endIndex]) {
				System.out.println("Duplicate Number is: " + indexNum);
				countChcek++;
				System.out.println("Count Check: " + countChcek);
				break;

			} else {
				countChcek++;
			}
		}

	}

}
