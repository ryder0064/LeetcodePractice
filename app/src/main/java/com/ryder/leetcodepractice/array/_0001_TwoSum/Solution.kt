package com.ryder.leetcodepractice.array._0001_TwoSum

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray? {
        val res = IntArray(2)
        val map: MutableMap<Int, Int> = HashMap()
        for (i in nums.indices) {
            val temp = target - nums[i]
            if (map.containsKey(temp)) {
                res[1] = i
                res[0] = map[temp]!!
                return res
            }
            map[nums[i]] = i
        }
        return null
    }
}