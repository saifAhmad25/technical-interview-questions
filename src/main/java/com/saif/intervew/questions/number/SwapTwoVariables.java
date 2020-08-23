/**
 * 
 */
package com.saif.intervew.questions.number;

/**
 * @author 49152
 *
 */
public class SwapTwoVariables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 5, y = 10;
		
		System.out.println("Two variables before swap: "+ x + " "+ y);
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("Two variables after swap: "+ x + " "+ y);
		

	}

}
