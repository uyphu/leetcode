package com.ltu;

public class Q5MaxSubArray {
	
	public int maxSubArray(int[] nums) {
        int maxSum = nums[0];  // Initialize the maximum sum to the first element
			int currentSum = nums[0];  // Initialize the current sum to the first element

			for (int i = 1; i < nums.length; i++) {
					// Choose between extending the current subarray or starting a new subarray
					currentSum = Math.max(nums[i], currentSum + nums[i]);
					// Update the maximum sum if the current sum is greater
					maxSum = Math.max(maxSum, currentSum);
			}

			return maxSum;
    }
	
	public int maxProduct2(int[] nums) {
		
		int current = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if (current == 0) {
                current = nums[i];
            } else {
                current *= nums[i];
            }
            max = Math.max(current, max);
        }
        
        max = Math.max(nums[nums.length - 1], max);
        current = nums[nums.length - 1];
        
        for(int i = nums.length - 2; i >= 0; i--) {
            if (current == 0) {
                current = nums[i];
            } else {
                current *= nums[i];
            }
            max = Math.max(current, max);
        }
        
        return max;
    }
	
	public int maxProduct3(int[] nums) {
        if (nums == null || nums.length == 0) {
        throw new IllegalArgumentException("Input array is empty or null");
    }
    
    int maxProduct = nums[0];
    int currentMax = nums[0];
    int currentMin = nums[0];
    
    for (int i = 1; i < nums.length; i++) {
        // Keep track of the maximum and minimum products
        int temp = currentMax;
        currentMax = Math.max(nums[i], Math.max(nums[i] * currentMax, nums[i] * currentMin));
        currentMin = Math.min(nums[i], Math.min(nums[i] * temp, nums[i] * currentMin));
        
        // Update the maximum product
        maxProduct = Math.max(maxProduct, currentMax);
    }
    
    return maxProduct;
    }
	
	public static void main(String[] args) {
		int[] a = {-2,3,-4};
		Q5MaxSubArray q5MaxSubArray = new Q5MaxSubArray();
		int max = q5MaxSubArray.maxProduct2(a);
		System.out.println(max);
		
		int[] a1 = {2,3,-2,4};
		max = q5MaxSubArray.maxProduct2(a1);
		System.out.println(max);
		
		int[] a2 = {-2,0,-1};
		max = q5MaxSubArray.maxProduct2(a2);
		System.out.println(max);
		
		int[] a3 = {3,-1,4};
		max = q5MaxSubArray.maxProduct2(a3);
		System.out.println(max);
		
		int[] a4 = {2,-5,-2,-4,3};
		max = q5MaxSubArray.maxProduct2(a4);
		System.out.println(max);
		
		
	}
}
