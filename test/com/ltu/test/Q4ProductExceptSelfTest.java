package com.ltu.test;

import org.junit.jupiter.api.Test;

import com.ltu.Q4ProductExceptSelf;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Q4ProductExceptSelfTest {

    @Test
    public void testProductExceptSelf() {
        Q4ProductExceptSelf q4ProductExceptSelf = new Q4ProductExceptSelf();
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};

        int[] result = q4ProductExceptSelf.productExceptSelf(nums);

        assertArrayEquals(expected, result);
    }

//    @Test
//    public void testProductExceptSelf_ZeroElement() {
//        Q4ProductExceptSelf q4ProductExceptSelf = new Q4ProductExceptSelf();
//        int[] nums = {0, 1, 2, 3};
//        int[] expected = {6, 0, 0, 0};
//
//        int[] result = q4ProductExceptSelf.productExceptSelf(nums);
//
//        assertArrayEquals(expected, result);
//    }
//
//    @Test
//    public void testProductExceptSelf_DuplicateElements() {
//        Q4ProductExceptSelf q4ProductExceptSelf = new Q4ProductExceptSelf();
//        int[] nums = {2, 2, 2, 2};
//        int[] expected = {8, 8, 8, 8};
//
//        int[] result = q4ProductExceptSelf.productExceptSelf(nums);
//
//        assertArrayEquals(expected, result);
//    }
//
//    @Test
//    public void testProductExceptSelf_EmptyArray() {
//        Q4ProductExceptSelf q4ProductExceptSelf = new Q4ProductExceptSelf();
//        int[] nums = {};
//        int[] expected = {};
//
//        int[] result = q4ProductExceptSelf.productExceptSelf(nums);
//
//        assertArrayEquals(expected, result);
//    }
//
//    @Test
//    public void testProductExceptSelf_SingleElement() {
//        Q4ProductExceptSelf q4ProductExceptSelf = new Q4ProductExceptSelf();
//        int[] nums = {5};
//        int[] expected = {1};
//
//        int[] result = q4ProductExceptSelf.productExceptSelf(nums);
//
//        assertArrayEquals(expected, result);
//    }
}
