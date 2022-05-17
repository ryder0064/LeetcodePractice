package com.ryder.leetcodepractice.array._0217_ContainsDuplicate

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val s: MutableSet<Int> = HashSet()
        for (num in nums) {
            if (s.contains(num)) {
                return true
            }
            s.add(num)
        }
        return false
    }
}