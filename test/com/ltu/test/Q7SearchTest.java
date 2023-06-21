package com.ltu.test;

import org.junit.Test;

import com.ltu.Q7Search;

import static org.junit.Assert.*;

public class Q7SearchTest {

    @Test
    public void testSearch() {
        Q7Search solution = new Q7Search();

        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(4, solution.search(nums1, 0));
        assertEquals(1, solution.search(nums1, 5));
        assertEquals(-1, solution.search(nums1, 3));

        int[] nums2 = {0, 1, 2, 4, 5, 6, 7};
        assertEquals(0, solution.search(nums2, 0));
        assertEquals(4, solution.search(nums2, 5));
        assertEquals(-1, solution.search(nums2, 3));

        int[] nums3 = {1, 2, 3, 4, 5};
        assertEquals(0, solution.search(nums3, 1));
        assertEquals(3, solution.search(nums3, 4));
        assertEquals(-1, solution.search(nums3, 6));

        int[] nums4 = {2, 1};
        assertEquals(1, solution.search(nums4, 1));
        assertEquals(0, solution.search(nums4, 2));
        assertEquals(-1, solution.search(nums4, 3));

        int[] nums5 = {1};
        assertEquals(0, solution.search(nums5, 1));
        assertEquals(-1, solution.search(nums5, 2));
    }
}
