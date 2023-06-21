package com.ltu;

public class Q7Search {
	public int search(int[] nums, int target) {
	    int left = 0;
	    int right = nums.length - 1;

	    while (left <= right) {
	        int mid = left + (right - left) / 2;

	        if (nums[mid] == target) {
	            return mid;
	        }

	        if (nums[left] <= nums[mid]) {
	            // Left half is sorted
	            if (nums[left] <= target && target < nums[mid]) {
	                // Target is in the left half
	                right = mid - 1;
	            } else {
	                // Target is in the right half
	                left = mid + 1;
	            }
	        } else {
	            // Right half is sorted
	            if (nums[mid] < target && target <= nums[right]) {
	                // Target is in the right half
	                left = mid + 1;
	            } else {
	                // Target is in the left half
	                right = mid - 1;
	            }
	        }
	    }

	    return -1; // Target not found
	}

	
	public static void main(String[] args) {
		int[] a = {4,5,6,7,0,1,2};
		Q7Search q7Search = new Q7Search();
		int value = q7Search.search(a, 0);
		System.out.println(value);
		
		value = q7Search.search(a, 8);
		System.out.println(value);
		
		int[] a2 = {4,5,6,7,0,1,2};
		value = q7Search.search(a2, 5);
		System.out.println(value);
		
		int[] a3 = {4,5,6,7,0,1,2};
		value = q7Search.search(a3, 6);
		System.out.println(value);
		
		int[] a4 = {4,5,6,7,0,1,2};
		value = q7Search.search(a4, 3);
		System.out.println(value);
		
		int[] a5 = {1,3,5};
		value = q7Search.search(a5, 2);
		System.out.println(value);
		
		int[] a8 = {4,5,6,7,8,1,2,3};
		value = q7Search.search(a8, 8);
		System.out.println(value);
		
		
	}
}
