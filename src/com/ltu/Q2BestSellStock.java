package com.ltu;

/**
 * The Class Q2BestSellStock.
 */
public class Q2BestSellStock {
	
	/**
	 * Max profit 1.
	 *
	 * @param prices the prices
	 * @return the int
	 */
	public int maxProfit1(int[] prices) {
		int max = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			for (int j = i; j < prices.length; j++) {
				int value = prices[j] - prices[i];
				if (value > 0 && value > max) {
					max = value;
				}
			}
		}
        return max;
    }

	/**
	 * Max profit.
	 *
	 * @param prices the prices
	 * @return the int
	 */
	public int maxProfit(int[] prices) {
		int max = 0;
		int tmp = -1;
		for (int i = 0; i < prices.length; i++) {
			if (tmp > prices[i] || tmp == -1) {
				tmp = prices[i];
			} else {
				if (max < (prices[i] - tmp)) {
					max = prices[i] - tmp;
				}
			}
		}
        return max;
    }
}
