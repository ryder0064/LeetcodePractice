package com.ryder.leetcodepractice.array._0053_MaximumSubarray

class Solution {
    //1,-3,4,-1,2,
//    fun maxSubArray(nums: IntArray): Int {
//        if (nums.isEmpty()) {
//            return 0
//        }
//        var res = nums[0]
//        val dp = IntArray(nums.size)
//        dp[0] = nums[0]
//        for (i in 1 until nums.size) {
//            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i])
//            res = if (res > dp[i]) res else dp[i]
//        }
//        return res
//    }

    //3,-4,2,-3,1,
    fun maxSubArray(nums: IntArray): Int {
        if (nums.isEmpty()) {
            return 0
        }
        var f = nums[0]
        var res = nums[0]
        var i = 1
        val n = nums.size
        while (i < n) {
            f = if(f > 0) nums[i] + f else nums[i]
            res = Math.max(res, f)
            i++
        }
        return res
    }
}