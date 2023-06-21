package com.ltu.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ltu.Q5MaxSubArray;


public class Q5MaxSubArrayTest {

    @Test
    public void testMaxSubArray() {
        Q5MaxSubArray solution = new Q5MaxSubArray();

        // Test case 1: Regular input with positive numbers
        int[] nums1 = {1, 2, 3, 4, 5};
        int expected1 = 15; // The maximum sum of a subarray is 1 + 2 + 3 + 4 + 5 = 15
        int result1 = solution.maxSubArray(nums1);
        assertEquals(expected1, result1);

        // Test case 2: Regular input with negative numbers
        int[] nums2 = {-2, -3, -4, -1, -2, -1, -5, -3};
        int expected2 = -1; // The maximum sum of a subarray is -1
        int result2 = solution.maxSubArray(nums2);
        assertEquals(expected2, result2);

        // Test case 3: Input with a single number
        int[] nums3 = {5};
        int expected3 = 5; // The maximum sum of a subarray is the single number 5
        int result3 = solution.maxSubArray(nums3);
        assertEquals(expected3, result3);

        // Test case 4: Input with all negative numbers
        int[] nums4 = {-5, -3, -8, -2, -1, -6, -4};
        int expected4 = -1; // The maximum sum of a subarray is -1
        int result4 = solution.maxSubArray(nums4);
        assertEquals(expected4, result4);
    }

    @Test
    public void testMaxProduct2() {
        Q5MaxSubArray solution = new Q5MaxSubArray();

        // Test case 1: Regular input with positive numbers
        int[] nums1 = {2, 3, -2, 4};
        int expected1 = 6; // The maximum product is 2 * 3 = 6
        int result1 = solution.maxProduct2(nums1);
        assertEquals(expected1, result1);

        // Test case 2: Regular input with negative numbers
        int[] nums2 = {-2, 0, -1};
        int expected2 = 0; // The maximum product is 0 (single number 0)
        int result2 = solution.maxProduct2(nums2);
        assertEquals(expected2, result2);

        // Test case 3: Input with a single number
        int[] nums3 = {5};
        int expected3 = 5; // The maximum product is the single number 5
        int result3 = solution.maxProduct2(nums3);
        assertEquals(expected3, result3);

        // Test case 4: Input with multiple positive numbers
        int[] nums4 = {2, 3, 4, 5};
        int expected4 = 120; // The maximum product is 2 * 3 * 4 * 5 = 120
        int result4 = solution.maxProduct2(nums4);
        assertEquals(expected4, result4);

        // Test case 5: Input with multiple negative numbers
        int[] nums5 = {-2, -3, -4, -5};
        int expected5 = 120; // The maximum product is (-2) * (-3) * (-4) * (-5) = 120
        int result5 = solution.maxProduct2(nums5);
        assertEquals(expected5, result5);
    }
}
