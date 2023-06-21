package com.ltu.test;

import org.junit.jupiter.api.Test;

import com.ltu.Q2BestSellStock;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Q2BestSellStockTest {

    @Test
    public void testMaxProfit() {
        Q2BestSellStock q2BestSellStock = new Q2BestSellStock();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expected = 5;

        int result = q2BestSellStock.maxProfit(prices);

        assertEquals(expected, result);
    }

    @Test
    public void testMaxProfit_NoProfit() {
        Q2BestSellStock q2BestSellStock = new Q2BestSellStock();
        int[] prices = {7, 6, 4, 3, 1};
        int expected = 0;

        int result = q2BestSellStock.maxProfit(prices);

        assertEquals(expected, result);
    }

    @Test
    public void testMaxProfit_EmptyArray() {
        Q2BestSellStock q2BestSellStock = new Q2BestSellStock();
        int[] prices = {};
        int expected = 0;

        int result = q2BestSellStock.maxProfit(prices);

        assertEquals(expected, result);
    }

    @Test
    public void testMaxProfit_AllIncreasingPrices() {
        Q2BestSellStock q2BestSellStock = new Q2BestSellStock();
        int[] prices = {1, 2, 3, 4, 5};
        int expected = 4;

        int result = q2BestSellStock.maxProfit(prices);

        assertEquals(expected, result);
    }

    @Test
    public void testMaxProfit_AllDecreasingPrices() {
        Q2BestSellStock q2BestSellStock = new Q2BestSellStock();
        int[] prices = {5, 4, 3, 2, 1};
        int expected = 0;

        int result = q2BestSellStock.maxProfit(prices);

        assertEquals(expected, result);
    }
}

