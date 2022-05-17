package com.ryder.leetcodepractice.array._0015_ThreeSum

import java.util.*

class Solution {
    fun threeSum(nums: IntArray): List<List<Int?>?> {
        val result: MutableList<List<Int?>?> = arrayListOf()
        val n: Int = nums.size
        if (n < 3) {
            return result
        }
        Arrays.sort(nums)
        for (i in nums.indices) {
            if (nums[i] > 0) {
                return result
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue
            }
            var left = i + 1
            var right = nums.size - 1
            while (right > left) {
                val sum = nums[i] + nums[left] + nums[right]
                when {
                    sum > 0 -> {
                        right--
                    }
                    sum < 0 -> {
                        left++
                    }
                    else -> {
                        result.add(listOf(nums[i], nums[left], nums[right]))
                        while (right > left && nums[right] == nums[right - 1]) right--
                        while (right > left && nums[left] == nums[left + 1]) left++
                        right--
                        left++
                    }
                }
            }
        }
        return result
    }
}