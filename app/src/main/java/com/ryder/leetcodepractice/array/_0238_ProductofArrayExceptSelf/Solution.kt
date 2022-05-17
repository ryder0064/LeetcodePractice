package com.ryder.leetcodepractice.array._0238_ProductofArrayExceptSelf

internal class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val ans = IntArray(n)
        var i = 0
        var left = 1
        while (i < n) {
            ans[i] = left
            left *= nums[i]
            i++
        }
        i = n - 1
        var right = 1
        while (i >= 0) {
            ans[i] *= right
            right *= nums[i]
            i--
        }
        return ans
    }
}