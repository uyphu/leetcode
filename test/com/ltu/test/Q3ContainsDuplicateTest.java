package com.ltu.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ltu.Q3ContainsDuplicate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Q3ContainsDuplicateTest {

    @Test
    public void testContainsDuplicate_ContainsDuplicate() {
        Q3ContainsDuplicate q3ContainsDuplicate = new Q3ContainsDuplicate();
        int[] nums = {1, 2, 3, 1};
        boolean expected = true;

        boolean result = q3ContainsDuplicate.containsDuplicate(nums);

        assertEquals(expected, result);
    }

    @Test
    public void testContainsDuplicate_NoDuplicate() {
        Q3ContainsDuplicate q3ContainsDuplicate = new Q3ContainsDuplicate();
        int[] nums = {1, 2, 3, 4};
        boolean expected = false;

        boolean result = q3ContainsDuplicate.containsDuplicate(nums);

        assertEquals(expected, result);
    }

    @Test
    public void testContainsDuplicate_EmptyArray() {
        Q3ContainsDuplicate q3ContainsDuplicate = new Q3ContainsDuplicate();
        int[] nums = {};
        boolean expected = false;

        boolean result = q3ContainsDuplicate.containsDuplicate(nums);

        assertEquals(expected, result);
    }

    @Test
    public void testContainsDuplicate_SingleElement() {
        Q3ContainsDuplicate q3ContainsDuplicate = new Q3ContainsDuplicate();
        int[] nums = {1};
        boolean expected = false;

        boolean result = q3ContainsDuplicate.containsDuplicate(nums);

        assertEquals(expected, result);
    }

    @Test
    public void testContainsDuplicate_DuplicateAtEnd() {
        Q3ContainsDuplicate q3ContainsDuplicate = new Q3ContainsDuplicate();
        int[] nums = {1, 2, 3, 4, 4};
        boolean expected = true;

        boolean result = q3ContainsDuplicate.containsDuplicate(nums);

        assertEquals(expected, result);
    }
}

