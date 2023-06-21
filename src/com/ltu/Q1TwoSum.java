/**
 * 
 */
package com.ltu;

import java.util.HashMap;
import java.util.Map;

/**
 * The Class Q1TwoSum.
 *
 * @author uyphu
 */
public class Q1TwoSum {
	
	/**
	 * Two sum.
	 *
	 * @param nums   the nums
	 * @param target the target
	 * @return the int[]
	 */
	public int[] twoSum2(int[] nums, int target) {
        int[] results = new int[2];
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    results[0] = i;
                    results[1] = j;
                    return results;
                }
            }
        }
        return new int[0];
    }
	
	/**
	 * Two sum 2.
	 *
	 * @param nums   the nums
	 * @param target the target
	 * @return the int[]
	 */
	public int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement)) {
	            return new int[] { map.get(complement), i };
	        }
	        map.put(nums[i], i);
	    }
	    return new int[0];
	}

}
