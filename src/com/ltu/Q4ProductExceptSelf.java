package com.ltu;

/**
 * The Class Q4ProductExceptSelf.
 */
public class Q4ProductExceptSelf {
	
	/**
	 * Product except self.
	 *
	 * @param nums the nums
	 * @return the int[]
	 */
	public int[] productExceptSelf1(int[] nums) {
		
		int[] results = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int value = 1;
			for (int j = 0; j < nums.length; j++) {
				if (i != j) {
					value *= nums[j]; 
				}
			}
			results[i] = value;
		}
        return results;
        
    }

	/**
	 * Product except self.
	 *
	 * @param nums the nums
	 * @return the int[]
	 */
	public int[] productExceptSelf(int[] nums) {
		
		int[] results = new int[nums.length];
		int before = 1;
		for (int i = 0; i < nums.length; i++) {
			results[i] = before;
			before *= nums[i];
		}
		int after = 1;
		for (int i = results.length - 1; i >= 0; i--) {
			results[i] *= after;
			after *= nums[i];
		}
        return results;
        
    }
	
}
