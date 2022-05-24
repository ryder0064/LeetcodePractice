package com.ryder.leetcodepractice.array._0011_ContainerWithMostWater

internal class Solution {
    fun maxArea(height: IntArray): Int {
        var i = 0
        var j = height.size - 1
        var res = 0
        while (i < j) {
            val t = (j - i) * Math.min(height[i], height[j])
            res = Math.max(res, t)
            if (height[i] < height[j]) ++i else --j
        }
        return res
    }
}