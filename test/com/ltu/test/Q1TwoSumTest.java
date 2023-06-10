/**
 * 
 */
package com.ltu.test;

import org.junit.jupiter.api.Test;

import com.ltu.Q1TwoSum;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * The Class Q1TwoSumTest.
 */
public class Q1TwoSumTest {

    /**
	 * Test two sum valid solution.
	 */
    @Test
    public void testTwoSum_ValidSolution() {
        Q1TwoSum q1TwoSum = new Q1TwoSum();
        int[] nums = {2, 4, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 2};

        int[] result = q1TwoSum.twoSum(nums, target);

        assertArrayEquals(expected, result);
    }

    /**
	 * Test two sum no solution.
	 */
    @Test
    public void testTwoSum_NoSolution() {
        Q1TwoSum q1TwoSum = new Q1TwoSum();
        int[] nums = {2, 4, 7, 11, 15};
        int target = 10;
        int[] expected = {}; // or any default value indicating no solution

        int[] result = q1TwoSum.twoSum(nums, target);

        assertArrayEquals(expected, result);
    }

    /**
	 * Test two sum duplicate numbers.
	 */
    @Test
    public void testTwoSum_DuplicateNumbers() {
        Q1TwoSum q1TwoSum = new Q1TwoSum();
        int[] nums = {2, 4, 7, 4, 11, 15};
        int target = 8;
        int[] expected = {1, 3};

        int[] result = q1TwoSum.twoSum(nums, target);

        assertArrayEquals(expected, result);
    }

    /**
	 * Test two sum negative numbers.
	 */
    @Test
    public void testTwoSum_NegativeNumbers() {
        Q1TwoSum q1TwoSum = new Q1TwoSum();
        int[] nums = {-2, 4, 7, 11, -15};
        int target = -11;
        int[] expected = {1, 4};

        int[] result = q1TwoSum.twoSum(nums, target);

        assertArrayEquals(expected, result);
    }

    /**
	 * Test two sum empty array.
	 */
    @Test
    public void testTwoSum_EmptyArray() {
        Q1TwoSum q1TwoSum = new Q1TwoSum();
        int[] nums = {};
        int target = 9;
        int[] expected = {}; // or any default value indicating no solution

        int[] result = q1TwoSum.twoSum(nums, target);

        assertArrayEquals(expected, result);
    }
}

