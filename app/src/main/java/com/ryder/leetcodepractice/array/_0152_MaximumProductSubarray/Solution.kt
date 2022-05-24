package com.ryder.leetcodepractice.array._0152_MaximumProductSubarray

class Solution {
    fun maxProduct(nums: IntArray): Int {
        val n = nums.size
        if (n == 0) {
            return 0
        }
        var dpMax = nums[0]
        var dpMin = nums[0]
        var max = nums[0]
        for (i in 1 until n) {
            //更新 dpMin 的时候需要 dpMax 之前的信息，所以先保存起来
            val preMax = dpMax
            dpMax = Math.max(dpMin * nums[i], Math.max(dpMax * nums[i], nums[i]))
            dpMin = Math.min(dpMin * nums[i], Math.min(preMax * nums[i], nums[i]))
            max = Math.max(max, dpMax)
        }
        return max
    }
}