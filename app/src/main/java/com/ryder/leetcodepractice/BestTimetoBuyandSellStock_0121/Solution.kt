package com.ryder.leetcodepractice.BestTimetoBuyandSellStock_0121

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var res = 0
        var mi = prices[0]
        for (i in 1 until prices.size) {
            res = Math.max(res, prices[i] - mi)
            mi = Math.min(mi, prices[i])
        }
        return res
    }
}