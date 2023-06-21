package com.ltu;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * The Class Q3ContainsDuplicate.
 */
public class Q3ContainsDuplicate {
	
	/**
	 * Contains duplicate 1.
	 *
	 * @param nums the nums
	 * @return true, if successful
	 */
	public boolean containsDuplicate1(int[] nums) {
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j < nums.length; j++) {				
				if (nums[i] == nums[j]) {
					return true;
				}
			}
		}
        return false;
    }

	/**
	 * Contains duplicate.
	 *
	 * @param nums the nums
	 * @return true, if successful
	 */
	public boolean containsDuplicate(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				return true;
			} else {
				map.put(nums[i], i);
			}
		}
        return false;
    }
	
	/**
	 * Contains duplicate 3.
	 *
	 * @param nums the nums
	 * @return true, if successful
	 */
	public static boolean containsDuplicate3(int[] nums) {
	    Set<Integer> set = new HashSet<>();
	    for (int num : nums) {
	        if (set.contains(num)) {
	            return true;
	        }
	        set.add(num);
	    }
	    return false;
	}

}
