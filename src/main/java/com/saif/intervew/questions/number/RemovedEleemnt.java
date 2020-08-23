/**
 * 
 */
package com.saif.intervew.questions.number;

/**
 * @author 49152
 *
 */
public class RemovedEleemnt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arrays = new int[] {3,2,2,3};
		int removeElm= 3;
		int n = removedElemnts(arrays, removeElm);
		System.out.println("Length:"+ n );
		for (int i = 0; i < n ; i++) {
			System.out.print(" "+ arrays[i] );
		}

	}
	
	 /**
	  * This method is use to remove the given element from array
	 * @param nums
	 * @param removeElm
	 * @return
	 */
	public static int removedElemnts(int[] nums, int val) {
	    short k = 0;
        if(nums.length < 1){
            return 0;
        }
        for(int i = 0; i< nums.length; i++){
            if(nums[i] != val){
               nums[k++] = nums[i];
            }
           }
        //nums[k++] = nums[nums.length -1];
        return k;
    }
}
