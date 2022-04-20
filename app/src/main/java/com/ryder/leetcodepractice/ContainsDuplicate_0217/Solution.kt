package com.ryder.leetcodepractice.ContainsDuplicate_0217

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