package com.ryder.leetcodepractice.array._0121_BestTimetoBuyandSellStock

class Solution {
    //[2,7,5,1,3,4]
    fun maxProfit(prices: IntArray): Int {
        var res = 0
        var min = prices[0]
        for (i in 1 until prices.size) {
            res = Math.max(res, prices[i] - min)
            min = Math.min(min, prices[i])
        }
        return res
    }
}