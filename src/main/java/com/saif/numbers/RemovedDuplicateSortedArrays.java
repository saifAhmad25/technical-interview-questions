/**
 * 
 */
package com.saif.numbers;

/**
 * @author 49152
 *
 */
public class RemovedDuplicateSortedArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arrays = new int[] {1};
		int n = removeDuplicates(arrays);
		System.out.println("Length:"+ n + " Arrays:"+ arrays[n]);

	}
	
	 public static int removeDuplicates(int[] nums) {
		 int k = 0;
	        if(nums.length < 1){
	            return 0;
	        }
	        for(int i = 0; i< nums.length -1; i++){
	            if(nums[i] != nums[i+1]){
	               nums[k++] = nums[i];
	            }
	        }
	        nums[k++] = nums[nums.length -1];
	        for (int i = 0; i < k; i++) {
				System.out.println(nums[k]);
			}
	        return k;
	    }

}
