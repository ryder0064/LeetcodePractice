package com.ryder.leetcodepractice.array._0026_RemoveDuplicatesfromSortedArray

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var len = 1
        var i = 0
        while (i < nums.size - 1) {
            while (i < nums.size - 1) {
                if (nums[i] == nums[i + 1]) {
                    i++
                } else {
                    nums[len] = nums[i + 1]
                    len += 1
                    break
                }
            }
            i++
        }
        return len
    }
}