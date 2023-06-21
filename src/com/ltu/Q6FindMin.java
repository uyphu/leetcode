package com.ltu;

public class Q6FindMin {

	public int findMin(int[] nums) {
        int min = nums[0];
        for(int i=0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        return min;
    }
	
	public int findMin2(int[] nums) {
	    int left = 0;
	    int right = nums.length - 1;

	    while (left < right) {
	        int mid = left + (right - left) / 2;

	        if (nums[mid] > nums[right]) {
	            // The minimum element is in the right half
	            left = mid + 1;
	        } else {
	            // The minimum element is in the left half or is the current element
	            right = mid;
	        }
	    }

	    return nums[left];
	}
}
