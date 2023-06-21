package com.ltu.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.ltu.Q8ThreeSum;

class Q8ThreeSumTest {

	@Test
    public void testThreeSum() {
        Q8ThreeSum solution = new Q8ThreeSum();

        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected1 = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> result1 = solution.threeSum3(nums1);
        Assertions.assertEquals(expected1, result1);

        int[] nums2 = {1, 2, 3, 4, 5};
        List<List<Integer>> expected2 = Collections.emptyList();
        List<List<Integer>> result2 = solution.threeSum3(nums2);
        Assertions.assertEquals(expected2, result2);

        int[] nums3 = {-1, -2, -3, -4, -5};
        List<List<Integer>> expected3 = Collections.emptyList();
        List<List<Integer>> result3 = solution.threeSum3(nums3);
        Assertions.assertEquals(expected3, result3);
    }

}
