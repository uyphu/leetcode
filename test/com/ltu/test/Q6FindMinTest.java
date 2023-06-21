package com.ltu.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ltu.Q6FindMin;

public class Q6FindMinTest {

    @Test
    public void testFindMin() {
        Q6FindMin solution = new Q6FindMin();
        
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(0, solution.findMin(nums1));
        
        int[] nums2 = {0, 1, 2, 4, 5, 6, 7};
        assertEquals(0, solution.findMin(nums2));
        
        int[] nums3 = {1, 2, 3, 4, 5};
        assertEquals(1, solution.findMin(nums3));
        
        int[] nums4 = {2, 1};
        assertEquals(1, solution.findMin(nums4));
        
        int[] nums5 = {1};
        assertEquals(1, solution.findMin(nums5));
    }
    
    @Test
    public void testFindMin2() {
        Q6FindMin solution = new Q6FindMin();
        
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(0, solution.findMin2(nums1));
        
        int[] nums2 = {0, 1, 2, 4, 5, 6, 7};
        assertEquals(0, solution.findMin2(nums2));
        
        int[] nums3 = {1, 2, 3, 4, 5};
        assertEquals(1, solution.findMin2(nums3));
        
        int[] nums4 = {2, 1};
        assertEquals(1, solution.findMin2(nums4));
        
        int[] nums5 = {1};
        assertEquals(1, solution.findMin2(nums5));
    }
}

